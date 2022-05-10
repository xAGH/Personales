from flask import request, make_response, jsonify
from flask.views import MethodView
from src.models.user_model import Usuario
import jwt
from bcrypt import checkpw
from src.validators import login_validator
from os import getenv

class LoginController(MethodView):
    
    def __init__(self):
        self.validator = login_validator.CreateLoginSchema()

    def post(self):
        if not request.is_json:
            return make_response(jsonify({
                "status": 400,
                "response": "Envie un formato JSON."
            }), 400)

        content = request.get_json()

        errors = self.validator.validate(content)

        if errors:
            return make_response(jsonify({
                "status": 400,
                "response": errors
            }), 400)

        usuario = Usuario.query.filter_by(email=content.get('email')).first()

        if not usuario:
            return make_response(jsonify({
                "status": 422,
                "response": "El usuario no está registrado."
            }), 422)

        db_pass = bytes(usuario.password, 'utf8')
        pass_bytes = bytes(content.get("password"), 'utf8')

        if checkpw(pass_bytes, db_pass):
            token = jwt.encode({
                "email": usuario.email
            }, getenv("JWT_KEY"), "HS256")

            return make_response(jsonify({
                "status": 200,
                "response": "Inicio de sesión satisfactorio",
                "token": f"{token}"
            }), 200)

        return make_response(jsonify({
                "status": 402,
                "response": "Contraseña incorrecta"
            }), 402)
