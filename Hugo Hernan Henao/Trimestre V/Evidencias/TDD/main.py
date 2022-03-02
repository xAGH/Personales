# Este archivo se encarga de orquestar y permitir al cliente ejecutar las pruebas
from tests import Tester
import sys, os

def clean():
    """
    Función para limpiar la pantalla según el sistema operativo.
    """
    os.system("cls") if sys.platform.startswith("win") else os.system("clear")

def eleccion_metodo():
    while True:
        mensaje = "\nMétodo de ejecución:\n"
        mensaje += "1. De forma automática.\n"
        mensaje += "2. Por medio de un archivo de texto(éste debe de estar en la carpeta archivos.)\n"
        mensaje += "3. De forma manual.\n"
        mensaje += "4. Cancelar.\n"
        print(mensaje)
        try:
            eleccion = int(input("Elección: "))
            if eleccion in range(1, 5):
                return eleccion
            else: 
                print("Ingrese una opción del 1 al 4.\n\n")
        except:
            print("Ingrese una opción del 1 al 4.\n\n")
            continue
    
def veces_ejecucion():
    while True:
        try:
            veces = int(input("¿Cuántas veces desea ejecutar el programa? 0 para cancelar."))
            return veces
        except:
            print("Ingrese un valor entero.")

def main():
    testeo = Tester()
    while True:
        clean()
        programa = "Bienvenido.\n"
        programa += "Elija la opción de acuerdo al programa que quiere ejecutar.\n"
        programa += "1. Parqueadero.\n"
        programa += "2. Números\n"
        programa += "3. Supermercado.\n"
        programa += "4. Contemporáneos.\n"
        programa += "5. Salir.\n"
        print(programa)
        try:
            programa = int(input("Elección: "))
            if programa in range(1, 6):
                pass
            else:
                print("Ingrese una opción del 1 al 5.\n")
                continue
        except:
            print("Ingrese una opción del 1 al 5.\n")
            continue
    
        if programa == 1:
            metodo = eleccion_metodo()
            if metodo == 2:
                testeo.parqueadero(metodo)
            elif metodo == 4:
                continue
            else:
                veces = veces_ejecucion()
                if veces > 0:
                    for i in range(veces):
                        testeo.parqueadero(metodo)
                else:
                    continue

        elif programa == 2:
            metodo = eleccion_metodo()
            if metodo == 2:
                testeo.numeros(metodo)
            elif metodo == 4:
                continue
            else:
                veces = veces_ejecucion()
                if veces > 0:
                    for i in range(veces):
                        testeo.numeros(metodo)
                else:
                    continue

        elif programa == 3:
            metodo = eleccion_metodo()
            if metodo == 2:
                testeo.supermercado(metodo)
            elif metodo == 4:
                continue
            else:
                veces = veces_ejecucion()
                if veces > 0:
                    for i in range(veces):
                        testeo.supermercado(metodo)
                else:
                    continue

        elif programa == 4:
            metodo = eleccion_metodo()
            if metodo == 2:
                testeo.edades(metodo)
            elif metodo == 4:
                continue
            else:
                veces = veces_ejecucion()
                if veces > 0:
                    for i in range(veces):
                        testeo.edades(metodo)
                else:
                    continue
            
        elif programa == 5:
            clean()
            print("Hasta luego.")
        
        break

if __name__ == '__main__':
    main()