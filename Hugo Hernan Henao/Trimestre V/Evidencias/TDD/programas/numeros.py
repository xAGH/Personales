def par_impar(num: int):
    """
    Función para saber si un número es par o impar.
    Recibe:
        - num: int -> Número a averiguar si es par o impar.
    Retorna:
        - str -> Cadena que dice si es par o impar
    """
    # Calculo para saber si el número es par o no.
    return "par" if num % 2 == 0 else "impar"

def positivo_negativo(num: int):
    """
    Función para saber si un número es positivo o negativo.
    Recibe:
        - num: int -> Número a averiguar si es positivo o negativo.
    Retorna:
        - str -> Cadena que dice si positivo o negativo.
    """
    # Calculo para saber si el número es positivo o falso.s
    return "positivo" if num >= 0 else "negativo"

def verificar_numero(num: str or int):
    """
    FUnción que verifica si el parámetro enviado es un número entero o no.
    Recibe:
        - num: str or int -> Valor a verificar su tipo.
    Return:
        - bool -> Válido o no para seguir con el programa.
    """
    try:
        int(num)
        verificacion = True
    except ValueError:
        verificacion = False

    finally:
        return verificacion
    

def numero_es(num: int) -> str:
    """
    Función que dice si un número es positivo o negativo y par o impar.
    Recibe:
        num: int -> Número a saber su signo y si es par o no.
    Retorna:
        resultado: str -> Mensaje del resultado.
    """
    if verificar_numero(num):
        resultado = f"El número {int(num)} es {par_impar(int(num))} y es {positivo_negativo(int(num))}"
    else:
        resultado = f"{num} no es un número entero."
    
    return resultado