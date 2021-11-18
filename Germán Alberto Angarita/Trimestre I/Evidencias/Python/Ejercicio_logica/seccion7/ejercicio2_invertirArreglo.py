# Programa que dado un arreglo con los dígitos, ordenados de menor a mayor, los imprime en orden inverso.

def invertir_arreglo():
    arreglo = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    arreglo_inverso = [] 
    posicion = len(arreglo) - 1

    for i in arreglo:
        arreglo_inverso.append(arreglo[posicion])
        posicion -= 1

    print("\nArreglo: ", arreglo)
    print("Arreglo inverso: ", arreglo_inverso, "\n")
invertir_arreglo()