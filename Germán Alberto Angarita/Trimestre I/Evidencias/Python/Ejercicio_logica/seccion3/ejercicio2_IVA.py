# Programa que dice si un producto paga IVA o no

# Contenido de productos y respuesta a si pagan IVA o no
def productos():
    lentejas = "\nLas lentejas no pagan IVA\n"
    crema = "\nLa crema si paga IVA\n"
    arroz = "\nLas lentejas no pagan IVA\n"
    vino = "\nLa crema si paga IVA\n"
    return lentejas, crema, arroz, vino

# Se solicitan los datos al usuario
def solicitud():
    print("Productos en inventario:\n-Lentejas\n-Crema\n-Arroz\n-Vino")
    producto = input("Ingrese el producto el cual desea saber si paga IVA o no: ").capitalize()
    return producto

# Se valida y se elige una respuesta según el datyo ingresado por el usuario
def validaciones(producto):
    if producto == "Lentejas":
        resultado = productos()[0]
    elif producto == "Crema":
        resultado = productos()[1]
    elif producto == "Arroz":
        resultado = productos()[2]
    elif producto == "Vino":
        resultado = productos()[3]
    else: 
        resultado = "\nEl producto introducido no se encuentra en el inventario\n"
   print(resultado)

# Función que llamará a todas las funciones anteriores y las relacionará. Esta función se ejecutará de forma contante.
def main():
    producto_solicitado = solicitud()
    salida_datos = validaciones(producto_solicitado)

while True:
    main()
