from marshmallow import Schema, fields
from marshmallow import validate

class CreateRegisterSchema(Schema):
    email = fields.Str(required=True, validate=validate.Email())
    nombres = fields.Str(required=True, validate=validate.Length(min=1, max=200))
    apellidos = fields.Str(required=True, validate=validate.Length(min=1, max=200))
    password = fields.Str(required=True, validate=validate.Length(min=8, max=12))
