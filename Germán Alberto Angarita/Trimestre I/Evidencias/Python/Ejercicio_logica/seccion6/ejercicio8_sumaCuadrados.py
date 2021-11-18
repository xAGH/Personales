# Programa que calcula la suma de los cuadrados de los números entre 1 y n.

# Solicitud del parámetro máximo
def parametro_maximo():
    maximo = int(input("Se calculará la suma de los cuadrados entre 1 y n.\nDefina n = "))
    return maximo

# Procedimiento de la suma de los cudrados entre 1 y el número ingresado como parámetro máximo
def suma_cuadrados(limite):
    i = 1
    numero_previo = 0
    while i <= limite:
        suma = numero_previo + i**2
        numero_previo = suma
        i += 1
    return suma

# Función principal encargada de unir y ejecutar las otras funciones, esta funcón se repite constantemente
def main():
    limite = parametro_maximo()
    resultado = suma_cuadrados(limite)
    print(resultado)

while True:
    main()