# Importación de librerías.
from programas import contemporaneos, numeros, parqueadero, supermercado
import random

class Test:
    def numeros(self: object, metodo: int, numero: int = None):
        """
        Método para testear las funciones del programa #1:
        Verificar si un número es par o impar y si este es positivo o negativo.
        Recibe:
            - self: object -> Objeto que está llamando al método.
            - numero: int -> Número el cual se averiguará su signo y si es par o impar.
        Retorna:
            - str -> Cadena que dice si el número es positivo o negativo y par o impar,
                    o si el valor ingresado no es un número entero o error.
        """
        # Se valida si no se entran parámetros
        if metodo == 1:
            # Si no entran parámetros, se escojen números aleatorios.
            numero = random.randint(-1000, 1000)
        
        return numeros.numero_es(numero)

    def parqueadero(self: object, metodo: int, tiempo: str = None, file: str = None):
        """
        Método para testear las funciones del programa #2:
        Calcular cuanto paga un vehivulo por estacionar en un parqueadero segun las horas
        y minutos.
        Recibe:
            - self: object -> Objeto que está llamando al método.
            - tiempo: str -> Número el cual se averiguará su signo y si es par o impar.
        Retorna:
            - str -> Cadena que dice si el valor a pagar por el servicio del parqueadero o error.
        """
        if metodo == 1:
            tiempo = ""
            for i in range(2):
                tiempo += str(random.randint(0, 100))
                tiempo += ":" if i == 0 else ""
                
        return parqueadero.calculo_valor(tiempo)

    def edades(self: object, metodo: int, edades: tuple = None, nombres: tuple = None):
        if metodo == 1:
            nombres = ("Juan", "Mario", "Pedro")
            edades = []
            for i in range(3):
                edades.append(random.randint(1, 100))

            return contemporaneos.comprobar_contemporaneos(edades, nombres)
            
            


test = Test()

print(test.edades(1))