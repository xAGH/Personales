# Programa que muestra 5 paises de un continente seleccionado.

# Función en la que se definen los continentes y sus respectivos paises 
def definicion():

    continentes = {
"AMERICA" : ("ESTADOS UNIDOS", "COLOMBIA", "ECUADOR", '"MEXICO', "ARGENTINA"),
"AFRICA" : ("NIGERIA", "KENIA", "TANZANIA", "SENEGAL", "MARRUECOS"),
"EUROPA" : ("ESPAÑA", "FRANCIA", "RUSIA", "ALEMANIA", "LETONIA"),
"ASIA" : ("JAPON", "CHINA", "INDONESIA", "FILIPINAS", "SINGAPUR"),
"OCEANIA" : ("AUSTRALIA", "NUEVA ZELANDA", "SAMOA", "TONGA", "NIUE")
}
    return continentes

# Función que muestra los paises según el contienente ingresado.
def paises_continente_ingresado(definicion):

    continente = input("\nIngrese uno de los cinco continentes (AMERICA, AFRICA, ASIA, EUROPA, OCEANIA): ").upper()

    if continente in definicion:
        print("\nAlgunos de sus paises:")
        for i in definicion[continente]:
            print(i)
    
    else:
        print("\nIngrese el nombre de un continente válido\n")



while True:
    paises_continente_ingresado(definicion())