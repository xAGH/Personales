# Programa que lee la edad de un usuario e imprime un mensaje que diga si es mayor de edad o no.

# Función que solicita la edad
def solicitud():
    edad = input("Ingrese su edad: ")
    return edad

# Función que coomprueba si el usuario es mayor de edad o no
def comprobacion(edad):
    if edad < 18:
        return "El usuario no es mayor de edad"
    return "El usuario es mayor de edad"

# Función principal encargada de unir y ejecutar las otras funciones, esta funcón se repite constantemente
def main():
    edad = solicitud()
    if edad.isdigit() and int(edad) > 0 and int(edad) < 200:
        print(comprobacion(int(edad)))
    else: 
        print("Ha ingresado un valor fuera de los pareámetros")
while True:
    main() 