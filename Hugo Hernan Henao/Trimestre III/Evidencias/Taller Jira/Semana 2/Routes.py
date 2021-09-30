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
        
        proceso = model.crear_cliente(nombre.title(), float(saldo), telefono)
        if proceso != False:
            flash("Se ha registrado correctamente el cliente.")
        
        else:
            flash("Ha ocurrido un error, no se ha registrado al cliente.")

        return redirect(url_for('index'))

    def ver_clientes(self):
        title = "Visualizar clientes"
        consulta = request.args.get('query')
        print(consulta)

        if consulta == None:
            data = model.consultar_clientes()

        else:
            data = model.buscar_cliente(consulta)

        largor = len(data)

        return render_template("visualizar_clientes.html", title = title, data = data, consulta = consulta, largor = largor)

    def editar_cliente(self):
        uid = request.args.get("id")
        data = model.obtener_datos(uid)
        return render_template("editar_cliente.html", data = data)

    def update(self, uid):
        nombre = request.form.get("nombres")
        telefono = request.form.get("telefono")
        saldo = request.form.get("saldo")
        
        proceso = model.editar_cliente(uid, nombre.title(), float(saldo), telefono)
        if proceso != False:
            flash("Se ha editado correctamente el cliente.")
        
        else:
            flash("Ha ocurrido un error, no se ha editado al cliente.")

        return redirect(url_for('ver_clientes'))
