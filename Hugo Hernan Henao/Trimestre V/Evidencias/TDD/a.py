from time import sleep
limite = int(input("Limite: "))
delimitador = input("Ingrese el delimitador: ") [0]
marcador = input("Ingrese el marcador de progreso: ") [0]
print(delimitador, end="")
for i in range(1, limite + 1):
    porcentaje = round((i * 100) / limite, 1)
    bar = marcador * i
    space = " " * (limite)
    foo = space[:-i]
    if i != limite:
        print(f"Progreso: {porcentaje}%  {delimitador}{bar}{foo}{delimitador}", end="\r")
    else:
        print(f"Progreso: {porcentaje}%  {delimitador}{bar}{foo}{delimitador}")
    sleep(0.2)
