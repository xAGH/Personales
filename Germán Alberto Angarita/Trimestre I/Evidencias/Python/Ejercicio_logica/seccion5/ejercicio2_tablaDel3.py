# Programa que imprime la tabla de multiplicar del 3, del 0 al 50.

# Función que hace la multiplicación, ésta se ejecuta constantemente
def tabla():
    for i in range(51):
        multiplicacion = 3 * i
        print (f" 3 * {i} = {multiplicacion}")
    


print("\n--------------- INICIO ---------------")
tabla()
print("--------------- FINAL ---------------")