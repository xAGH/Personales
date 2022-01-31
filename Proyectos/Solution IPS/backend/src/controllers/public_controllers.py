from flask import request, make_response, jsonify
from flask.views import MethodView
from src.models import Model

class IndexController(MethodView):

    def __init__(self):
        self.model = Model()

    def get(self):
        return "yes"
