# Programa que lee una cantidad e imprime un porcentaje a calcular requerido sobre esa cantidad.

# Solicitud de datos
def solicitud_cantidad():
    cantidad = float(input("Ingrese la cantidad total: "))
    return cantidad

# Solicitud del porcentaje requerido
def solicitud_porcentaje():
    porcentaje = int(input("Ingrese el porcentaje a calcular: "))
    return porcentaje

# Cálculo del porcentaje
def calculo(cantidad, porcentaje):
    resultado = cantidad / porcentaje
    return resultado

# Función principal encargada de ejecutar y unir las otras funciones
def main():
    cantidad = solicitud_cantidad()
    porcentaje = solicitud_porcentaje()
    resultado = calculo(cantidad, porcentaje)
    print(f"El {porcentaje}% de {cantidad} es {resultado}")
main()