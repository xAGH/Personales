# Programa que lee dos números y muestre su producto, su cociente, su módulo, su suma y su resta.

numero1 = int(input("Ingrese el primer número: "))
numero2 = int(input("Ingrese el segundo número: "))

suma = numero1 + numero2
resta = numero1 - numero2
multiplicacion = numero1 * numero2
cociente = numero1 / numero2
modulo = numero1 % numero2

print(f"""La suma de los números es {suma}.
La resta de los números es {resta}.
El producto de los números es {multiplicacion}.
El cociente de los números es {cociente}.
El modulo de los números es {modulo}.""")