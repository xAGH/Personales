# Programa que calcula el promedio de 10 números

# Solicitud de los números
def solicitud():
    lista = []
    for i in range(1,11):
        numero = input(f"Ingrese el número {i}: ")
        if numero.isalpha() or numero.isspace() or numero == "":
            return False
        else: 
            lista.append(int(numero))
    return lista 

# Se calcula el promedio
def suma_total(lista):
    numero_anterior = 0
    for j in lista:
        suma = j + numero_anterior
        numero_anterior = suma
    promedio = suma / 10
    return promedio


# Función principal que ejecutará y unirá las demás funciones, esta función se ejecutará constantemente
def main():
    numeros = solicitud()
    if numeros == False:
        print("Solo se permiten números")
        
    else:
        resultado = suma_total(numeros)
        print(resultado)
        
while True:
    main()

