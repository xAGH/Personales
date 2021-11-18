""" Programa que dado el arreglo [[1, 2, 3], [4, 5, 6], [7, 8, 9]]:
Itera los elementos en pantalla y los muestra con un ciclo while
Itera los elementos en pantalla y los muestra con un ciclo for
Crear una copia del arreglo con cada elemento sumado en 1
Calclar el promedio de todos los arreglos mediante un ciclo for
"""

# Iteración e impresión de los elementos de las listas con el ciclo while
arreglo = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
def impresion_while(arreglo):
    posicion = 0
    print("\nMostrando la opción 1...")
    mostrar = 1
    while  posicion < len(arreglo):
        elemento = 0
        print(f"Elemento {mostrar}: ", sep="")
        while elemento < len(arreglo[posicion]):
            print(arreglo[posicion][elemento], end="   ")
            elemento += 1
        print("\n")
        posicion += 1
        mostrar += 1

# Iteración e impresión de los elementos de las listas con el ciclo for
def impresion_for(arreglo):
    print("\nMostrando la opción 2...")
    mostrar = 1
    for posicion in range(len(arreglo)):
        print(f"\nElemento {mostrar}: ", end="")
        for elemento in arreglo[posicion]:
            print(elemento, end="   ")
        mostrar += 1

# Copia del arreglo original con todos los elementos sumados en 1
def copia_mas_uno(arreglo):
    print("\nMostrando la opción 3...")
    lista_incremento = []
    for posicion in range(len(arreglo)):
        lista_anidada = []
        for elemento in arreglo[posicion]:
            suma = elemento + 1 
            lista_anidada.append(suma)
        lista_incremento.append(lista_anidada)
    print(lista_incremento)

# Cáclculo del promedio de todos los elementos del arreglo
def promedio_elementos(arreglo):
    print("\nMostrando la opción 4...")
    suma = 0
    contador = 0
    for posicion in range(len(arreglo)):
        for elemento in arreglo[posicion]:
            suma = elemento + suma
            contador += 1
            promedio = suma / contador
    print(promedio)


# Funcioón principal que se encarga de unir y ejecutar las otras funciones, esta función se ejecuta constantemente.
def main(arreglo):
    opcion = input("""\nIngrese el número correspondiente a lo que desee observar:
1. Iteración e impresión de los elementos de las listas con el ciclo while.
2. Iteración e impresión de los elementos de las listas con el ciclo for.
3. Copia del arreglo original con todos los elementos sumados en 1.
4. Cáclculo del promedio de todos los elementos del arreglo.
Opción: """)
    if opcion.isdigit():

        if opcion == "1":
            impresion_while(arreglo)

        elif opcion == "2":
            impresion_for(arreglo)

        elif opcion == "3":
            copia_mas_uno(arreglo)

        elif opcion == "4":
            promedio_elementos(arreglo)

    else:
            print("Ingrese una opción correcta.")

while True:
    main(arreglo)