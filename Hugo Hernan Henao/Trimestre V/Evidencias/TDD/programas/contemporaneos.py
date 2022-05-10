def verificar_edades(edades: tuple) -> tuple:
    """
    Función que verifica si los datos ingresados son número o no.
    Recibe:
        - edades: tuple -> Lista con las 3 edades, a verificar si son números.
    Retorna:
        - bool -> True si se reciben 3 edades y son números, de lo 
                  contrario, False.
          or

          resultado: tuple -> (bool: Resultado de la verificación,
                               str: Mensaje explicando el resultado de 
                                    la verificación.)
    """
    try:
        if type(edades) == tuple or type(edades) == list and len(edades) == 3:
            for i in range (3): 
                int(str(edades[i]))
            resultado = True, "Ok"
        else:
            resultado = False, f"No se han enviado 3 edades, edades recibidad: {edades}."
    except ValueError:
        resultado = False, f"{edades[i]} no es un número entero."
    finally:
        return resultado

def comprobar_contemporaneos(edades: tuple, 
                            nombres: tuple):
    """
    Función que verifica si las edades son iguales.
    Recibe: 
        - edades: tuple<int> -> Lista de edades a averiguar si son iguales.
        - nombres: tuple<str> -> Lista de nombres correspondientes a las edades.
    Retorna:
        - str -> Dice si hay contemporáneos o no y quiénes son.
    """
    verificar = verificar_edades(edades)
    if verificar[0]:
        edad1 = edades[0]
        edad2 = edades[1]
        edad3 = edades[2]
        articulo = lambda x: "años" if int(x) > 1 else "año"
        print(f"{tuple(edades)}")
        if edad1 == edad2 and edad2 == edad3:
            contemporaneos = f"{nombres[0]}, {nombres[1]} y {nombres[2]} son contemporáneos. Ya que tienen {edad1} {articulo(edad1)}"
        elif edad1 == edad2:
            contemporaneos = f"{nombres[0]} y {nombres[1]} son contemporáneos. Ya que tienen {edad1} {articulo(edad1)}"
        elif edad1 == edad3:
            contemporaneos = f"{nombres[0]} y {nombres[2]} son contemporáneos. Ya que tienen {edad1} {articulo(edad1)}"
        elif edad2 == edad3:
            contemporaneos = f"{nombres[1]} y {nombres[2]} son contemporáneos. Ya que tienen {edad2} {articulo(edad2)}"
        else:
            contemporaneos = f"Ni {nombres[0]} con {edad1} {articulo(edad1)}, ni {nombres[1]} con {edad2} {articulo(edad2)}, ni {nombres[2]} con {edad3} {articulo(edad3)} son contemporáneos."

    else:
        contemporaneos = verificar[1]
    return contemporaneos
