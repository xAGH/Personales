# Importación de librerías.
from programas.numeros import *
from programas.parqueadero import *
from programas.supermercado import *
from programas.edades import *
import random

class Test:
    def numeros(self: object, numero: int = None):
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
        if numero is None:
            # Si no entran parámetros, se escojen números aleatorios.
            numero = random.randint(-1000, 1000)

        # Se llaman las funciones respectivas
        if verificar_numero(numero):
            numero_es = par_impar(numero)
            numero_signo = positivo_negativo(numero)
            # Se retorna un resultado
            resultado = f"El número {numero} es {numero_es} y es {numero_signo}"
        else:
            resultado = f"El valor no es válido, {numero} no es un valor entero"
        
        return resultado

    def parqueadero(self: object, tiempo: str = None):
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
        # Se valida si no se entran parámetros
        if tiempo is None:
            # Si no entran parámetros, se escojen tiempos aleatorios.
            tiempo = ""
            for i in range(2):
                tiempo += str(random.randint(0, 100))
                tiempo += ":" if i == 0 else ""
        retorno = calculo_valor(tiempo)
        return f"Por {retorno[1]} horas y {retorno[2]} minutos debe pagar un valor de ${retorno[0]} pesos." if retorno else "El formato de tiempo no es válido."
