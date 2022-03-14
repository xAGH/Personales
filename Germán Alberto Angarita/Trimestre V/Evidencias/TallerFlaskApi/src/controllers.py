from flask import request, make_response, jsonify
from flask.views import MethodView
from src.validators import RegisterSchema

class RegisterController(MethodView):
    
    def __init__(self):
        self.validator = RegisterSchema()

    def post(self):
        if not request.is_json:
            return make_response(jsonify({
                "status":400,
                "response": "Send a json format."
            }), 400)

        print(request.get_json())
        content = request.get_json()
        if (self.validator.validate(content)):
            print("ji")
        
        return "ok"
