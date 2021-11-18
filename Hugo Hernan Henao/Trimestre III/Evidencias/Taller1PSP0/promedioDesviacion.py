# Programa que recibe n cantidad de números reales por medio del teclado, un archivo externo u otro 
# medio indicado por el usuario; estos números los almacena en una lista u otro tipo de almacenamiento 
# de datos o en una base de datos según como indique el usuario. A estos datos se les calculará la 
# media y con ésta, la desviación estándar. El programa debe de ser probado profundamente y al menos 
# dos de sus test deben de utilizar información suministrada en las columnas de la tabla 1 en el archivo 
# taller_psp0.pdf1.

from os import sep, system as sys
import time
from math import sqrt
from mysql import connector as sql
from time import sleep

class Con():

    def __init__(self, database, usuario = 'root', password = 'alejo23001'):
        self.config = {
            'user': usuario,
            'password': password,
            'host': 'localhost',
            'database': database,
            'raise_on_warnings': True
        }

    def open(self):
        self.dbb = sql.connect(**self.config)
        self.cursor = self.dbb.cursor()

    def execute(self, args):
        self.cursor.execute(args)

    def get(self):
        numeros = self.cursor.fetchall()
        return numeros

    def close(self):
        self.dbb.close()

def clean():
    """Función que limpia la pantalla"""
    sys("cls")

def metodo_entrada():
    """Esta función define el método por le cual serán ingresados los números"""
    i = 1
    while i != 0:
        try:
            clean()
            print("Ingrese el número correspondiente al método de lectura de números.")
            eleccion = int(input("1. Entrada por teclado.\n2. Entrada desde archivo externo.\n3. Entrada desde base de datos existente.\n4. Salir.\nElección: "))

            if eleccion in (1,2,3, 4): 
                i = 0
            
            else:
                clean()
                print("Ingresó un valor fuera de los opciones.")
                sleep(1.5)

        except:
            clean()
            print("Ingresó un valor fuera de los opciones.")
            sleep(1.5)

    return eleccion

def entrada_teclado():
    bandera = 0

    while bandera != 1:

        try:
            clean()
            numeros = input("Ingrese los números separados por coma (si son decimales, indique esta parte con un punto: '.'. Valor vacio para volver.): ")
            
            if numeros == "":
                return

            else:
                numeros = numeros.split(',')

                if len(numeros) >= 2:
                    for i in range(len(numeros)):
                        numeros[i] = float(numeros[i])
                    
                    bandera = 1

                else:
                    clean()
                    print("Debe ingresar como mínimo dos números.")
                    sleep(1.5)

        except:
            clean()
            print("Alguno de los valores ingresados no es un número.")
            sleep(1.5)

    return numeros

def entrada_archivo():
    clean()
    print("""Recuerda que el archivo externo debe de tener la extensión .txt para poder ser leido, éste
debe de estar dentro de la carpeta 'Otros' ubicada en la misma carpeta dónde está este archivo. Además,
los números deben de estar organizados sin texto en medio, es decir, el archivo solamente
debe de contener los números separados por coma. Si son números decimales, definir esta parte con un punto('.')\n""")

    bandera = 0

    while bandera != 1:
        nombre = input("Ingrese el nombre del archivo sin la extensión. Valor vacio para volver: ")

        if nombre == "":
            return

        else:
            nombre += '.txt'
            try:
                f = open(f"./Taller1/Otros/{nombre}", "r")
            
            except:
                clean()
                print("No se encontró ningun archivo con el nombre indicado")
                sleep(1.5)
                continue

            try:
                contenido = f.read()
                numeros = contenido.split(',')

                if len(numeros) >= 2:
                        for i in range(len(numeros)):
                            numeros[i] = float(numeros[i])
                        bandera = 1

                else:
                    clean()
                    print("Debe ingresar como mínimo dos números.")
                    sleep(1.5)

            except:
                clean()
                print("Alguno de los valores ingresados no es un número.")
                sleep(1.5)

    return numeros

def entrada_bdd():
    clean()
    print("""Recuerda que la base de datos debe de estar creada con anterioridad
en el entorno local(localhost) y el archivo sql debe de estar en la carpeta 'Otros', carpeta
ubicada en el mismo lugar donde está este archivo, además debes indicar el nombre de la base
de datos, el nombre de la tabla, el nombre del campo y el nombre del usuario y la contraseña del mismo. Si desconoces
el nombre o es predefinido(root) al igual que la contraseña, puedes omitir
la entrada de estos datos oprimiendo enter.\n""")
    i = 0
    while i != 1:
        nombre_bdd = input("Ingrese el nombre de la base de datos (Valor vacio para salir): ")

        if  nombre_bdd == "":
            return 0
            
        else:
            tabla_bdd = input("Ingresa el nombre de la tabla: ")
            campo_bdd = input("Ingresa el nombre del campo: ")
            if nombre_bdd.isspace():
                clean()
                print("Ingrese un nombre de base de datos válido")
                sleep(1)
            
            elif (tabla_bdd.isspace() or tabla_bdd == ""):
                clean()
                print("Ingrese un nombre de tabla válido")
                sleep(1)

            elif (campo_bdd.isspace() or campo_bdd == ""):
                clean()
                print("Ingrese un nombre de campo válido")
                sleep(1)

            else:
                i = 1

    user = input("Ingrese el usuario: ")
    password = input("Ingrese la contraseña: ")

    try:
        if (user.isspace() or user == "") or (password.isspace()  or password == ""):
            db = Con(nombre_bdd)

        else:
            db = Con(nombre_bdd, user, password)

        db.open()
        db.execute(f"""SELECT {campo_bdd} FROM {tabla_bdd};""")
        numeros_bdd = db.get()
        db.close()
        numeros = []
        for i in range(len(numeros_bdd)):
            for j in range(len(numeros_bdd[i])):
                numeros.append(float(numeros_bdd[i][j]))

        if len(numeros) >= 2:
            return numeros

        else:
            clean()
            print("Debe ingresar como mínimo dos números.")
            sleep(1.5)

    except:
        clean()
        print("Los datos ingresados no coinciden con ninguna base de datos")
        return


def calcular_promedio(numeros):
    suma = 0
    for numero in numeros:
        suma += numero

    media = round(suma / len(numeros), 4)
    return media

def calcular_desviacion(numeros, promedio):
    lista_restados = []
    suma = 0
    for i in range(len(numeros)):
        resta = (numeros[i] - promedio) ** 2
        lista_restados.append(resta)

    for numero in lista_restados:
        suma += numero
    try:
        desviacion_estandar = round(sqrt(suma / (len(numeros) - 1)), 4)
        return desviacion_estandar

    except:
        return "ERROR: No se pudo realizar la raíz cuadrada."

    

def guardar_mysql(promedio, desviacion, numeros):
    i = 1
    while i != 0:
        nombre = input("Ingrese el nombre del archivo, solo carácteres alfanuméricos y sin extensión. Enter vacio para cancelar: ")
        if nombre == "":
            i = 0 
            continue

        else:
            try:
                if nombre.isalnum():
                    string = ""
                    for numero in range((len(numeros))):
                        contador = len(numeros)
                        if contador - 1 == numero:
                            string += f"(1,{numeros[numero]});"
                            
                        else:
                            string += f"(1,{numeros[numero]}),"

                    nombre = nombre.replace(" ", "_")
                    nombre_extension = nombre + ".sql"
                    f = open(f"Taller1/Otros/{nombre_extension}", "x")
                    f.write(f"""CREATE SCHEMA {nombre};
USE {nombre};
CREATE TABLE numeros(
    grupo VARCHAR(20) NOT NULL,
    num VARCHAR(20) NOT NULL
);
CREATE TABLE operaciones(
    grupo VARCHAR(20) NOT NULL,
    promedio VARCHAR(20) NOT NULL,
    desviacion_estandar INT NOT NULL
);
INSERT INTO operaciones VALUES(1, {promedio}, {desviacion});
INSERT INTO numeros VALUES{string}""")

                    i = 0

                    return "Archivo guardado."

                else:
                    print("Solo se admiten carácteres alfanuméricos")

            except:
                print("Ya existe un archivo con ese nombre")
    return

def guardar_txt(promedio, desviacion, numeros):
    i = 1
    while i != 0:
        nombre = input("Ingrese el nombre del archivo, solo carácteres alfanuméricos y sin extensión. Enter vacio para cancelar: ")
        if nombre == "":
            i = 0 
            continue

        else:
            try:
                if nombre.isalnum():
                    nombre = nombre.replace(" ", "_")

                    f_num = open(f"./Taller1/Otros/{nombre}_numeros.txt", "x")
                    f_res = open(f"./Taller1/Otros/{nombre}_resultados.txt", "x")

                    numeros_str = ""
                    for i in range(len(numeros)):
                        if len(numeros) - 1 == i:
                            numeros_str += str(numeros[i])

                        else:
                            numeros_str += str(numeros[i]) + ','
                    f_num.write(numeros_str)
                    f_res.write(f"La media es: {promedio}\nLa desviación estándar es: {desviacion}")

                    return "Archivo guardado."

                else:
                    print("Solo se admiten carácteres alfanuméricos")

            except:
                print("Ya existe un archivo con ese nombre")

    return


        


def guardar_resultado(promedio, desviacion, numeros):
    """Función que guarda los resultados"""
    bandera = 0
    while bandera != 1:
        clean()
        metodo = int(input("¿En que formato desea almacenar los datos?\n1. Archivo MySql.\n2. Archivo de texto.\n3. Cancelar.\nFormato: "))
        
        if metodo in (1,2,3):
            if metodo == 1:
                respuesta = guardar_mysql(promedio, desviacion, numeros)

            elif metodo == 2:
                respuesta = guardar_txt(promedio, desviacion, numeros)

            else:
                return "No se ingresó un valor erstablecido"

        else:
            return "No se ingresó un valor erstablecido"
        
        return respuesta

def main():
    i = True
    while i != False:
        metodo = metodo_entrada()

        if metodo == 1:
            numeros = entrada_teclado()
            if numeros == None:
                clean()
                continue

        elif metodo == 2:
            numeros = entrada_archivo()
            if numeros == None:
                clean()
                continue

        elif metodo == 3:
            numeros_bdd = entrada_bdd()
            if numeros_bdd == None:
                clean()
                print("Ocurrió un error con los datos ingresados.")
                sleep(1.5)
                continue

            elif numeros_bdd == 0:
                clean()
                continue

            else:
                numeros = numeros_bdd
                
        else:
            clean()
            print("Hasta luego.")
            i = False
            continue

        clean()
        promedio = calcular_promedio(numeros)
        desviacion = calcular_desviacion(numeros, promedio)
        print(f"La media es: {promedio}\nLa desviación estándar es: {desviacion}")
        j = False
        while j != True:
            try:
                pregunta_guardar = int(input("¿Desea guardar los resultados?\n1.Si\n2.No\n¿Guardar?: "))
                if pregunta_guardar == 1:
                    eleccion = guardar_resultado(promedio, desviacion, numeros)

                    if eleccion == None:
                        pass

                    else:
                        j = True
                        print(eleccion)
                else:
                    j = True
            except:
                j = True
        print("Hasta luego")
        i = False
if __name__ == "__main__":
    main()