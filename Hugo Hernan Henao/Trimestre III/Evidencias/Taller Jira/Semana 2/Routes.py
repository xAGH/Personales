from flask import request, redirect, render_template, url_for, flash
from Models import *
from Validator import *

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
            proceso = model.crear_cliente(nombre.title(), float(saldo), telefono)
            if proceso != False:
                flash("Se ha registrado correctamente el cliente.")
            
            else:
                flash("Ha ocurrido un error, no se ha registrado al cliente.")

            return redirect(url_for('index'))

    def ver_clientes(self):
        title = "Visualizar clientes"
        consulta = request.args.get('query')

        if consulta == None:
            data = model.consultar_clientes()

        else:
            data = model.buscar_cliente(consulta)

        largor = len(data)

        return render_template("visualizar_clientes.html", title = title, data = data, consulta = consulta, largor = largor)

    def editar_cliente(self):
        uid = request.args.get("id")
        data = model.consultar_clientes()
        return render_template("editar_cliente.html", data = data)

    def update(self, uid):
        nombre = request.form.get("nombres")
        telefono = request.form.get("telefono")
        saldo = request.form.get("saldo")
        v_nombre = validate.validar_nombre(nombre)
        v_telefono = validate.validar_telefono(telefono)
        v_saldo = validate.validar_saldo(saldo)
        
        if v_nombre != True or v_telefono != True or v_saldo != True:

            title = "Editar cliente."

            if v_nombre != True:
                flash(v_nombre)

            if v_telefono != True:
                flash(v_telefono)

            if v_saldo != True:
                flash(v_saldo)

            return redirect(f"http://127.0.0.1:5000/editar_cliente?id={uid}")

        else:
            proceso = model.editar_cliente(uid, nombre.title(), float(saldo), telefono)
            if proceso != False:
                flash("Se ha editado correctamente el cliente.")
            
            else:
                flash("Ha ocurrido un error, no se ha editado al cliente.")

            return redirect(url_for('ver_clientes'))
