from flask import request, make_response, jsonify
from functools import wraps
from os import getenv
from jwt import decode, DecodeError, InvalidTokenError, InvalidKeyError

# Hook para verificar token.
def verify_token(func):
    @wraps(func)
    def wrapped(*args, **kwargs):
        token: str = request.headers.get('Authorization', 'Auth')
        try:
            decode(token, getenv("JWT_KEY"), ["HS256"])
        except:
            return make_response(jsonify({
                "statusCode": 498,
                "message": "Token is missing or invalid"
            }), 498)
        return func(*args, **kwargs)
    return wrapped