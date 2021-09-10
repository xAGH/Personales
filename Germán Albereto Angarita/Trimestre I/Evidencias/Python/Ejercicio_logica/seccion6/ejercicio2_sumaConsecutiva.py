# Programa que calcula la suma de los primeros n números naturales.

# Solicitud de los datos
def limite():
    numero = input("\nIngrese el número límite de la suma: ")
    return numero

# Suma desde el 1 hasta el número ingresado anteriormente
def suma_numeros(numero):
    numero_anterior = 0
    for i in range(numero+1):
        suma = i + numero_anterior
        numero_anterior = suma
    return suma

# Función que llamará a todas las funciones anteriores y las relacionará. Esta función se ejecutará de forma contante.
def main():
    numero = limite()
    if numero.isdigit():
        resultado = suma_numeros(int(numero))
        print(f"La suma desde el 1 hasta el {numero} es {resultado}")
    
    else:
        print("Solo se permiten números naturales")
while True:
    main()
