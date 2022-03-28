from marshmallow import Schema, fields
from marshmallow import validate

class CreateLoginSchema(Schema):
    email = fields.Str(required=True, validate=validate.Email())
    password = fields.Str(required=True, validate=validate.Length(min=8, max=12))