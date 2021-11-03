# Programa que toma un número real e imprime su valor absoluto.

# Solicitud de los datos
def solicitud():
    numero = float(input("Ingrese el número el cual desea saber su valor absoluto: "))
    return numero

# Conversión a valor absoluto
def absoluto(numero):
    if numero < 0:
        valor_absoluto = numero * (-1)
        return valor_absoluto
    else:
        return numero

# Función principal que se encarga de unir y ejecutar las otras funciones
def main():
    numero = solicitud()
    valor_absoluto = absoluto(numero)
    print(f"El valor absoluto del {numero} es {valor_absoluto}")
main()