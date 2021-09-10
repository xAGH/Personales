# Dado el siguiente arreglo [1, 2, 3, 4, 500, 420, -100] elimine el elemento de índice 4 y a continuación, 
# elimine el último elemento de la lista usando el método pop(si al método pop no se le pasa argumento, 
# eliminará el último elemento de la lista). 
# Agregue el elemento 520 usando el método append. Finalmente, haga una copia “independiente del arreglo”
#  usando el método copy.

arreglo = [1, 2, 3, 4, 500, 420, -100]

def eliminar_con_pop(arreglo):
    print(f"\nEl arreglo original es: {arreglo}")
    print(f"Se ha eliminado el índice 4 que corresponde a: {arreglo.pop(4)}")
    print(f"Se ha eliminado el último elemento correspondiente a: {arreglo.pop()}")
    print(f"El nuevo arreglo es: {arreglo}\n")
    return arreglo

def agregar_elemento(arreglo):

    print(f"\n\nEl arreglo original es: {arreglo}")
    arreglo.append(520)
    print(f"El nuevo arreglo es: {arreglo}")

    copia_arreglo = arreglo.copy()

    print(f"La copia del arreglo es {copia_arreglo}\n")

agregar_elemento(eliminar_con_pop(arreglo))