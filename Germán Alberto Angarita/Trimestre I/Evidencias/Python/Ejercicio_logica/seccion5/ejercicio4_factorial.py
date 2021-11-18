# Programa que calcula el factorial de un número n

# Solicitud de datos 
def solicitud():
    numero = input("Ingrese un número para calcular su factorial: ")

    return numero

# Calcular factorial con el número anteriormente solicitado
def calcular_factorial(numero):
    numero = int(numero)
    if numero == 0:
        resultado = "El factortial del 0 es 0"

    else:
        numero_anterior = 1

        for i in range(1, numero+1):
            factorial = i * numero_anterior
            numero_anterior = factorial
            resultado = "El factorial del {}! es {}.".format(numero, factorial)

    return resultado

# Función principal encargada de unir y ejecutar las otras funciones, esta funcón se repite constantemente
def main():
    numero_ingresado = solicitud()
    if numero_ingresado.isdigit():
        resultado = calcular_factorial(numero_ingresado)
        print(resultado)
    else:
        print("Solo se permiten números enteros")

while True:
    main()