# Programa que lee los tres ángulos internos de un triángulo y muestra si los ángulos corresponden a un triángulo o no.

# solicitud del primer ángulo
def a1():
    angulo1 = input("\nIngrese el valor del ángulo #1: ")
    return angulo1

# solicitud del segundo ángulo
def a2():
    angulo2 = input("Ingrese el valor del ángulo #2: ")
    return angulo2

# solicitud del tercer ángulo
def a3():
    angulo3 = input("Ingrese el valor del ángulo #3: ")
    return angulo3

# Se procede a hacer la comparación con la suma de los ángulos
def comparacion(ang1, ang2, ang3):
    suma = ang1 + ang2 + ang3
    if suma == 180:
        return "\nLos ángulos ingresados corresponden a un triángulo"
    return "\nLos ángulos ingresados no corresponden a un triángulo"

# Función que llamará a todas las funciones anteriores y las relacionará. Esta función se ejecutará de forma contante.
def main():
    angulo1 = a1()
    angulo2 = a2()
    angulo3 = a3()
    if angulo1.isdigit() and angulo2.isdigit() and angulo3.isdigit():
        
        if int(angulo1) < 1 or int(angulo1) > 178 or int(angulo2) < 0 or int(angulo2) > 178 or int(angulo3) < 0 or int(angulo3) > 178:
            print("\nSolo se permiten valores entre 1 y 178 por cada ángulo")

        else:
                resultado = comparacion(int(angulo1), int(angulo2), int(angulo3))
                print(resultado)
    else:
        print("\nValores fuera de los parámetros")
        
while True:
    main()