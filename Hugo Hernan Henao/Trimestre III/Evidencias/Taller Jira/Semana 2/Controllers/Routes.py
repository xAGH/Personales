from flask import request, redirect, render_template, url_for, flash
from models.Models import *
from Validators.Validator import *

validate = Validator()
model = Models()

class Routes():

    def index(self):
        title = "Página Principal"
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
        
        if v_nombre != True or v_telefono != True or v_saldo != True:

            title = "Registro de cliente"

            if v_nombre != True:
                flash(v_nombre)

            if v_telefono != True:
                flash(v_telefono)

            if v_saldo != True:
                flash(v_saldo)

            return redirect(url_for("registrar_cliente"))

        else:
            proceso = model.crear_cliente(nombre.title(), abs(float(saldo)), telefono)
            if proceso != False:
                flash("Se ha registrado correctamente el cliente.")
            
            else:
                flash("Ha ocurrido un error, no se ha registrado al cliente.")

            return redirect(url_for('index'))

    def ver_clientes(self, data=None):
        title = "Visualizar clientes"

        if data == None:
            data = model.consultar_clientes()

        return render_template("visualizar_clientes.html", title = title, data = data)

    def buscar_cliente(self):
        consulta = request.form.get('consulta')
        print(type(consulta))
        data = model.buscar_cliente(consulta)
        return self.ver_clientes(data)