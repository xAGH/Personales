from flask import Flask
from src.routes import routes

class Application:

    def create_app():
        app = Flask(__name__)
        app.add_url_rule(routes['ejercicio1'], view_func=routes['ejercicio1_controller'], methods = ["POST"])
        app.add_url_rule(routes['ejercicio2'], view_func=routes['ejercicio2_controller'], methods = ["POST"])
        app.add_url_rule(routes['ejercicio3'], view_func=routes['ejercicio3_controller'], methods = ["DELETE"])
        app.add_url_rule(routes['ejercicio4'], view_func=routes['ejercicio4_controller'], methods = ["PUT"])
        app.add_url_rule(routes['ejercicio5'], view_func=routes['ejercicio5_controller'], methods = ["GET"])
        return app