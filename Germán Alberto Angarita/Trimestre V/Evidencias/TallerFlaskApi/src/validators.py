from marshmallow import Schema, fields, validate

# Esquema de validación de datos.
class RegisterSchema(Schema):
    nombres = fields.String(validate=validate.Length(min=0, max=200), required=True)
    apellidos = fields.String(validate=validate.Length(min=0, max=200), required=True)
    edad = fields.Integer(validate=validate.Range(min_inclusive=18, max_inclusive=120), required=True)
    ciudad = fields.String(validate=validate.Length(min=0, max=100), required=True)
