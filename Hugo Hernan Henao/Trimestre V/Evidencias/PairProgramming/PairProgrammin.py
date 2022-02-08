# -*- coding: utf-8 -*-
# Importamos los módulos del sistema.
import sys, os

def clean():
    """
    Función para limpiar la pantalla según el sistema operativo.
    """
    os.system("cls") if sys.platform.startswith("win") else os.system("clear")

def cantidad_listas():
    """
    Función para definir cantidad de listas.
    """
    while True:
        try:
            cantidad_listas = abs(int(input("Ingrese la cantidad de listas a procesar: ")))
            return cantidad_listas
        except:
            print("La cantidad de listas debe de ser un número entero.")

def nombres_listas(cantidad):
    """
    Función para definir los nombres de las listas.
    """
    nombres = []
    for i in range(cantidad):
        nombre = input(f"Nombre de la lista #{i + 1}: ")
        nombres.append([nombre])
    return nombres    

def datos_listas(cantidad):
    """
    Función para ingresar datos a cada lista.
    """
    listas = nombres_listas(cantidad)
    print("\n================================================================================")
    i = 0
    while i != cantidad:
        j = 0
        datos = input(f"Ingrese los datos de la lista {listas[i][0]} separados por espacios (ej: 1 2 3.3 4,5): ")
        datos = datos.replace(",", ".")
        datos = datos.split()
        longitud = len(datos) if i == 0 else longitud
            
        if len(datos) == longitud:
            while True:
                try:
                    if j == longitud: break
                    datos[j] = float(datos[j])
                    j += 1
                except:
                    datos[j] = input(f"Ingresó un valor que no es un número real ({datos[j]}), por favor ingrese un valor válido: ").replace(",", ".")
            listas[i].append(datos)
            i += 1

        else:
            print(f"\nLa longitud de la lista {listas[i][0]}({len(datos)} dato(s)) no coincide con la lista {listas[0][0]}({len(listas[0][1])} dato(s))\n")

    return listas

def calculo_promedio(lista):
    """
    Funcion para calcular el promedio
    """
    for j in range(len(lista)):
        largor = len(lista[j][1])
        suma = 0
        for i in range(largor):
            suma += lista[j][1][i]
        promedio = suma / largor
        lista[j].append([round(promedio, 2)])
    return lista

def calculo_desviacion(lista):
    """
    Funcion para calcular la desviacion media
    """
    lista = calculo_promedio(lista)
    for j in range(len(lista)):
        promedio = lista[j][2][0]
        largor = len(lista[j][1])
        suma = 0
        for i in range (largor):
            suma += abs(promedio - lista[j][1][i])
        desviacion = suma / largor
        lista[j][2].append(round(desviacion, 2))
    return lista


def ordenar_datos(lista):
    """
    Funcion para ordenar datos segun su desviacion media
    """
    lista.sort(key=lambda x: x[2][1])
    return lista

def imprimir(lista):
    """
    Funcion para imprimir con formato las listas
    """
    print("\n================================================================================")
    for i in range(len(lista)):
        print(f"Lista {lista[i][0]} presenta una media de {lista[i][2][0]} y una desviación respecto a la media de de {lista[i][2][1]}")

def main():
    clean()
    cantidad = cantidad_listas()
    datos = datos_listas(cantidad)
    datos = calculo_desviacion(datos)
    datos_ordenados = ordenar_datos(datos)
    imprimir(datos_ordenados)
    print("\n================================================================================")
    continuar = input("¿Desea continuar? Si/No 1/0 S/N Y/N: ")
    if continuar.lower() in ("si", "1", "s", "y"):
        main()
    else:
        clean()
        print("Programa finalizado")

if __name__ == "__main__":
    main()
