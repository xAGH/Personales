# Programa que transforma una cadena con espacios, tabuladores y saltos de línea 
# a una cadena en formato de nombre propio(cada letra inicial en mayúscula) y con
# un único espacio entre las palabras}

def transformador(cadena):
    """Función que recibe una cadena por parámetro, la lee
    y la transforma de acuerdo a los requisitos."""

    cadena = (cadena.title()).replace(" ","").replace("\t", "").replace("\n", "")
    nueva_cadena = ""

    for i in range(len(cadena)):

        try:
            if cadena[i+1].isupper():
                nueva_cadena += cadena[i] + " "
            
            elif cadena[i].isdigit():

                if cadena[i-1].isdigit():

                    nueva_cadena += cadena[i]

                else:
                    nueva_cadena += " " + cadena[i]

            else:
                nueva_cadena += cadena[i]

        except:
            nueva_cadena += cadena[i]

    return nueva_cadena

transformador("  h  h Ola uwnjdn \n\n\ndbsjhdjsdhs ")