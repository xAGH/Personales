from flask import render_template, request, url_for, redirect
from models import model_clasificados as mc
from werkzeug.utils import secure_filename as save
from os import path

model = mc.Clasificados()

class Pages():
    def index(self):
        tittle = "Clasificados"
        contacto = request.args.get("i")
        data = model.get_clasificados()
        if data != 400:
            largor = len(data)
            estado = False
            for i in range(len(data)):
                if data[i][4] == '1':
                    estado = True
            print(estado)
            if contacto:
                data_user = model.get_user_data(contacto)[0]
                nombre = data_user[1]
                email = data_user[2]
                telefono = data_user[3]
                return render_template('index.html', tittle = tittle, data = data, largor = largor, main = 1, user_data = True, nombre = nombre, email = email, telefono = telefono, estado = estado)
                
            return render_template('index.html', tittle = tittle, data = data, largor = largor, main = 1, estado = estado)

        else:
            tittle = "Error"
            return redirect(url_for('error'))

    def subir_clasificado(self):
        data = model.get_clasificados()
        tittle = "Subir Clasificado"
        return render_template('subir_clasificado.html', data = data, tittle=tittle)

    def publicar_clasificado(self, app):
        nombrepro = request.form.get("nombrepro")
        descripcion = request.form.get("descripcion")
        f = request.files['archivo']
        filename = save(f.filename)
        try:
            f.save(path.join(app, filename))
        except:
            pass
        documento = request.form.get("documento")
        nombre = request.form.get("nombre")
        email = request.form.get("email")
        telefono = request.form.get("telefono")
        user_creado = model.add_user(documento, nombre, email, telefono)
        if user_creado == 200:
            anadir_clasificado = model.add_clasificados(nombrepro, descripcion, filename, documento)

            if anadir_clasificado == 200:
                return redirect(url_for('index'))

        return redirect(url_for('error'))

    def admin(self):
        tittle = "Clasificados (Admin)"
        idproducto = request.args.get("product")
        data = model.get_clasificados()
        if data != 400:
            largor = len(data)
            estado = False
            for i in range(len(data)):
                if data[i][4] == '1':
                    estado = True
            if idproducto:
               return self.disabled(idproducto)
                
            return render_template('index.html', tittle = tittle, data = data, largor = largor, main = 1, estado = estado, admin = True)

    def disabled(self, idproducto):
        response = model.disable_item(idproducto)
        if response == 200:
            return redirect(url_for('admin'))

        else:
            return redirect(url_for('error'))
   
    def error(self):
        tittle = "Error"
        return render_template("error.html", tittle=tittle)