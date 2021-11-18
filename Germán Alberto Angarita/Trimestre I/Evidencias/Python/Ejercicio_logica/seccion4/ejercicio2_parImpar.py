# Programa que lee un número y muestra si este es par o impar.

# Se solicitan los datos
def solicitud():
    numero = input("\nIngrese un número: ")
    return numero

# Validación
def validacion(numero):
    modulo = numero % 2
    if modulo == 0:
        return "\nEl número ingresado es par"
    return "\nEl número ingreado es impar"

# Función que llamará a todas las funciones anteriores y las relacionará. Esta función se ejecutará de forma contante.
def main():
    numero = solicitud()
    if numero.isalpha() or numero.isspace() or numero == "":
        print("\nSolo se permite números")
    else:
        resultado = validacion(int(numero))
        print(resultado)
while True:
    main()