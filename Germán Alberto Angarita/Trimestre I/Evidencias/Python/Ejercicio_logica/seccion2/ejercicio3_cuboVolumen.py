# Programa que tome el lado de un cubo e imprima su volumen

# Solicirtud de datos
def solicitud():
    lado = int(input("Ingrese el lado del cubo: "))
    return lado

# Cálculo del volumen
def volumen(lado):
    volumen = lado ** 3
    return round(volumen, 2)

# Funcioón encargada de unir y ejecutar las otras funciones
def main():
    lado = solicitud()
    resultado = volumen(lado)
    print(f"El volumen del cubo cuyo lado es {lado} es {resultado}")

main()