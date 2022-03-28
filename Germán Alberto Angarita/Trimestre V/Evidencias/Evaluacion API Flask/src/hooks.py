from flask import request, make_response, jsonify
from os import getenv
from jwt import decode

def verify_token():
    token: str = request.headers.get('Authorization')
    if token:

        try:
            decode(token, getenv("JWT_KEY"), algorithms=["HS256"])
            return True

        except Exception as e:
            return make_response(jsonify({
                "statusCode": 498,
                "response": "El token es inválido",
                "error": str(e)
            }), 498)

    return make_response(jsonify({
            "statusCode": 417,
            "response": "Cabecera inválida, no se encuetra el token de autenticación. (Authorization)"
        }), 417)
