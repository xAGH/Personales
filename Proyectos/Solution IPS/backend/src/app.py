from flask import Flask
from flask import make_response, jsonify
from os import getenv
from flask_cors import CORS
from src.routes import *

class Aplication:
    @classmethod
    def create_app(cls):
        cls.app: Flask = Flask(__name__)
        cls.__settings()
        return cls.app

    @classmethod
    def __settings(cls):
        try:
            cls.__register_routes()
            cls.app.config["SECRET_KEY"] = getenv("SECRET_KEY")
            CORS(cls.app, resources={
               r"/*": {
                   "origins": ["http://localhost:4200", "*"]
               }
            }, supports_credentials=True)

        except Exception as e:
            return make_response(jsonify({
                "response": "Error starting server",
                "error": e
            }), 500)

    @classmethod
    def __register_routes(cls):
        cls.app.add_url_rule(public["index"], view_func=public["index_controller"], )

