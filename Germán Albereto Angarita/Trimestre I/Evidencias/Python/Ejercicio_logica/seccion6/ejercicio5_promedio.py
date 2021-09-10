# Programa que calcula el promedio de 10 números.

# Solicitud de datos.
def solicitud_numeros():
    i = 1
    lista_numeros = []

    while i <= 10:
        numero = input(f"Ingrese el número #{i}: ")
        if numero.isalpha() or numero.isspace() or numero == "":
            print("Solo se permiten números")
        else:
            lista_numeros.append(int(numero))
            i += 1
    return lista_numeros

# Cálculo del promedio
def procedimiento_promedio(lista):
    j = 0
    numero_anterior = 0
    while j < 10:
        suma = numero_anterior + lista[j]
        numero_anterior = suma
        if j == 9:
            promedio = suma / 10
            return promedio
        j += 1

# Función principal encargada de unir y ejecutar las otras funciones, esta funcón se repite constantemente
def main():
    lista = solicitud_numeros()
    resultado = procedimiento_promedio(lista)
    print(f"El promedio es {round(resultado,2)}") 

while True:
    main()