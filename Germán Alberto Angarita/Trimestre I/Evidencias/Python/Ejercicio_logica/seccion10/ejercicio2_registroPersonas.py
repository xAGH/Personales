# Programa que almacena los documentos y nombres de diez usuarios, donde a cada documento corresponda su respectivo nombre

# Función que agrega los usuarios al diccionario
def agrega():
    registro = {}
    i = 1

    while i <= 10:
        nombre = input(f"Ingrese el nombre #{i}:")
        documento = input(f"Ingrese el número de documento de {nombre}:")
        registro[documento] = nombre
        i += 1
    return registro

# Función que imprime los elementos del diccionario.
def impresion_registro(registro):
    print("Datos ingresados: ")
    for clave in registro:
        print(f"Nombre: {registro[clave]}   Número de documento: {clave}")

# Funcioón principal que se encarga de unir y ejecutar las otras funciones.
def main():
    registro = agrega()
    impresion_registro(registro)

while True:
    main()