# Programa que dice si un número x entre 1 y 15 es primo 

# Solicitud de datos 
def solicitud_datos():
    numero = input("\nIngrese el número: ")

    return numero

# Verificación
def  numero_primo(numero):
    contador = 0
    if numero < 1 or numero > 15:
        salida = "\nEl número debe de estar entre 1 y 15"

    elif numero == 1:
        salida = "\nEl número {} es primo".format(numero)

    else:
        for i in range(1, numero+1):
            modulo = numero % i
            if modulo == 0:
                contador += 1
        if contador == 2:
            salida = "\nEl número {} es primo\n".format(numero)
        else:
            salida = "\nEl número {} no es primo, porque tiene {} divisores\n".format(numero, contador)
    return salida

# Función que llamará a todas las funciones anteriores y las relacionará. Esta función se ejecutará de forma contante.
def main():
    dato = solicitud_datos()
    if dato.isalpha() or dato.isspace() or dato == "":
        print ("\nSolo se permiten números")
    else:
        resultado = numero_primo(int(dato))
        print(resultado)

while True:
    main()
