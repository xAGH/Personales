from flask import Flask
from src.routes import auth

class Aplication():

    @classmethod
    def create_app(cls):
        # Creación de instancia de flask
        cls.app = Flask(__name__)
        # Configuración de app.
        cls.__config()
        return cls.app

    @classmethod
    def __config(cls):
        cls.__register_routes()

    @classmethod
    def __register_routes(cls):
        # Registro de rutas
        cls.app.add_url_rule(auth["register"], view_func=auth["register_controller"], methods=["POST"])