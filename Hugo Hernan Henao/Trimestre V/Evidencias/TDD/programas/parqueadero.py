from math import floor    
    
def division_tiempo(tiempo: str) -> list:
    """
    Función que divide los valores de entrada en horas y minutos
    Recibe:
        - tiempo: str -> Cadena en formato hh:mm a transformar.
    Retorna:
        - tiempo: [str, str] -> Lista con dos elementos, horas y minutos. 
    """
    # Se agrega a una lista los elementos separados por ':'
    return tiempo.split(":")

def exceso_minutos(horas: int, minutos: int) -> tuple:
    """
    Función que segun los minutos, agrega mas horas o no
    Recibe:
        - hh: int -> Horas.
        - minutos: int -> Minutos
    Retorna:
        - tuple -> (hh: int -> Horas con mayor valor segun minutos, 
                    minutos: int -> Minutos menos o igual segun minutos)
    """
    # Condición que verifica si los minutos son mayores a 59
    if minutos > 59:
        # Si los minutos son mayores a 59, cada 60 minutos, agrega
        # 1 hora a las horas y los minutos se resetean siempre en 
        # un valor menor a 60.
        horas += floor(minutos / 60)
        minutos = minutos % 60
    return (horas, minutos)

def formatear_calculo(valor: int):
    """
    Función que formatea la salida del cálculo, agregando punto de mil.
    Recibe:
        - valor: int -> Valor a formatear.
    Retorna:
        - str -> Valor formateado con punto de mil.
    """
    return "{:,.2f}".format(valor)[:-3].replace(',', '.')

def calculo_valor(tiempo: str, 
                  valor_h: int = 3000, 
                  valor_m: int = 50) -> tuple or bool:
    """
    Función que calcula el valor total a pagar por el servicio
    del paruqeadero.
    Recibe:
        - tiempo: int -> Cadena en formato hh:mm.
        - valor_h -> Valor por hora del parqueadero, por defecto 3000
        - valor_m -> Valor por minuto del parqueadero, por defecto 50
    Retorna:
        - resultado: 
            tuple -> 
                (calculo: str -> Valor total por pagar formateado,
                 horas: int -> Horas en el parqueadero,
                 minutos: int -> Minutos en el parqueadero)
            
            or

            bool -> False si los datos enviados no cumplen con el 
                    formato(hh->int:mm->int).

    """
    tiempo = division_tiempo(tiempo)
    try:
        tiempo_h = abs(float(tiempo[0]))
        tiempo_m = abs(float(tiempo[1]))
        horas, minutos = exceso_minutos(tiempo_h, tiempo_m)
        calculo = formatear_calculo(horas * valor_h + minutos * valor_m)
        hora_s = lambda x: "horas" if x != 1 else "hora"
        minutos_s = lambda x: "minutos" if x != 1 else "minuto"
        resultado = f"Por {int(horas)} {hora_s(horas)} y {int(minutos)} {minutos_s(minutos)} debe pagar un valor de ${calculo} pesos."
    except:
        resultado = f"El formato de tiempo no es válido. ({tiempo})"

    return resultado
