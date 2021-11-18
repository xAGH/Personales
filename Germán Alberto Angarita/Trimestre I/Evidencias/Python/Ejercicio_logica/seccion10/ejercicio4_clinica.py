# Cree un programa que cumpla con los siguientes requerimientos: En una clínica, se requiere un programa
# donde el usuario pueda consultar el día de su cita mediante su documento. La cita debe tener día y fecha. Si el
# usuario consulta, el programa debe mostrarle sus nombres, seguidos del día y hora de su cita. Una vez hecha la
# consulta, el programa le debe mostrar al usuario un mensaje preguntándole si desea cambiar el día ó fecha de su
# cita, de ser así el programa debe realizar tal cambio y mostrarle al usuario que el cambio solicitado ha sido
# exitoso.

# Se importa datetime y time para manejar tiempos y horas actuales con mayor precisión y facilidad.
import datetime  datetetime.datetetime
from datetime import timedelta
from random import randrange
from random import choice
from os import system

registro = {}
fechas = []

# Función que agrega los usuarios al diccionario
def agregar_usuario(registro):
    nombre = input(f"\nIngrese su nombre completo: ")
    documento = input(f"Ingrese su número de documento: ")

    registro[documento] = [nombre, {}]
    print(f"\nSe ha registrado correctamente a: {nombre} con número de documento: {documento}\n")

    return registro

# Función que se encarga de generar fechas para las citas 
def generador_citas(fechas):

    fecha = datetime.now()
    j = 0
    doctores = ["la Dra. Mihaela Leiva", "el Dr. Manolo Velasco", "el Dr. Fabian Calleja", "la Dra. Belen Diallo", "el Dr. Ramiro Toro", "la Dra. Angela Berenguer", "la Dra. Anas Silvestre", "el Dr. Hector Solano"]
    if len(fechas) == 0:
        for i in range(3):
            hora = randrange(6, 10)

            for j in range(3):

                doctor = choice(doctores)
                diferencia = randrange(1, 4)
                minutos = randrange(00, 60)
                hora += diferencia
                fecha_actualizada = fecha + timedelta(days=i)
                fecha_actualizada = fecha_actualizada.strftime('%d / %m / 20%y')
                fecha_disponible = f"{fecha_actualizada} a las {str(hora).zfill(2)}:{str(minutos).zfill(2)} con {doctor}"
                fechas.append(fecha_disponible)

    return fechas

def citas(registro, fechas):

    eleccion = int(input("\n1. Agendar cita.\n2. Consultar citas pendientes.\n3. Cambiar citas pendientes.\n4. Cancelar citas pendientes.\n5. Volver\nOpción: "))

    if str(eleccion).isdigit:

        if eleccion != 5:

            documento_busqueda = input("\nIngrese el número del documento a buscar: ")

            if documento_busqueda in registro:

                if eleccion == 1:
                    return agendar_cita(registro, documento_busqueda, fechas)
                    

                elif eleccion == 2:
                    return consultar_citas(registro, documento_busqueda)

                elif eleccion == 3:
                    return cambiar_citas(registro, documento_busqueda)

                elif eleccion == 4:
                    return cancelar_citas(registro, documento_busqueda)
            
            else:
                system("cls")
                print("\nNo hay coincidencias con el número de documento ingresado. Si no está registrado, puede hacerlo seleccionando la opción #1 del menú principal\n")
                return registro
            
        system("cls")

    else:
        print("\nIngrese una opcón válida\n")
        return registro

# Función para agendar y separar citas.
def agendar_cita(registro, documento_busqueda, fechas):

    contador = 1
    print(f"\n{registro[documento_busqueda][0]}, estas son las citas disponibles: ")
    for i in fechas:
        print(f"{contador}. {i}")
        contador += 1
    print("0. Cancelar")
    eleccion = input("\nIngresa el número relacionado con la fecha deseada: ")

    if eleccion.isdigit():
        if int(eleccion) == 0:
            return registro, 0

        else: 
            elementos = len(fechas) - 1
            if int(eleccion) < elementos and int(eleccion) > 0:

                numero_citas = len(registro[documento_busqueda][1])+1
                cita_programada = fechas.pop(int(eleccion)-1)
                registro[documento_busqueda][1][numero_citas] = cita_programada
                
                return registro, 1

            print("\nIngrese un valor correcto")
            return registro, 0

# Función para consultar citas.
def consultar_citas(registro, documento_busqueda):

    if len(registro[documento_busqueda][1]) == 0:
        print("\nNo tienes citas pendientes\n")
    
    else:
        print(f"\n{registro[documento_busqueda][0]}, estas son tus citas pendientes:") 
        for numero, cita in registro[documento_busqueda][1].items():
            print(f"{numero}. {cita}")
        print("\n")

    return registro


# Función para modificar citas.
def cambiar_citas(registro, documento_busqueda):

    if len(registro[documento_busqueda][1]) == 0:
        print("\nNo tienes citas pendientes\n")
        return registro
    
    else:
        print(f"\n{registro[documento_busqueda][0]}, estas son tus citas pendientes: ") 
        for numero, cita in registro[documento_busqueda][1].items():
            print(f"{numero}. {cita}")
        modificar = int(input("\nSelecciona la cita que quieras cambiar: "))

        if modificar in registro[documento_busqueda][1]:
            print("\nA continuacion verás el listado de citas disponibles. Si no te sirve ninguna, inténtalo de nuevo en otro momento")
            registro, indicador = agendar_cita(registro, documento_busqueda, fechas)
            if indicador == 0:
                return registro

            del registro[documento_busqueda][1][modificar]
            return registro

        
        else:
            print("\nCita ingresada no encontrada en su lista de citas pendientes.\n")
            return registro


# Función para cancelar citas:
def cancelar_citas(registro, documento_busqueda):
    if len(registro[documento_busqueda][1]) == 0:
        print("\nNo tienes citas pendientes\n")
        return registro

    else:
        print(f"\n{registro[documento_busqueda][0]}, estas son tus citas pendientes: ") 
        for numero, cita in registro[documento_busqueda][1].items():
            print(f"{numero}. {cita}")
        eliminar = int(input("\nSelecciona la cita que quieras cancelar: "))

        if eliminar in registro[documento_busqueda][1]:
            
            confirmacion = input(f"¿Estás seguro de cancelar esta cita?(S/N): ").upper()

            if confirmacion == "S":
                del registro[documento_busqueda][1][eliminar]
                print("\nCita cancelada con exito.\n")
                return registro

            print("Cancelando...")
            return registro
        
        else:
            print("\nCita ingresada no encontrada en su lista de citas pendientes.\n")
            return registro


# Funcioón principal que se encarga de unir y ejecutar las otras funciones.
def main(registro, fechas):
    print("\n==================================")
    print("||Bienvenido a la clínica DevSOft||")
    print("==================================\n")

    accion =int(input("Ingresa la acción a realizar:\n1. Registrar usuario.\n2. Opciones con citas de acuerdo a un usuario ya registrado.\n3. Salir.\nAcción: "))

    fechas = generador_citas(fechas)

    if str(accion).isdigit():

        if accion > 0 and accion < 4:

            if accion == 1:
                registro = agregar_usuario(registro)
                return True 
            
            elif accion == 2:
                citas(registro, fechas)
                return True

            elif accion == 3:
                return False
        system("cls")
    print("\nIngrese una opción válida\n")
    return True

ejecucion = main(registro, fechas)
while ejecucion:
    main(registro, fechas)