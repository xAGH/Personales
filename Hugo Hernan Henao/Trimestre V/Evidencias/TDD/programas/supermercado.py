def calculo_docenas(cantidad: int):
    """
    Función para calcular las docenas.
    Recibe:
        - cantidad: int -> Cantidad de producto comprado.
    Retorna:
        - bool, str or int -> Valor booleano que establece la validación de la entrada y
                              valor entero que serán las docenas o mensaje de error.
    """
    try:
        cantidad = int(cantidad)
        return True, int(cantidad / 12)
    except:
        return False, "La cantidad de producto no es un número."

def calculo_descuento(docenas: int):
    """
    Función para saber el descuento aplicado sobre el monto total.
    Recibe:
        - docenas: int -> Número de docenas de las cuales depende el descuento aplicado.
    Retorna:
        - float -> Descuento aplicado.
    """
    return 0.15 if docenas > 3 else 0.10

def calculo_obsequios(docenas: int):
    """
    Función para conocer el número de productos que se obsequian.
    Recibe:
        - docenas: int -> Número de docenas.
    Retorna:
        - int -> Cantidad de productos obsequiados.
    """
    return int(docenas - 3) if docenas > 3 else 0

def validar_monto(monto: float):
    """
    Función para validar que el monto ingresado sea un número.
    Recibe:
        - monto: float -> Monto a validar.
    Retorna:
        - bool -> Valor booleano que establece la validación de la entrada.
    """
    try:
        monto = float(monto)
        return True
    except:
        return False

def total(cantidad_productos: int, monto: float):
    """
    Función que calcula el monto a pagar.
    Recibe:
        - cantidad_productos: int -> Cantidad de productos que ha comprado un cliente.
        - monto: float -> Valor unitario de cada producto.
    Retorna:
        - str -> Cadena que explica las docenas compradas, el descuento, el monto a pagar y los obsequios.
    """
    docenas = calculo_docenas(cantidad_productos)
    if docenas[0]:
        if validar_monto(monto):
            docenas = docenas[1]
            valor_sin_descuento = round(abs(float(monto)) * cantidad_productos, 2)
            descuento = calculo_descuento(docenas)
            obsequios = calculo_obsequios(docenas)
            valor_descuento = round(valor_sin_descuento * descuento, 2)
            valor_con_descento = round(valor_sin_descuento - valor_descuento, 2)
            resultado = f"Por {docenas} docenas ({cantidad_productos} productos), obtiene un descuento del {descuento}%"
            resultado += f"y {obsequios} unidades de obsequio.\nEl monto a pagar sin descuento es: {valor_sin_descuento}, "
            resultado += f"el valor del descuento es {valor_descuento} por lo debe pagar un total de {valor_con_descento}."
        
        else:
            resultado = f"El monto enviado no es un número real"
    
    else:
        resultado = f"La cantidad de productos comprados no es un número"
    
    return resultado
        