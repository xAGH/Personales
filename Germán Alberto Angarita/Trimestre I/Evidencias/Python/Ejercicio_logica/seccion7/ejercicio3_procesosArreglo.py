# Programa que hace varios procesos dado el arreglo [1, 2, 3, 4, 5, 6].

# Definición del arreglo dado
arreglo = [1, 2, 3, 4, 5, 6]

# Función que itera sobre cada elemento de la lista y lo imprime (Ciclo while).
def impresion_while(arreglo):
    posicion = 0
    while posicion < len(arreglo):
        print(arreglo[posicion])
        posicion += 1
       

# Función que itera sobre cada elemento de la lista y lo imprime (Ciclo for).
def impresion_for(arreglo):
    for elemento in arreglo:
        print(elemento)

# Función que muestra los elementos del arreglo sumados en 1.
def arreglo_mas_uno(arreglo):
    for elemento in arreglo:
        print(elemento + 1)

# Función que copia del arreglo usando el ciclo “for” pero con todos los elementos incrementados en 1.
def copia_arreglo(arreglo):
    arreglo_v2 = []
    for i in arreglo:
        nuevo_numero = i + 1
        arreglo_v2.append(nuevo_numero)
    print(f"El arreglo antiguo es: {arreglo}\nEl arreglo nuevo es: {arreglo_v2}")

# Función que calcula el promedio de todos los elementos del arreglo.
def promedio(arreglo):
    suma = 0
    for elemento in arreglo:
        suma = elemento + suma
    contador = len(arreglo)
    promedio = suma / contador
    print (promedio)

# Función principal encargada de unir y ejecutar las otras funciones, esta funcón se repite constantemente.
def main(arreglo):
    opcion = input("""\nIngrese el proceso a realizar con la lista.
1. Impresión de los elementos (ciclo while).
2. Impresión de los elementos (ciclo for).
3. Impresión de los elementos sumados en 1.
4. Copiar el arreglo con sus elementos sumados en 1.
5. Promedio de los elementos.
Opción: """)
    if opcion.isalpha() or opcion.isspace() or opcion == "":
        print("\n\n!Solo se permiten números del 1 al 5¡\n\n")

    else:
        opcion = int(opcion)
        if opcion == 1:
            return impresion_while(arreglo)
        elif opcion == 2:
            return impresion_for(arreglo)
        elif opcion == 3:
            return arreglo_mas_uno(arreglo)
        elif opcion == 4:
            return copia_arreglo(arreglo)
        elif opcion == 5:
            return promedio(arreglo)
        else:
            print("\nOpción inválida.")
while True:
    main(arreglo)