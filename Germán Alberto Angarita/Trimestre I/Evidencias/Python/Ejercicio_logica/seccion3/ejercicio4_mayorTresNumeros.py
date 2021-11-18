# Programa que recibe tres números y muestre el mayor

# Solicitud de los datos
def numero1():
    n1 = input("\nIngrese el número #1: ")
    return n1

def numero2():
    n2 = input("Ingrese el número #2: ")
    return n2

def numero3():
    n3 = input("Ingrese el número #3: ")
    return n3

# Comprobacion de cuál número es mayor
def comprobacion(n1, n2, n3):
    if n1 > n2 and n2 > n3:
        resultado = "\nEl {} es el mayor, luego el {} y por último el {}".format(n1, n2, n3)
        return resultado

    elif n1 > n2 and n3 > n2 and n1 > n3:
        resultado = "\nEl {} es el mayor, luego el {} y por último el {}".format(n1, n3, n2)
        return resultado
    
    elif n2 > n1 and n1 > n3:
        resultado = "\nEl {} es el mayor, luego el {} y por último el {}".format(n2, n1, n3)
        return resultado

    elif n2 > n1 and n3 > n1 and n2 > n3:
        resultado = "\nEl {} es el mayor, luego el {} y por último el {}".format(n2, n3, n1)
        return resultado

    elif n3 > n1 and n1 > n2:
        resultado = "\nEl {} es el mayor, luego el {} y por último el {}".format(n3, n1, n2)
        return resultado

    elif n3 > n2 and n2 > n1 and n3 > n2:
        resultado = "\nEl {} es el mayor, luego el {} y por último el {}".format(n3, n2, n1)
        return resultado
    
    elif n2 == n3 and n1 > n1:
        resultado = "\nEl {} y el {} son iguales, son mayores que el {}".format(n2, n3, n1)
        return resultado
    
    elif n1 == n2 and n2 > n3:
        resultado = "\nEl {} y el {} son iguales, son mayores que el {}".format(n1, n2, n3)
        return resultado

    elif n3 == n1 and n3 > n2:
        resultado = "\nEl {} y el {} son iguales, son mayores que el {}".format(n3, n1, n2)
        return resultado

    return "\nLos números son iguales"

# Función principal encargada de unir y ejecutar las otras funciones, esta funcón se repite constantemente
def main():
    n1 = numero1()
    n2 = numero2()
    n3 = numero3()
    if n1.isalpha() or n1.isspace() or n1 == ""  or n2.isalpha() or n2.isspace() or n2 == "" or n3.isalpha() or n3.isspace() or n3 == "":
        print("Solo se permiten números")
    else:
        print(comprobacion(n1, n2, n3))
while True:
    main()