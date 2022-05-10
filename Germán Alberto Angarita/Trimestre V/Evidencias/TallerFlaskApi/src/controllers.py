from flask import request, make_response, jsonify
from flask.views import MethodView
from src.validators import RegisterSchema, LoginSchema, ComprasSchema
from src.models import UsersModel, ProductosModel
from os import getenv
import jwt
import bcrypt
from src.hooks import verify_token

class RegisterController(MethodView):
    
    def __init__(self):
        self.validator = RegisterSchema()
        self.model = UsersModel()

    def post(self):
        if not request.is_json:
            return make_response(jsonify({
                "status":400,
                "response": "Envia un formato json."
            }), 400)

        content = request.get_json()
        validation_errors = self.validator.validate(content)

        if len(validation_errors) > 0:
            return make_response(jsonify({
                "status": 406,
                "response": validation_errors
            }), 406)

        registered = self.model.add_user(
            nombres = content.get("nombres"),
            apellidos = content.get("apellidos"),
            edad = content.get("edad"),
            ciudad = content.get("ciudad"),
            email = content.get("email"),
            password = bytes.decode(bcrypt.hashpw(bytes(content.get("password"), encoding='utf-8'), bcrypt.gensalt()), encoding='utf-8')
        )

        if registered:
            return make_response(jsonify({
                "status": 409,
                "response": "El usuario ya está registrado"
            }), 409)

        return make_response(jsonify({
                "status": 201,
                "response": "Usuario registrado satisfactoriamente"
            }), 201)

class LoginController(MethodView):
    
    def __init__(self):
        self.validator = LoginSchema()
        self.model = UsersModel()

    def post(self):
        content = request.args

        if not content:
            return make_response(jsonify({
                "status":400,
                "response": "Envia parametros de consulta."
            }), 400)

        content = {
            "email": request.args.get("email"),
            "password": request.args.get("password")
        }

        validation_errors = self.validator.validate(content)

        if len(validation_errors) > 0:
            return make_response(jsonify({
                "status": 406,
                "response": validation_errors
            }), 406)
        
        find = self.model.find_user(content.get("email"))

        if find[0]:
            user = self.model.get_users(find[1]).get(content.get("email"))
            password = bytes(content.get("password"), encoding='utf-8')
            password_db = bytes(user.get("password"), encoding='utf-8')
            
            if bcrypt.checkpw(password, password_db):
                encoded_jwt = jwt.encode(
                    {"email": content.get("email")},
                    getenv("JWT_KEY"),
                    "HS256"
                )
                return make_response(jsonify({
                    "status": 202,
                    "reponse": "Logueado correctamente.",
                    "token": encoded_jwt
                })), 202

        return make_response(jsonify({
            "status": 422,
            "reponse": "Usuario no registrado.",
        })), 422

class ProductosController(MethodView):
    
    def __init__(self):
        self.model = ProductosModel()

    def get(self):
        productos = self.model.get_products()
        return make_response(jsonify({
            "status":200,
            "response": productos
        }), 200)

class ComprasController(MethodView):

    decorators = [verify_token]

    def __init__(self):
        self.validator = ComprasSchema()
        self.model = ProductosModel()

    def post(self):
        if not request.is_json:
            return make_response(jsonify({
                "status":400,
                "response": "Envia un formato json."
            }), 400)

        content = request.get_json()
        validation_errors = self.validator.validate(content)

        if len(validation_errors) > 0:
            return make_response(jsonify({
                "status": 406,
                "response": validation_errors
            }), 406)

        id_producto = int(content.get("idproducto"))

        if self.model.remove_product(id_producto):
            return make_response(jsonify({
                "status": 200,
                "response": "Compra ok"
            }), 200)

        return make_response(jsonify({
                "status": 400,
                "response": "No hay productos disponibles con ese id"
            }), 400)