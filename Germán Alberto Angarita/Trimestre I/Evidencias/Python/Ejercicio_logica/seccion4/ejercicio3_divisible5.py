# Programa que lee un número y muestra si este es divisible entre cinco o no.

# Solicitud de los datos
def solicitud():
    numero = input("\nIngrese el número: ")
    return numero

# Comprobación si el número ingresado es divisible por 5
def divisible(numero):
    modulo = numero % 5
    if modulo == 0:
        resultado = "\nEl número {} es divisible entre 5.".format(numero)
        return resultado
    resultado = "\nEl número {} no es divisible entre 5".format(numero)
    return resultado

# Función que llamará a todas las funciones anteriores y las relacionará. Esta función se ejecutará de forma contante.
def main():
    numero = solicitud()
    if numero.isalpha() or numero.isspace() or numero == "":
        print("\nSolo se permiten números")
    else:
        resultado = divisible(int(numero))
        print(resultado)

while True: 
    main()