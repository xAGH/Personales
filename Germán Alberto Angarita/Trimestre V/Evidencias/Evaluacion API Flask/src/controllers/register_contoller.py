from flask import request, make_response, jsonify
from flask.views import MethodView
from src.models.user_model import Usuario
from bcrypt import gensalt, hashpw
from src.validators.register_validator import CreateRegisterSchema
from src.utils.db import db
from sqlalchemy.exc import IntegrityError

class RegisterController(MethodView):
    
    def __init__(self):
        self.validator = CreateRegisterSchema()

    def post(self):
        if not request.is_json:
            return make_response(jsonify({
                "status": 400,
                "response": "Envie un formato JSON."
            }), 400)

        content = request.get_json()
        errors = self.validator.validate(content    )

        if errors:
            return make_response(jsonify({
                "status": 400,
                "response": errors
            }), 400)

        try:
            db.session.add(
                Usuario(
                    email = content.get("email"),
                    nombres = content.get("nombres"),
                    apellidos = content.get("apellidos"),
                    password = bytes.decode(hashpw(bytes(content.get("password"), encoding='utf-8'), gensalt()), encoding='utf-8')
                )
            )

            db.session.commit()

            return make_response(jsonify({
                "status": 201,
                "response": "Usuario creado correctamente"
            }), 201)

        except IntegrityError:
            return make_response(jsonify({
                "status": 409,
                "response": "El correo ya se encuentra registrado."
            }), 409)
        
        except Exception as e:
            return make_response(jsonify({
                "status": 400,
                "response": str(e)
            }), 400)
