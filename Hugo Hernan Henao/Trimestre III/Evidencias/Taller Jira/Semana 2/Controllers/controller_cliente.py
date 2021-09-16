from sys import path

path.append("Semana 2")

from Validators import validations as validate

class Cliente():
    
    def crear_cliente(self):
        while True:
            nombre = input("Ingrese el nombre del cliente: ")
            validate.validar_nombre()
            movil = input(f"Ingrese el número telefónico de {nombre}: ")
            saldo = float(input())

cliente = Cliente
print(cliente.crear_cliente())