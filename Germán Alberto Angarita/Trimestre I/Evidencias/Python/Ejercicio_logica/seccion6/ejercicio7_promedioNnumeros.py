# Programa que calcula el promedio de n números ingresados hasta que se ingrese el 0

# Solicitud de números
def numeros():
    entrada = 1
    lista_numeros = []
    contador = 0
    while entrada != "0":
        entrada = input("\nIngrese un número(0 para salir): ")
        
        if entrada.isalpha() or entrada.isspace() or entrada == "":
            print("\nSolo se permiten números")
            
        else:
            if entrada == "0":
                print("\n--------------------Finalizando--------------------\n")
            
            else:
                lista_numeros.append(int(entrada))
                contador += 1

    return lista_numeros, contador

# Se calcula el promedio
def calculo_promedio(lista, contador):
    numero_anterior = 0
    for i in lista:
        suma = i + numero_anterior
        numero_anterior = suma
    promedio = suma / contador
    return promedio

# Función que llamará a todas las funciones anteriores y las relacionará. Esta función se ejecutará de forma contante.
def main():
    lista, divisor = numeros()
    resultado = calculo_promedio(lista, divisor)
    print(f"El resultado del promedio es {resultado}")

while True:
    main()