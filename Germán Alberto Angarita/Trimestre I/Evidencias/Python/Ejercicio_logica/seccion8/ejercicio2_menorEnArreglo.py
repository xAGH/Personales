# Programa que registra el menor número en una matriz recibida como parámetro de una función.

# Se solicita la matriz
def solicitud():
    matriz = []
    contador = 1
    print("\n\nIngrese los números que va a agregar a la matriz.(Caracter diferente a un número para salir)")

    while True:
        numero = input(f"# {contador}: ")

        if numero.isalpha() or numero.isspace() or numero == "":
            return matriz

        else:
            matriz.append(int(numero))
            contador += 1

# Función que detecta el número menor presente en la matriz
def numero_menor(matriz):
    contador = 0
    for elemento in matriz:
        contador += 1
        if contador == 1:
            menor = elemento
            
        else:
            if elemento < menor:
                menor = elemento
        
    return menor


# Funcioón principal que se encarga de unir y ejecutar las otras funciones, esta función se ejecuta constantemente.
def main():
    lista = solicitud()
    if len(lista) == 0:
        print("\nLa  matriz está vacia")
    
    else:
        menor = numero_menor(lista)
        print("----------------------------------------------------------------------")
        print(f"Matriz: {lista}")
        print(f"\nEl número menor de la matriz es: {menor}")
        print("----------------------------------------------------------------------")

while True:
    main()