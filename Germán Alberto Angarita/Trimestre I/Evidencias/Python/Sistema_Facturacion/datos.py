# Importamos librería para saber fecha
from datetime import date

# Importamos la librería para saber la hora
import time

# Solicitar nombre
def nombre():
    nombre = input("Ingrese su nombre: ")
    return nombre

# Solicitar correo
def correo():
    correo = input("Ingrese su correo electrónico: ")
    return correo

# Solicitar Fecha
def fecha_hora():
    fecha = date.today() 
    hora = time.strftime("%X")
    return fecha, hora

# Función que controla la cantidad de productos a comprar
def cantidad():
    bandera = True

    while bandera:
        cantidad = int(input("¿Cuántos productos va a comprar?: "))
        if cantidad < 1 or cantidad > 5:
            print("Tiene que comprar mínimo un producto o máximo 5")
        else:
            bandera = False
    return cantidad

# Función para solicitar los nombres de los productos.
def solicitud_productos(cantidad, i = 0):
    productos = []
    while i < cantidad:
        nombre_producto = input("Nombre del producto #{}: ".format(i + 1))
        productos.append(nombre_producto)
        i += 1
    while len(productos) < 6:
        productos.append("Vacio")
    return productos

# Función para solicitar los precios de los productos.
def solicitud_precios(cantidad, IVA = 1.19, i = 0):
    precios = []
    while i < cantidad:
        precio_producto = float(input("Valor del producto #{}: $".format(i + 1)))
        precios.append(precio_producto * IVA)
        i += 1
    while len(precios) < 6:
        precios.append(000)
    return precios

# Función que suma los precios para dar un total
def suma_precios(precios, suma = 0):
    for i in precios:
        suma = suma + i
    return suma
