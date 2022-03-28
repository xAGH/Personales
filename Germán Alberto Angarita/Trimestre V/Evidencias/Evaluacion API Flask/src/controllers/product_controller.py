from math import prod
from flask import request, make_response, jsonify
from flask.views import MethodView
from src.models.product_model import Producto
from src.validators import product_validator
from src.utils.db import db
from jwt import decode
from os import getenv

class ProductsController(MethodView):
    
    def __init__(self):
        self.validator = product_validator.CreateProductSchema()

    def get(self):
        productos = Producto.query.order_by(Producto.uid).all()
        productos_lista = {}

        for producto in productos:
            productos_lista[producto.uid] = {
                "Nombre": producto.nombre,
                "Precio": producto.precio
            }
        
        return make_response(jsonify({
            "status": 200,
            "response": productos_lista
        }), 200)

    def post(self):
        if not request.is_json:
            return make_response(jsonify({
                "status": 400,
                "response": "Envie un formato JSON."
            }), 400)

        token: str = request.headers.get('Authorization')

        if not token:
            return make_response(jsonify({
                "statusCode": 417,
                "response": "Cabecera inválida, no se encuetra el token de autenticación. (Authorization)"
            }), 417)
            
        try:
            token = decode(token, getenv("JWT_KEY"), algorithms=["HS256"])

        except Exception as e:
            return make_response(jsonify({
                "statusCode": 498,
                "response": "El token es inválido",
                "error": str(e)
            }), 498)

        content = request.get_json()

        errors = self.validator.validate(content)

        if errors:
            return make_response(jsonify({
                "status": 400,
                "response": errors
            }), 400)

        try:
            db.session.add(
                Producto(
                    nombre = content.get("nombre"),
                    precio = content.get("precio"),
                )
            )

            db.session.commit()

            return make_response(jsonify({
                "status": 201,
                "response": "Producto creado correctamente"
            }), 201)
        
        except Exception as e:
            return make_response(jsonify({
                "status": 400,
                "response": str(e)
            }), 400)
