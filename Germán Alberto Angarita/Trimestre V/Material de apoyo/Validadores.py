# -*- coding: utf-8 -*-
from flask import Flask, jsonify, request
from marshmallow import Schema, fields
from marshmallow import validate, ValidationError






app = Flask(__name__)
#app.secret_key = "my"




class CreateRegisterSchema(Schema):

    nombres = fields.Str(required=True, validate=validate.Length(min=1, max=60))

    apellidos = fields.Str(required=True, validate=validate.Length(min=1, max=60))

    email = fields.Str(required=True, validate=validate.Email())

    edad = fields.Int(required=True, validate=validate.Range(min=12, max=19))

    cc = fields.Str(required=True, validate=validate.Length(min=4, max=15))
    
    fecha = fields.DateTime(required=True)

    estado = fields.Str(required=True, validate=validate.ContainsOnly(['s', 'c']))

    departamento = fields.Str(required=True, validate=lambda departamento : departamento == "quindio" or departamento == "valle")


    


create_register_schema = CreateRegisterSchema()



@app.route('/register', methods=['POST'])
def index():

    content = request.get_json()

    errors = create_register_schema.validate(content)
    if errors:
        return errors, 400
    
    
    return content, 200



app.run(debug = True, port=5000)
