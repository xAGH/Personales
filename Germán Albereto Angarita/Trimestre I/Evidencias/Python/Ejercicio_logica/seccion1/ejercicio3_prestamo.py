# Programa que lee el monto de un préstamo y el plazo en meses, y muestra al usuario el valor de las cuotas mensuales pagando un interés fijo del 2.7% mensual.

monto = int(input("Ingrese el monto a pagar: $"))
plazo = int(input("Ingrese el plazo en meses que tiene para pagar dicho monto: "))
interes = 2.7
cuota_mes  = monto / plazo
pago_mes = ((cuota_mes * interes) / 100) + cuota_mes
print(f"La cuota mensual a pagar es de ${round(pago_mes, 2)}")