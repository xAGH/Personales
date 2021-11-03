# Programa que toma el valor de un producto e imprime su precio final si éste tiene siempre un descuento del 10%.

# Solicitud del producto
def solicitud_producto():
    producto = input("Ingrese el nombre del producto: ")
    return producto

# Solicitud del valor del producto
def solicitud_valor(nombre):
    valor = int(input(f"Ingrese el valor de '{nombre}': $"))
    return valor

# Cálculo del descuento 
def descuento(valor):
    valor_descuento = valor - (valor * 10 / 100)
    return valor_descuento

# Función principal encargada de unir y gestionar las demás funciones.
def main():
    nombre = solicitud_producto()
    valor = solicitud_valor(nombre)
    aumento_descuento = descuento(valor)
    print(f"El {nombre} tiene un valor con descuento agregado de ${aumento_descuento}")

main()