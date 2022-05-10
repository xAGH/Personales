from src.utils.db import db

class Producto(db.Model):
    uid = db.Column(db.Integer, primary_key=True)
    nombre = db.Column(db.String(200), nullable=False)
    precio = db.Column(db.Numeric, nullable=False)

    def __init__(self, nombre, precio):
        self.nombre = nombre
        self.precio = precio
