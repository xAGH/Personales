from flask import Flask
from flask import make_response, jsonify
from src.routes import routes
from src.config import DB

class Aplication:
    @classmethod
    def create_app(cls):
        cls.app = Flask(__name__)
        cls.__configure()
        return cls.app

    @classmethod
    def __configure(cls):
        try:
            # Configuración de la base de datos
            cls.app.config["SQLALCHEMY_DATABASE_URI"] = f'mysql+pymysql://{DB.USER}:{DB.PASSWORD}@{DB.HOST}:{DB.PORT}/{DB.NAME}'
            cls.app.config["SQLALCHEMY_TRACK_MODIFICATIONS"] = False

            # Registro de rutas
            cls.__register_routes()

        except Exception as e:
            return make_response(jsonify({
                "response": "Error iniciando servidor",
                "error": str(e)
            }), 500)

    @classmethod
    def __register_routes(cls):
        # Registro de rutas de autenticacion
        cls.app.add_url_rule(routes["register"], view_func=routes["register_controller"], methods=["POST"])
        cls.app.add_url_rule(routes["login"], view_func=routes["login_controller"], methods=["POST"])

        # Registro de rutas de productos
        cls.app.add_url_rule(routes["productos"], view_func=routes["productos_controller"], methods=["GET", "POST"])