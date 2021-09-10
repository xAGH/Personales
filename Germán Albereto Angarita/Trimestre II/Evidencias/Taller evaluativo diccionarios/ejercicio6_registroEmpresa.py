# En una empresa se requiere un sistema de información que registre sus nuevos usuarios. Cada vez
# que un usuario se registra debe introducir los siguientes datos: documento, nombres, apellidos, edad,
# peso, estatura. Cree un sistema de información que reciba los datos de registro de cada cliente por
# teclado, luego de realizado el registro el sistema debe mostrar al usuario el mensaje “Registro exitoso”. Si
# el usuario desea consultar su registro debe poder hacerlo a través de su documento.

# Se importa la librería tabulate para tabular datos de un diccionario.
from tabulate import tabulate
registro = {}

# Función que añade nuevos usuarios.
def registrar_usuarios(registro):

    print("\n\nREGISTRANDO NUEVO USUARIO...\n\n")
    nombre = input("Nombre: ")
    apellidos = input("Apellidos: ")
    numero_documento = input("Numero de documento: ")
    edad = input("Edad: ")
    peso = input("Peso(kg): ")
    estatura = input("Estatura(cm): ")
    tupla_temporal = (nombre, apellidos, edad, peso, estatura)
    registro[numero_documento] = tupla_temporal

    return registro

# Función que tabula el diccionario.
def tabular(diccionario):
    tabla = tabulate(diccionario.values(), 
            headers=['No. Documento', 'Nombre', 'Apellidos', 'Edad', 'Peso', 'Estatura'], 
            showindex=diccionario.keys(), 
            tablefmt='fancy_grid', 
            stralign='right',
            floatfmt='.0f')
    return tabla


# Función para mostrar usuario por número de documento.
def busqueda(registro):

    numero_busqueda = input("\nNúmero de documento a buscar: ")

    if numero_busqueda in registro:
        diccionario_temporal = {numero_busqueda : registro[numero_busqueda]}
        print("\n\Mostrando la búsqueda:")
        print(tabular(diccionario_temporal))

    else: 
        print("\nNo se ha encontrado ningún usuario con ese número de docuemento, inténtelo de nuevo.\n")


# Función que elimina un valor de acuerdo a su llave.
def eliminar_datos(registro):
    numero_busqueda = input("\nNúmero de documento correspondiente al usuario a eliminar: ")

    if numero_busqueda in registro:
        del registro[numero_busqueda]
        print(f"\nEl usuario con el documento número {numero_busqueda} fue eliminado.\n")
    
    else:
        print("\nNo se ha encontrado ningún usuario con ese número de docuemento, inténtelo de nuevo.\n")


# Función principal encargada de unir y ejecutar las otras funciones, esta funcón se repite constantemente
def main(registro):
    opcion = int(input("""
1. Agregar usuario.
2. Ver usuarios.
3. Buscar usuario.
4. Eliminar Usuario.
5. Salir
Opción: """))

    if opcion == 1:
        registro = registrar_usuarios(registro)
        return True

    elif opcion == 2:
        print(tabular(registro))
        return True
    
    elif opcion == 3: 
        busqueda(registro)
        return True

    elif opcion == 4:
        registro = eliminar_datos(registro)
        return True

    elif opcion == 5:
        print("\nSALIENDO...\n")
        return False

    else:
        print("Opción inválida")
        return True

controlador = main(registro)
while controlador:
    main(registro)