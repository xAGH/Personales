# Programa que imprime los números enteros entre 0 y 100 en orden ascendente y descendente.

def ascendente():
    for i in range(101):
        print(i)

def descendente():
    for i in range(100, -1, -1):
        print(i)

# Función principal encargada de unir y ejecutar las otras funciones, esta funcón se repite constantemente
def main():
    opcion = input("\nElija el orden que desea visualizar:\n1. Orden ascendente.\n2. Orden descente.\nOpción: ")
    if opcion.isdigit():
        if opcion == "1":
            print("\n--------------- INICIO ---------------")
            ascendente()
            print("--------------- FINAL ---------------")

        elif opcion == "2":
            print("\n--------------- INICIO ---------------")
            descendente()
            print("--------------- FINAL ---------------")

    print("\nIngreso una opción fuera de los parámetros")

while True:
    main()
    