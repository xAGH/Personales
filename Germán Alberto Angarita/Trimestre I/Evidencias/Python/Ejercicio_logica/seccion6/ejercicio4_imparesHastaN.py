# Programa que muestra los números impares entre 1 y n.

# Solicitud del límmite máximo
def limite():
    numero = input("\nIngrese el número límite: ")
    return numero

# Verificación de los números impares
def impares(numero):
    contador = 0
    for i in range(numero + 1):
        modulo = i % 2
        if modulo == 0:
            print(f"\nEl número {i} es par")
            contador += 1
        if contador == 0:
            print(f"No hay números pares entre el 1 y el {numero}")

# Función que llamará a todas las funciones anteriores y las relacionará. Esta función se ejecutará de forma contante.
def main():
    limite_maximo = limite()
    if limite_maximo.isalpha() or limite_maximo.isspace() or limite_maximo == "":
        print("\nSolo se permiten números")
    
    else: 
        impares(int(limite_maximo))

while True:
    main()