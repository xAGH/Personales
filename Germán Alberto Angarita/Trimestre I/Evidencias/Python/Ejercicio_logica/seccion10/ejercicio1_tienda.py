# Programa que pide al usuario el nombre de un producto existente en una tienda, luego, que le muestra el precio del producto
# el usuario debe poder elegir de entre por lo menos cinco productos.

# Se descargó e implementó el módulo tabulate para poder tabular los elementos de forma más organizada y agradable a la vista. (Este módulo se tiene que descargar desde consola con 'pip install tabulate')
from tabulate import tabulate

# Definición de los articulos de la tienda que están preestablecidos.
articulos = {1 : ("CELULAR", "$250.000.00"), 2 : ("TELEVISOR", "$900.000.00"), 3: ("CONSOLA", "$1.2000.000.00"),4 :("ESCRITORIO", "$400.000.00"), 5 : ("RELOJ", "$120.000.00")}

# Función para agregar elementos a la tienda.
def registro_articulos(articulos):
    numero_productos = int(input("\n¿Cuantós productos va a ingresar?: "))
    contador = 1
    item = 6

    while contador <= numero_productos:
        nombre = input(f"Ingrese el nombre del artículo #{contador}: ")
        nombre = nombre.upper()
        precio = float(input(f"Ingrese el precio de '{nombre}': $"))
        precio = "$" + '{:,.2f}'.format(precio).replace(",", "@").replace(".", ",").replace("@", ".")
        tupla_temporal = (nombre, precio)
        contador += 1
        articulos[item] = tupla_temporal
        item += 1
    return articulos

# Función que tabula los artículos
def tabulacion(arreglo):
    tabla = tabulate(articulos.values(), 
            headers=['No.', 'Producto', 'Precio ($COP)'], 
            showindex=articulos.keys(), 
            tablefmt='fancy_grid', 
            stralign='right',
            floatfmt='.0f')
    return tabla


# Función que gestiona la compra del producto.
def compra(articulos, tabla):
    seleccion = int(input("Elija el número correspondiente al producto que desea comprar: "))

    if seleccion in articulos:
        compra = articulos.pop(seleccion)
        print(f"\nSe ha comprado {compra} exitosamente")
        return articulos

    else:
        print("\nEl artículo no se encuentra en la tienda, si desea puede agregarlo en el menú principal con la opción 'Agregar artículos a la tienda'")

# Funcioón principal que se encarga de unir y ejecutar las otras funciones.
def main(articulos):
    print("\n==================================")
    print("||Bienvenido a la tienda DevSOft||")
    print("==================================")

    tabla = tabulacion(articulos)

    seleccion = int(input("Ingrese la acción que desea hacer:\n1. Mostrar los productos disponibles.\n2. Agregar artículos a la tienda.\n3. Comprar productos.\n4. Salir.\nAcción: "))
    if seleccion == 1:
        print(f"\nMostrando los artículos disponibles: \n{tabla}")
        return True

    elif seleccion == 2:
        articulos = registro_articulos(articulos)
        print("\nArtículos agregados exitosamente\n")
        return True

    elif seleccion == 3:
        articulos = compra(articulos, tabla)
        return True

    elif seleccion == 4:
        return False
    
    else:
        print("Ingrese una opcíon correcta")
    return True

ejecucion = main(articulos)
while ejecucion:
    main(articulos)