from importlib.metadata import requires
from marshmallow import Schema, fields
from marshmallow import validate

class CreateProductSchema(Schema):
    nombre = fields.Str(required=True, validate=validate.Length(min=1, max=200))
    precio = fields.Integer(required=True, validate=validate.Range(min=0, max_inclusive=1000000))