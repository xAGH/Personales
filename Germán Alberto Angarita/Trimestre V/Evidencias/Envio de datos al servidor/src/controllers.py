from flask import Flask, make_response, jsonify, request
from flask.views import MethodView

class Ejercicio1Controller(MethodView):
    
    def post(self, domicilio):
        try:
            nombres = request.args['nombres']
            apellidos = request.args['apellidos']
            return make_response(jsonify({
                "a":"Request Accepted, data recibida",
                "domicilio": domicilio,
                "nombres": nombres,
                "apellidos":apellidos
            }), 200)
        
        except:
            return make_response(jsonify({
                "400":"Bad request, se esperan los siguientes datos.",
                "domicilio": "Parametro de ruta",
                "nombres": "Parametro de consulta",
                "apellidos":"Parametro de consulta"
            }), 400)

class Ejercicio2Controller(MethodView):
    
    def post(self, uid, peso):
        try:
            ancho = request.json['ancho']
            alto = request.json['alto']
            return make_response(jsonify({
                "id": uid,
                "peso": peso,
                "ancho": ancho,
                "alto": alto
            }), 200)

        except:
            return make_response(jsonify({
                "400":"Bad request, se esperan los siguientes datos.",
                "id": "Parametro de ruta",
                "peso": "Parametro de ruta",
                "ancho":"JSON",
                "alto": "JSON"
            }), 400)

class Ejercicio3Controller(MethodView):
    
    def delete(self):
        try:
            cc = request.args['cc']
            motivo = request.json['motivo']
            uid = request.headers['uid']
            return make_response(jsonify({
                "cc": cc,
                "motivo": motivo,
                "id": uid
            }), 200)

        except:
            return make_response(jsonify({
                "400":"Bad request, se esperan los siguientes datos.",
                "cc": "Parametro de consulta",
                "motivo": "JSON",
                "id":"Cabeceras"
            }), 400)

class Ejercicio4Controller(MethodView):
    
    def put(self):
        try:
            cc = request.args['cc']
            apellidos = request.json['apellidos']
            domicilio = request.headers['domicilio']
            return make_response(jsonify({
                "cc": cc,
                "apellidos": apellidos,
                "domicilio": domicilio
            }), 200)
        
        except:
            return make_response(jsonify({
                "400":"Bad request, se esperan los siguientes datos.",
                "cc": "Parametro de consulta",
                "apellidos": "JSON",
                "domicilio":"Cebeceras"
            }), 400)

class Ejercicio5Controller(MethodView):
    
    def get(self, cantidad, marca):
        try:
            precio = request.args['precio']
            domicilio = request.headers['domicilio']
            return make_response(jsonify({
                "precio": precio,
                "cantidad": cantidad,
                "marca": marca,
                "domicilio": domicilio
            }), 200)

        except:
            return make_response(jsonify({
                "400":"Bad request, se esperan los siguientes datos.",
                "precio": "Parametro de consulta",
                "cantidad": "Parametro de ruta",
                "marca":"Parametro de ruta",
                "domicilio": "Cabeceras"
            }), 400)
