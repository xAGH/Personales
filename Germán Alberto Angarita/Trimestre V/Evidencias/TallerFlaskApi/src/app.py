from flask import Flask
from src.routes import routes

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
        cls.app.add_url_rule(routes["register"], view_func=routes["register_controller"], methods=["POST"])
        cls.app.add_url_rule(routes["login"], view_func=routes["login_controller"], methods=["POST"])
        cls.app.add_url_rule(routes["productos"], view_func=routes["productos_controller"], methods=["GET"])
        cls.app.add_url_rule(routes["compras"], view_func=routes["compras_controller"], methods=["POST"])
        