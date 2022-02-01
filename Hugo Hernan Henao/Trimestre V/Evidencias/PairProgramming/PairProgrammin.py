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
            cantidad_listas = abs(int(input("Ingrese la cantidad de listas: ")))
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
        nombres.append(nombre)
    return nombres

def datos_listas(cantidad):
    """
    Función para ingresar datos a cada lista.
    """
    nombres = nombres_listas(cantidad)
    contenido_listas = []
    i = 0
    while i != cantidad:
        j = 0
        datos = []
        datos = input(f"Ingrese los datos de la lista {nombres[i]} separados por espacios (ej: 1 2 3.3 4,5): ")
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
            contenido_listas.append(datos)
            i += 1

        else:
            if len(datos) < longitud: 
                numeros = " ".join(datos)
                restantes = longitud - len(datos)
                articulo = "el" if restantes == 0 else "los"
                completar = "número que falta" if restantes == 1 else f"{restantes} números que faltan."
                print(f"""Ingresó {len(datos)} números, la lista debe tener {longitud} números ya que la primera lista tiene esta cantidad de datos.
                Ingrese {articulo} {completar}:""")
            else:
                ...


    print(contenido_listas)

def main():
    cantidad = cantidad_listas()
    datos_listas(cantidad)

if __name__ == "__main__":
    main()
