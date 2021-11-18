# Programa que toma un producto y lo muestra sumado con una IVA del 19%

# Solicitud del producto
def solicitud_producto():
    producto = input("Ingrese el nombre del producto: ")
    return producto

# Solicitud del valor del producto
def solicitud_valor(nombre):
    valor = int(input(f"Ingrese el valor de '{nombre}': $"))
    return valor

# Cálculo del IVA 
def iva(valor):
    valor_final = valor * 19 / 100 + valor
    return valor_final

# Función principal encargada de unir y gestionar las demás funciones.
def main():
    nombre = solicitud_producto()
    valor = solicitud_valor(nombre)
    aumento_iva = iva(valor)
    print(f"El {nombre} tiene un valor con IVA agregado de ${aumento_iva}")

main()