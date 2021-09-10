# -*- coding: utf-8 -*-
from flask import Flask, render_template, request
import math

app = Flask(__name__)

# Con esta llave firmamos las cookies
app.secret_key = '54SF4GHAFHGAS4'
productos_user = {}

# Rutas de las interfaces
@app.route('/')
def index():
    tittle = 'Menú Principal'
    return render_template('index.html', tittle=tittle)

@app.route('/interfazsuma')
def interfaz_suma():
    tittle = 'Suma'
    return render_template('suma.html', tittle=tittle)

@app.route('/interfazresta')
def interfaz_resta():
    tittle = 'Resta'
    return render_template('resta.html', tittle=tittle)

@app.route('/interfazfactorial')
def interfaz_factorial():
    tittle = 'Factorial'
    return render_template('factorial.html', tittle=tittle)    

@app.route('/interfazmultiplicar')
def interfaz_multiplicar():
    tittle = 'Multiplicar'
    return render_template('multiplicar.html', tittle=tittle)

@app.route('/interfazdividir')
def interfaz_dividir():
    tittle = 'Dividir'
    return render_template('dividir.html', tittle=tittle)

@app.route('/interfazmodulo')
def interfaz_modulo():
    tittle = 'Módulo'
    return render_template('modulo.html', tittle=tittle)

@app.route('/interfaz_valor_absoluto')
def interfaz_valor_absoluto():
    tittle = 'Valor Absoluto'
    return render_template('absoluto.html', tittle=tittle)

@app.route('/interfazpromedio')
def interfaz_promedio():
    tittle = 'Promedio'
    return render_template('promedio.html', tittle=tittle)

@app.route('/interfazmoda')
def interfaz_moda():
    tittle = 'Moda'
    return render_template('moda.html', tittle=tittle)

@app.route('/interfaz_area_rectangulo')
def interfaz_area_rectangulo():
    tittle = 'Área de un rectángulo'
    return render_template('area_rectangulo.html', tittle=tittle)

@app.route('/interfaz_perimetro_rectangulo')
def interfaz_perimetro_rectangulo():
    tittle = 'Perímetro de un rectángulo'
    return render_template('perimetro_rectangulo.html', tittle=tittle)

@app.route('/interfaz_area_triangulo')
def interfaz_area_triangulo():
    tittle = 'Área de un triángulo'
    return render_template('area_triangulo.html', tittle=tittle)

@app.route('/interfaz_perimetro_triangulo')
def interfaz_perimetro_triangulo():
    tittle = 'Perímetro de un triángulo'
    return render_template('perimetro_triangulo.html', tittle=tittle)

@app.route('/interfaz_area_circulo')
def interfaz_area_circulo():
    tittle = 'Área de un círculo'
    return render_template('area_circulo.html', tittle=tittle)

@app.route('/interfaz_perimetro_circulo')
def interfaz_perimetro_circulo():
    tittle = 'Perímetro de un círculo'
    return render_template('perimetro_circulo.html', tittle=tittle)

@app.route('/interfaz_volumen_esfera')
def interfaz_volumen_esfera():
    tittle = 'Volumen de una esfera'
    return render_template('volumen_esfera.html', tittle=tittle)

@app.route('/interfaz_volumen_cubo')
def interfaz_volumen_cubo():
    tittle = 'Volumen de una cubo'
    return render_template('volumen_cubo.html', tittle=tittle)

#RUTAS QUE REALIZAN LA LOGICA
@app.route('/suma', methods=['POST'])
def suma():
    numero1 = request.form.get("numero1")
    numero2 = request.form.get("numero2")
    suma_num = float(numero1) + float(numero2)
    mensaje = "La suma de {} y {} es : {}".format(numero1,numero2, suma_num)
    return mensaje

@app.route('/resta', methods=['POST'])
def resta():
    numero1 = request.form.get("numero1")
    numero2 = request.form.get("numero2")
    resta_num = int(numero1) - int(numero2)
    mensaje = "La resta de {} y {} es : {}".format(numero1,numero2, resta_num)
    return mensaje

@app.route('/factorial', methods=['POST'])
def factorial():
    numero = int(request.form.get("numero1"))
    if numero == 0:
        resultado = 0
    else:
        factorial = 1
        for i in range(1, numero+1): 
            factorial = factorial * i
            resultado = factorial
        mensaje = f"El factorial de {numero} es : {resultado}"
        return mensaje

@app.route('/multiplicar', methods=['POST'])
def multiplicar():
    numero1 = request.form.get("numero1")
    numero2 = request.form.get("numero2")
    multiplicar_num = int(numero1) * int(numero2)
    mensaje = "La multiplicar de {} y {} es : {}".format(numero1,numero2, multiplicar_num)
    return mensaje

@app.route('/dividir', methods=['POST'])
def dividir():
    numero1 = request.form.get("numero1")
    numero2 = request.form.get("numero2")
    dividir_num = int(numero1) / int(numero2)
    mensaje = "La dividir de {} y {} es : {}".format(numero1,numero2, dividir_num)
    return mensaje

@app.route('/modulo', methods=['POST'])
def modulo():
    numero1 = request.form.get("numero1")
    numero2 = request.form.get("numero2")
    modulo_num = int(numero1) % int(numero2)
    mensaje = "el modulo de {} y {} es : {}".format(numero1,numero2, modulo_num)
    return mensaje

@app.route('/absoluto', methods=['POST'])
def valor_absoluto():
    numero = request.form.get("numero")
    valor_absoluto = abs(int(numero))
    return f"El valor absoluto de {numero} es : {valor_absoluto}"

@app.route('/promedio', methods=['POST'])
def promedio():
    numeros = request.form.get("numeros").replace(" ","").split(",")
    suma = 0
    for i in numeros:
        try:
            suma = suma + float(i)
            resultado = suma / len(numeros)

        except:
            return f"'{i}' no se considera un número"

@app.route('/moda', methods=['POST'])
def moda():
    numeros = request.form.get("numeros").replace(" ","").split(",")
    try:
        for i in numeros:
            float(i)
    except:
        return f"'{i}' no se considera un número"
    contador = len(numeros)
    i = 0
    mayor = 0
    mayores = []
    repeticion = 0
    while i <= contador:
        nuevo_mayor = 0
        for j in range(i, contador):
            if numeros[i] == numeros[j]:
                nuevo_mayor += 1      
        if nuevo_mayor > mayor:
            repeticion = nuevo_mayor
            mayor = nuevo_mayor
            mayores = []
            mayores.append(numeros[i])                       

        elif nuevo_mayor == mayor:
            mayores.append(numeros[i])      
        
        i += 1
    if len(mayores) == 1:
        return f"La moda es el número: {mayores[0]}; con una repeticion de {repeticion} veces."
    
    numeros_moda = ", ".join(mayores)
    return f"La moda son los números: {numeros_moda}; con una repeticion de {repeticion} veces."
    
@app.route('/area_rectangulo', methods=['POST'])
def area_rectangulo():
    ancho = request.form.get("ancho")
    largo = request.form.get("largo")
    try:
        area = float(largo) * float(alto)
        return f"El área del rectángulo con alto {alto} y ancho {largo} es: {round(area, 2)}"
    except:
        return f"Ingresaste caracteres no permitidos."

@app.route('/perimetro_rectangulo', methods=['POST'])
def perimetro_rectangulo():
    alto = request.form.get("alto")
    largo = request.form.get("largo")
    
    try:
        perimetro = (float(largo) * 2) + (float(alto) * 2)
        return f"El perímetro del rectángulo con alto {alto} y ancho {largo} es: {round(perimetro, 2)}cm"

    except:
        return f"Ingresaste caracteres no permitidos."

@app.route('/area_triangulo', methods=['POST'])
def area_triangulo():
    base = request.form.get("base")
    alto = request.form.get("alto")
    try:
        area = (int(base) * int(alto)) / 2
    
    except:
        return f"Ingresaste caracteres no permitidos."

    return f"El área del triángulo de base {base} y de altura {alto} es de : {area}"

@app.route('/perimetro_triangulo', methods=['POST'])
def perimetro_triangulo():
    base = request.form.get("base")
    alto = request.form.get("alto")
    try:
        perimetro = (int(base) + (int(alto) * 2))
    except:
        return f"Ingresaste caracteres no permitidos."
    
    return f"El perimetro de un triangulo de base {base} y de altura {alto} es de : {perimetro}"

@app.route('/area_circulo', methods=['POST'])
def area_circulo():
    radio = request.form.get("radio")
    try:
        area = math.pi * float(radio)**2
    except:
        return f"Ingresaste caracteres no permitidos."

    return f"El  area de un circulo con un radio de {radio} es : {round(area, 4)}"

@app.route('/perimetro_circulo', methods=['POST'])
def perimetro_circulo():
    radio = request.form.get("radio")
    try:   
        perimetro = 2 * math.pi * float(radio)
    except:
        return f"Ingresaste caracteres no permitidos."

    return f"El valor del perimetro (o circunferencia) de un circulo con un radio de {radio} es : {round(perimetro, 4)}"

@app.route('/volumen_esfera', methods=['POST'])
def volumen_esfera():
    radio = request.form.get("radio")
    try:
        volumen = (4/3) * math.pi * float(radio)**3

    except:
        return f"Ingresaste caracteres no permitidos."
    
    return f"El volumen de una esfera con un radio de {radio} es : {round(volumen, 4)}"

#volumen de una esfera
@app.route('/volumen_cubo', methods=['POST'])
def volumen_cubo():
    lado = request.form.get("lado")
    try:
        volumen = float(lado) ** 3

    except:
        return f"Ingresaste caracteres no permitidos."
    
    return f"El valor del volumen de un cubo con una lado de {lado} es : {volumen}"


app.run(debug = True, port=5000)