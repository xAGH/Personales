# Programa que calcula el promedio de tres notas para n estudiantes.

# Se solicita el límite máximo de estudiantes
def solicitud():
    estudiantes =  input("\nIngrese el número de estudiantes a los cuales se les calculará el promedio de notas: ")
    return estudiantes

# Se solicitan las 3 notas del estudiante
def notas(i):
    nota1 = input(f"Ingrese la nota #1 del estudiante {i}: ")
    nota2 = input(f"Ingrese la nota #2 del estudiante {i}: ")
    nota3 = input(f"Ingrese la nota #3 del estudiante {i}: ")
    return nota1, nota2, nota3

# Se calcula el promedio de las notas:
def nota_final(nota1, nota2, nota3, numero_estudiante):
    promedio = (nota1 + nota2 + nota3) / 3

    if promedio >= 0 and promedio <= 4:
        resultado = "\nEl estudiante #{}, reprobó porque su promedio fue de {}".format(numero_estudiante, promedio)
        return resultado
    
    resultado = "\nEl estudiante #{}, aprobó porque su promedio fue de {}".format(numero_estudiante, promedio)
    return resultado

# Función que llamará a todas las funciones anteriores y las relacionará. Esta función se ejecutará de forma contante.
def main():
    limite = solicitud()
    if limite.isdigit():
        print("\nLas notas se encuentran en el el intérvalo de 0 a 10\n")
        i = 1
        while i <= int(limite):
            nota1, nota2, nota3 = notas(i)
            if nota1.isdigit() and nota2.isdigit() and nota3.isdigit():
                nota1 = int(nota1)
                nota2 = int(nota2)
                nota3 = int(nota3)
                if nota1 < 0 or nota1 > 10 or nota2 < 0 or nota2 > 10 or nota3 < 0 or nota3 > 10:
                    print("\nLas notas o alguna de ellas no se encuentran en los intérvalos establecidos (0 - 10)")
                
                else:
                    resultado = nota_final(nota1, nota2, nota3, i)
                    print(resultado)
                    print("-------------------------")
            else:
                print("\nLas notas deben de ser números")
            i += 1
while True:
    main()


