# Importación de librerías.
from programas import contemporaneos, numeros, parqueadero, supermercado
import random

class Tester():
    def numeros(self: object, metodo: int):
        """
        Método para testear las funciones del programa #1:
        Verificar si un número es par o impar y si este es positivo o negativo.
        Recibe:
            - self: object -> Objeto que está llamando al método.
            - metodo: int -> Forma de pasar los datos al programa. (1=Aleatorio, 2=Archivo, 3=Manual)
        Retorna:
            - str -> Cadena que dice si el número es positivo o negativo y par o impar,
                    o si el valor ingresado no es un número entero o error.
        """
        if metodo == 1:
            # Si no entran parámetros, se escojen números aleatorios.
            numero = random.randint(-1000, 1000)
            print(numeros.numero_es(numero))
        elif metodo == 2:
            nombre = input("Ingrese el nombre del archivo: ")
            with open(f"./archivos/{nombre}.txt", "r") as file:
                numeros_archivo = []
                for i in file:
                    numero_archivo = i.replace("\n","").replace(" ", ";").split(";")
                    numeros_archivo = numeros_archivo + numero_archivo
                while True:
                    try:
                        numeros_archivo.remove("")
                    except:
                        break
                
                for i in numeros_archivo:
                    print(numeros.numero_es(i))
        
        elif metodo == 3:
            numero = input("Ingrese un número: ")
            print(numeros.numero_es(numero))

    def parqueadero(self: object, metodo: int,):
        """
        Método para testear las funciones del programa #2:
        Calcular cuanto paga un vehivulo por estacionar en un parqueadero segun las horas
        y minutos.
        Recibe:
            - self: object -> Objeto que está llamando al método.
            - metodo: int -> Forma de pasar los datos al programa. (1=Aleatorio, 2=Archivo, 3=Manual)
        Retorna:
            - str -> Cadena que dice si el valor a pagar por el servicio del parqueadero o error.
        """
        if metodo == 1:
            tiempo = ""
            for i in range(2):
                tiempo += str(random.randint(0, 100))
                tiempo += ":" if i == 0 else ""
            print(parqueadero.calculo_valor(tiempo))
                
        elif metodo == 2:
            nombre = input("Ingrese el nombre del archivo: ")
            try:
                with open(f"./archivos/{nombre}.txt", "r") as file:
                    tiempos = []
                    for i in file:
                        dato = i.replace("\n","").replace(" ", ";").split(";")
                        tiempos = tiempos + dato
                    while True:
                        try:
                            tiempos.remove("")
                        except:
                            break
                    for i in tiempos:
                        print(parqueadero.calculo_valor(i))
            except:
                print("No se ha encontrado el archivo")
            
        elif metodo == 3:
            tiempo = input("Ingrese el tiempo en formato hh:mm donde hh son horas y mm minutos: ")
            print(parqueadero.calculo_valor(tiempo))

    def edades(self: object, metodo: int):
        """
        Método para testear las funciones del programa #3:
        Programa que recibe 3 edades de 3 personas y dice si todos, algunos o ninguno de ellos son
        contemporáneos.
        Recibe:
            - self: object -> Objeto que está llamando al método.
            - metodo: int -> Forma de pasar los datos al programa. (1=Aleatorio, 2=Archivo, 3=Manual)
        Retorna:
            - str -> Cadena que dice si el valor a pagar por el servicio del parqueadero o error.
        """
        if metodo == 1:
            nombres = ("Juan", "Mario", "Pedro")
            edades = []
            for i in range(3):
                edades.append(random.randint(1, 100))
            print(contemporaneos.comprobar_contemporaneos(edades, nombres))

        elif metodo == 2:
            nombre = input("Ingrese el nombre del archivo: ")
            nombres = ("Juan", "Mario", "Pedro")
            
            with open(f"./archivos/{nombre}.txt", "r") as file:
                edades = []
                for i in file:
                    dato = i.replace("\n","").replace(" ", ";").split(";")
                    edades = edades + dato
                while True:
                    try:
                        edades.remove("")
                    except:
                        break
                i = 0
                while i < len(edades):
                    try:
                        datos = (edades[i], edades[i+1], edades[i+2])
                    except:
                        try:
                            datos = (edades[i], edades[i+1])
                        except:
                            datos = (edades[i])
                    finally:
                        print(contemporaneos.comprobar_contemporaneos(datos, nombres))
                        i += 3

        elif metodo == 3:
            nombres = []
            edades = []

            for i in range(3):
                nombre_persona = input("Ingrese el nombre #1: ")
                nombres.append(nombre_persona)
                edades.append(input(f"Ingrese la edad de {nombre_persona}: "))

            print(contemporaneos.comprobar_contemporaneos(edades, nombres))
