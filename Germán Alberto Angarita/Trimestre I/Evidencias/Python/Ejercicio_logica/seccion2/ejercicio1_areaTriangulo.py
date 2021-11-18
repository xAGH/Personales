# Programa que toma la base y la altura de un triángulo e imprime su área.

# Entrada de datos
base = float(input("Ingrese la base del triángulo: "))
altura = float(input("Ingrese la altura del triángulo: "))

# Proceso
def area_triangulo(b, h, area = None, n_dos = 2):
    area = (b * h) / n_dos
    resultado = "El área del triángulo es: {}".format(area)
    return resultado

# Salida de datos
print(area_triangulo(base, altura))