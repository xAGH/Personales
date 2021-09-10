# Programa que lew la edad de un usuario y muestre cuántos años tendrá el usuario dentro de tantos años como este indique.

anos = int(input("Ingrese su edad: "))
anos_final = int(input("Ingrese dentro de cuántos años quiere que se haga la operación: "))

anos_resultado = anos + anos_final
print(f"Dentro de {anos_final} años, tendrá {anos_resultado} años")