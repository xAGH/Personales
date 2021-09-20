
from flask import request, redirect, render_template, url_for
from models.Models import *
from Validators.Validator import *

validate = Validator()
model = Models()

class Routes():

    def index(self):
        registrado = request.args.get("registrado")
        title = "Página Principal"
        if registrado:
            return render_template("index.html", title=title, registrado=True)
        return render_template("index.html", title=title)

    def form_registro_cliente(self):
        title = "Registro de cliente"
        return render_template("registro.html", title=title)

    def registro_cliente(self):
        nombre = request.form.get('nombres')
        telefono = request.form.get('telefono')
        saldo = request.form.get('saldo')
        v_nombre = validate.validar_nombre(nombre)
        v_telefono = validate.validar_telefono(telefono)
        v_saldo = validate.validar_saldo(saldo)
        
        if v_nombre != True:
            return render_template("registro.html",error=v_nombre, title = "Registro de cliente")

        elif v_telefono != True:
            return render_template("registro.html",error=v_telefono, title = "Registro de cliente")

        elif v_saldo != True:
            return render_template("registro.html",error=v_saldo)

        else:
            proceso = model.crear_cliente(nombre.title(), abs(float(saldo)), telefono)
            if proceso != False:
                return redirect('http://127.0.0.1:5000/?registrado=True')

            else:
                return redirect(url_for('index'))