# Programa que imprime la longitud de una matriz ingresada

# Se solicita la matriz y se lleva un contador de los elementos de ésta 
def solicitud():
    matriz = []
    contador = 0
    print("\nIngrese los elementos que va a agregar a la matriz.(salir000 para dejar de agregar elementos)")

    while True:
        elemento = input("Ingrese un elemento:  ")

        if elemento == "salir000":
            return matriz, contador

        else:
            matriz.append(elemento)
            contador += 1
    

# Funcioón principal que se encarga de unir y ejecutar las otras funciones, esta función se ejecuta constantemente.
def main():
    matriz, longitud = solicitud()
    print("\nMatriz: ", matriz)
    print("Cantidad de elementos: ", contador)

while True:
    main()