# Programa que recibe dos números y muestra el mayor. En caso de que los números sean iguales también se debe mostrar al usuario.

# Solicitud de los datos
def numero1():
    n1 = input("\nIngrese el número #1: ")
    return n1

def numero2():
    n2 = input("Ingrese el número #2: ")
    return n2

# Comprobacion de cuál número es mayor
def comprobacion(n1, n2):
    if n1 < n2:
        resultado =  "\nEl {} es mayor que el {}".format(n2, n1)
        return resultado
    elif n1 > n2:
        resultado = "\nEl {} es mayor que el {}".format(n1, n2)
        return resultado

    return "\nLos números son iguales"

# Función principal encargada de unir y ejecutar las otras funciones, esta funcón se repite constantemente
def main():
    n1 = numero1()
    n2 = numero2()
    if n1.isalpha() or n1.isspace() or n1 == "" or n2.isalpha() or n2.isspace() or n2 == "":
        print("Solo se permiten números")
    else:
        print(comprobacion(n1, n2))
while True:
    main()