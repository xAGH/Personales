from sys import path
from flask import request, redirect, render_template

path.append("Semana 2")

from Validators import validations as validate

class Cliente():
    
    def crear_cliente(self):
        while True:
            nombre = request.form.get('nombres')
            documento = request.form.get('documento')
            email = request.form.get("email")
            password = request.form.get("contrasena")
            saldo = float(input())
            validacion = validate.validar_nombre()
            
            if validacion != True:
                return {False: validacion}

            else:
                pass

cliente = Cliente
print(cliente.crear_cliente())