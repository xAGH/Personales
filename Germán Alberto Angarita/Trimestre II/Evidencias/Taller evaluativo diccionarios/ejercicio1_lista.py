def a(lista): # Usando ciclo for recorra la lista imprimiendo cada uno de sus elementos.
    for index in range(len(lista)):
        print(lista[index])

def b(lista): # Usando ciclo while recorra la lista imprimiendo cada uno de sus elementos.
    elemento = 0
    while elemento < len(lista):
        print(lista[elemento])
        elemento += 1

def c(lista): # Usando ciclo for recorra la lista imprimiendo cada uno de sus elementos aumentados en 3.
    for index in range(len(lista)):
        print(index + 3) 

def d(lista): # Usando ciclo while recorra la lista imprimiendo cada uno de sus elementos aumentados en 3.
    elemento = 0
    while elemento < len(lista):
        print(lista[elemento] + 3)
        elemento += 1

def e(lista): # Usando ciclo for recorra la lista imprimiendo únicamente los números impares.
    for index in range(len(lista)):
        impar = index % 2
        if impar != 0:
            print(index)

def f(lista): # Usando ciclo while recorra la lista imprimiendo únicamente los números pares.
    elemento = 0
    while elemento < len(lista):
        impar = elemento % 2
        if impar == 0:
            print(elemento)
        elemento += 1

def main():
    lista = [1,2,3,4,5,6,7,8,9,10, 500]
    print("\nEjercicio #1: ")
    a(lista)
    print("\nEjercicio #2: ")
    b(lista)
    print("\nEjercicio #3: ")
    c(lista)
    print("\nEjercicio #4: ")
    d(lista)
    print("\nEjercicio #5: ")
    e(lista)
    print("\nEjercicio #6: ")
    f(lista)
main()