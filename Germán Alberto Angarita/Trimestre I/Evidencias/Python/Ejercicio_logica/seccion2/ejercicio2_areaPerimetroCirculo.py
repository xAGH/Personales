# Programa que toma el radio de un círculo e imprime su área y perímetro

# Entrada de datos
radio = float(input("Ingrese el radio del círculo: "))

# Proceso
def area_circulo(r, pi = 3.1415):
    area = pi * (r ** 2)
    mensaje_area = "El área del círculo es: {}".format(area)
    return mensaje_area

def perimetro_circulo(r, pi = 3.1415): 
    perimetro = 2 * pi * r
    mensaje_perimetro = "El perímetro del círculo es: {}".format(perimetro)
    return mensaje_perimetro

# Salida de datos 
resultado_area = area_circulo(radio)
resultado_perimetro = perimetro_circulo(radio)
mensaje_final = "Según el radio ingresado:\n{}\n{}".format(resultado_area, resultado_perimetro)

print(mensaje_final)