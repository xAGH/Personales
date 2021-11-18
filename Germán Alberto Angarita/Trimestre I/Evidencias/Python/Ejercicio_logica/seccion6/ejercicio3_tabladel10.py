# Programa que muestra la tabla de multiplicar del 10, del 1 al 50.

# Función que hace la multiplicación, ésta se ejecuta constantemente
def tabla():
    i = 1
    while i <= 50:
        multiplicacion = 10 * i
        print (f" 10 * {i} = {multiplicacion}")
        i += 1
    


print("\n--------------- INICIO ---------------")
tabla()
print("--------------- FINAL ---------------")