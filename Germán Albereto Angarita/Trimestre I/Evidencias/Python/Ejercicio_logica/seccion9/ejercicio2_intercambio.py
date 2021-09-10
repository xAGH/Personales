# Dado los siguientes arreglos arreglo1 = [ ["A", "B", "C"], ["D", "E", "F"], ["G", "H", "I"] ] y arreglo2 = [ ["J", "K", "L"],
# ["M", "N", "O"], ["P", "Q", "R"] ] , se usan ciclos para intercambiar los elementos de los arreglos.

# Función que se encarga de intercambiar los elementos de las listas
def intercambio_arreglo2_arreglo1(arreglo1, arreglo2):
    print(f"\nArreglo #1 original: {arreglo1}")
    for posicion in range(len(arreglo2)):
        lista_temporal = []
        for elemento in arreglo2[posicion]:
            lista_temporal.append(elemento)
        arreglo1.append(lista_temporal)
        arreglo1.pop(0)
    print(f"El nuevo arreglo #1 es {arreglo1}")

# Función que se encarga de intercambiar los elementos de las listas
def intercambio_arreglo1_arreglo2(arreglo1, arreglo2):
    arreglo_1 = [ ["A", "B", "C"], ["D", "E", "F"], ["G", "H", "I"] ] 
    arreglo_2 = [ ["J", "K", "L"], ["M", "N", "O"], ["P", "Q", "R"] ]
    print(f"\nArreglo #2 original: {arreglo2}")
    for posicion in range(len(arreglo1)):
        lista_temporal = []
        for elemento in arreglo1[posicion]:
            lista_temporal.append(elemento)
        arreglo2.append(lista_temporal)
        arreglo2.pop(0)
    print(f"El nuevo arreglo #2 es {arreglo2}\n")  

# # Funcioón principal que se encarga de unir y ejecutar las otras funciones.
def main():
    arreglo_1 = [ ["A", "B", "C"], ["D", "E", "F"], ["G", "H", "I"] ] 
    arreglo_2 = [ ["J", "K", "L"], ["M", "N", "O"], ["P", "Q", "R"] ]
    copia_arreglo = arreglo_1.copy()
    intercambio_arreglo2_arreglo1(arreglo_1, arreglo_2)
    intercambio_arreglo1_arreglo2(copia_arreglo, arreglo_2)
main()