from src.utils.db import db

class Usuario(db.Model):
    email = db.Column(db.String(200), primary_key=True)
    nombres = db.Column(db.String(200), nullable=False)
    apellidos = db.Column(db.String(200), nullable=False)
    password = db.Column(db.String(200), nullable=False)

    def __init__(self, email, nombres, apellidos, password):
        self.email = email
        self.nombres = nombres
        self.apellidos = apellidos
        self.password = password
