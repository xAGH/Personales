# Programa que muestra los números naturales de 1 a n.

# Solicitud de datos
def solicitud():
    numero = input("\nIngrese el número límite de la impresión: ")
    return numero

# Proceso de impresión
def impresion(numero):
    if numero == 0:
        print("0")
    else: 
        i = 1
        while i <= numero:
            print(i)
            i += 1

# Función principal encargada de unir y ejecutar las otras funciones, esta funcón se repite constantemente
def main():
    numero = solicitud()
    if numero.isdigit():
        print("\n--------------- INICIO ---------------")
        impresion(int(numero))
        print("--------------- FINAL ---------------")
    
    else:
        print("Solo se aceptan números enteros")

while True:
    main()