# -*- coding: utf-8 -*-
from flask import Flask, request, jsonify
from flask_cors import CORS

app = Flask(__name__)
CORS(app, resources={r"/*": {"origins": "*"}})


productos = [{"nombre": "Aceite", "precio": 4000},
            {"nombre": "Arroz", "precio": 2000},
            {"nombre": "Peras", "precio": 3000}]



@app.route('/allproducts', methods=['GET'])
def all_products():
    return jsonify({"datos": productos}), 200


@app.route('/product', methods=['GET'])
def product_by_id():
    id = request.args.get('id')
    producto = productos[int(id)]
    return jsonify({"productoInfo": producto}), 200


@app.route('/create', methods=['POST'])
def create_product():
    content = request.get_json()
    nombre = content.get('nombre')
    precio = content.get('precio')
    productos.append({"nombre": nombre, "precio": precio})
    return jsonify({"status": "Producto creado exitosamente"}), 200


@app.route('/formulario', methods=['POST'])
def formulario():
    content = request.get_json()
    email = content['email']
    password = content['password']
    return jsonify({"status": "Login ok", "email": email, "password": password}), 200

if __name__ == '__main__':
    app.run(debug=True, port=5000)
