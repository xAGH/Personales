# Programa que calcula la distancia entre dos puntos en el espacio tridimensional

# Importación de la libreria math para poder utilizar la función sqrt()
import math

# Entrada de datos
x1 = float(input("Ingrese la coordenada x del primer punto: "))
y1 = float(input("Ingrese la coordenada y del primer punto: "))
z1 = float(input("Ingrese la coordenada z del primer punto: "))
x2 = float(input("Ingrese la coordenada x del segundo punto: "))
y2 = float(input("Ingrese la coordenada y del segundo punto: "))
z2 = float(input("Ingrese la coordenada z del segundo punto: "))

# Proceso 
def calculo_distancia3d(x1, x2, y1, y2, z1, z2):
    formula = math.sqrt((𝑥1 - 𝑥2) ** 2 + (𝑦1 - 𝑦2) ** 2 + (𝑧1 - 𝑧2) ** 2)
    mensaje = "La distancia entre el punto 1 y el punto 2 en el plano tridimensional es: {}".format(formula)
    return mensaje

# Salida
print(calculo_distancia3d(x1, x2, y1, y2, z1, z2))
