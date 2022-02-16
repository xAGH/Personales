from math import floor

def calculo_valor(tiempo: str, valor_h: int = 3000, valor_m: int = 50):
    """
    Función que calcula el valor total a pagar por el servicio
    del paruqeadero.
    Recibe:
        - tiempo: str -> Cadena en formato hh:mm.
    Retorna:
        - resultado: int or string -> Valor a pagar por la estancia en el parqueadero o error.
    """
    tiempo = division_tiempo(tiempo)
    if tiempo[0].isdigit() and tiempo[1].isdigit():
        horas, minutos = exceso_minutos(abs(int(tiempo[0])), abs(int(tiempo[1])))
        calculo = formatear_calculo(horas * valor_h + minutos * valor_m)
        resultado = (calculo, horas, minutos)
    else:
        resultado = False
    return resultado
    
    
def division_tiempo(tiempo: str):
    """
    Función que divide los valores de entrada en horas y minutos
    Recibe:
        - tiempo: str -> Cadena en formato hh:mm a transformar.
    Retorna:
        - tiempo: [str, str] -> Lista con dos elementos, horas y minutos. 
    """
    # Se agrega a una lista los elementos separados por ':'
    return tiempo.split(":")

def exceso_minutos(horas: int, minutos: int):
    """
    Función que segun los minutos, agrega mas horas o no
    Recibe:
        - hh: int -> Horas.
        - minutos: int -> Minutos
    Retorna:
        - hh: int -> Horas con mayor valor segun minutos.
        - minutos: int -> Minutos menos o igual segun minutos.
    """
    # Condición que verifica si los minutos son mayores a 59
    if minutos > 59:
        # Si los minutos son mayores a 59, cada 60 minutos, agrega
        # 1 hora a las horas y los minutos se resetean siempre en 
        # un valor menor a 60.
        horas += floor(minutos / 60)
        minutos = minutos % 60
    return horas, minutos

def formatear_calculo(valor: int):
    """
    Función que formatea la salida del cálculo, agregando punto de mil.
    Recibe:
        - valor: int -> Valor a formatear.
    """
    return "{:,.2f}".format(valor)[:-3].replace(',', '.')