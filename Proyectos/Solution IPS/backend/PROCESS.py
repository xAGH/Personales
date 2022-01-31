# -*- coding: utf-8 -*-
from flask import Flask, render_template, request, session, redirect, url_for,flash
import pymysql


app = Flask(__name__)

# Renderizacion a Paginas Principales
menuA = "<br><br> - Si desea ir al menu principal:<a href='/'>Volver aqui</a>"

@app.route('/')
def index():
    if "user" in session:
        return render_template('index.html', sesion=True)
    return render_template('index.html', sesion=False)

@app.route('/iniciar_sesion')
def login():
    if "user" in session:
        return render_template('login.html', sesion=True)
    return render_template('login.html', sesion=False)

@app.route('/cambiar_contraseña_usuario')
def contraseña():
    if "user" in session:
        return render_template('cambio_contraseña.html', sesion=True)
    return render_template('cambio_contraseña.html', sesion=False)

@app.route('/formularios_reg')
def formulario_reg():
    if "user" in session:
        return render_template('menu_formulario.html', sesion=True)
    return render_template('menu_formulario.html', sesion=False)

@app.route('/paciente_reg')
def registro1():
    if "user" in session:
        return render_template('registro_paciente.html', sesion=True)
    return render_template('registro_paciente.html', sesion=False)
    
@app.route('/personal_reg')
def registro2():
    if "user" in session:
        return render_template('registro_personal.html', sesion=True)
    return render_template('registro_personal.html', sesion=False)

@app.route('/pagina_de_usuario_inicio')
def pagina_de_usuario():
    if "user" in session:
        return render_template('menu_inicio_sesion.html', sesion=True)
    return f"No tienes una sesion iniciada {menuA}"

@app.route('/solicitud_citas')
def solicitud_cita():
    if "user" in session:
        return render_template('solicitud.html', sesion=True)
    return f"No tienes una sesion iniciada {menuA}"

@app.route('/consultar_citas')
def consulta_cita():
    if "user" in session:
        return render_template('consulta.html', sesion=True)
    return f"No tienes una sesion iniciada {menuA}"

@app.route('/resultado_citas')
def resultado_cita():
    if "user" in session:
        return render_template('resultado_consulta.html', sesion=True)
    return f"No tienes una sesion iniciada {menuA}"

@app.route('/modificacion_citas/<id>')
def modifica_cita(id):
    id= id

    if "user" in session:
        return render_template('modifica.html', id=id, sesion=True)
    return f"No tienes una sesion iniciada {menuA}"


# Procesos internos paginas

@app.route('/registro_paciente1/', methods=['POST'])
def registro1_paciente():
    
    tipoId = request.form.get("tipoId")
    id = request.form.get("id")
    f_exp = request.form.get("f_exp")
    f_nac = request.form.get("f_nac")
    nombres = request.form.get("nombres")
    apellidos = request.form.get("apellidos")
    email = request.form.get("email")
    password = request.form.get("password")
    direccion = request.form.get("direccion")
    celular = request.form.get("celular")
    telefono = request.form.get("telefono")
    
    
    conn = pymysql.connect(
    host="localhost", port=3306, user="root",
    passwd="", db="solution"
    )
    cursor = conn.cursor()
    cursor.execute(
        "INSERT INTO pacientes(tipo_documento, num_documento, fecha_documento, fecha_nacimiento, nombres, apellidos, email, contraseña, direccion, celular, telefono) VALUES(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (tipoId, id,f_exp,f_nac,nombres,apellidos,email,password,direccion,celular, telefono)
    )

    conn.commit()
    conn.close()

    # Scrib para envio de correo
    import smtplib
    from email.mime.multipart import MIMEMultipart
    from email.mime.text import MIMEText

   
    #credenciales
    proveedor_correo = 'smtp.live.com: 587'
    remitente = 'adsitop.facturacion@hotmail.com'
    password = 'ADSI2021L3J'
    #conexion a servidor
    servidor = smtplib.SMTP(proveedor_correo)
    servidor.starttls()
    servidor.ehlo()
    #autenticacion
    servidor.login(remitente, password)
    #mensaje 
    mensaje = """
    <html>

    <p style="text-align: center;">Hola&nbsp;{}</p>
    <p>Te haz registrado satisfactoriamente, con los siguientes datos:</p>
    <p>&nbsp;</p>
    <table style="height: 180px; width: 100%; border-collapse: collapse;" border="1">
    <tbody>
    <tr style="height: 18px;">
    <td style="width: 50%; height: 18px;">Tipo de Documento&nbsp;</td>
    <td style="width: 50%; height: 18px;">&nbsp;{}</td>
    </tr>
    <tr style="height: 18px;">
    <td style="width: 50%; height: 18px;">Numero de documento</td>
    <td style="width: 50%; height: 18px;">&nbsp;{}</td>
    </tr>
    <tr style="height: 18px;">
    <td style="width: 50%; height: 18px;">Fecha de expedici&oacute;n del documento</td>
    <td style="width: 50%; height: 18px;">&nbsp;{}</td>
    </tr>
    <tr style="height: 18px;">
    <td style="width: 50%; height: 18px;">Fecha de nacimiento</td>
    <td style="width: 50%; height: 18px;">&nbsp;{}</td>
    </tr>
    <tr style="height: 18px;">
    <td style="width: 50%; height: 18px;">Nombres</td>
    <td style="width: 50%; height: 18px;">&nbsp;{}</td>
    </tr>
    <tr style="height: 18px;">
    <td style="width: 50%; height: 18px;">Apellidos</td>
    <td style="width: 50%; height: 18px;">&nbsp;{}</td>
    </tr>
    <tr style="height: 18px;">
    <td style="width: 50%; height: 18px;">Correo electronico</td>
    <td style="width: 50%; height: 18px;">&nbsp;{}</td>
    </tr>
    <tr style="height: 18px;">
    <td style="width: 50%; height: 18px;">Contrase&ntilde;a</td>
    <td style="width: 50%; height: 18px;">*******</td>
    </tr>
    <tr style="height: 18px;">
    <td style="width: 50%; height: 18px;">Direcci&oacute;n</td>
    <td style="width: 50%; height: 18px;">&nbsp;{}</td>
    </tr>
    <tr style="height: 18px;">
    <td style="width: 50%; height: 18px;">Celular</td>
    <td style="width: 50%; height: 18px;">&nbsp;{}</td>
    </tr>
    <tr>
    <td style="width: 50%;">Telefono fijo</td>
    <td style="width: 50%;">&nbsp{};</td>
    </tr>
    </tbody>
    </table>
    <p>&nbsp;</p>
    <p style="text-align: center;">Gracias por su registro</p>
    <p style="text-align: center;">Cualquier inquietud comunicate con la linea 0180009632587</p>
    <p>&nbsp;</p>
    <p>&nbsp;</p>
    <p>&nbsp;</p>
    <p>&nbsp;</p>
    <p>&nbsp;</p>
    <p>&nbsp;</p>
    <p>&nbsp;</p>
    </html>
    
    
    
    """.format(nombres,tipoId,id,f_exp,f_nac,nombres,apellidos,email,direccion,celular, telefono)
    
    
    
    
    
    
    #"<h1> Hola {} {} Se ha registrado ***EXITOSAMENTE*** </h1>".format(nombres,apellidos) 

    msg = MIMEMultipart()
    msg.attach(MIMEText(mensaje, 'html'))
    msg['From'] = remitente
    msg['To'] = 'adsitop.facturacion@hotmail.com'
    msg['Subject'] = 'CONFIRMACION DE REGISTRO'
    servidor.sendmail(msg['From'] , msg['To'], msg.as_string())

    respuesta = "Hola {} {} Se ha registrado ***EXITOSAMENTE*** ".format(nombres,apellidos)
    return render_template("index.html", mensaje = respuesta)

@app.route('/registro_personal1', methods=['POST'])
def registro1_personal():
    tipoId = request.form.get("tipoId")
    id = request.form.get("id")
    f_exp = request.form.get("f_exp")
    f_nac = request.form.get("f_nac")
    nombres = request.form.get("nombres")
    apellidos = request.form.get("apellidos")
    email = request.form.get("email")
    password = request.form.get("password")
    direccion = request.form.get("direccion")
    celular = request.form.get("celular")
    telefono = request.form.get("telefono")
    rolUsuario = request.form.get("rolUsuario")
    tarjeta_Prof = request.form.get("tarjeta_Prof")

    conn = pymysql.connect(
    host="localhost", port=3306, user="root",
    passwd="", db="solution"
    )
    cursor = conn.cursor()
    cursor.execute(
        "INSERT INTO personal(tipo_documento, nume_documento, fecha_documento, fecha_nacimiento, nombres, apellidos, email, contraseña, direccion, celular, telefono,rol,tp) VALUES(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", (tipoId, id,f_exp,f_nac,nombres,apellidos,email,password,direccion,celular, telefono,rolUsuario,tarjeta_Prof)
    )

    conn.commit()
    conn.close()

    # Scrib para envio de correo
    import smtplib
    from email.mime.multipart import MIMEMultipart
    from email.mime.text import MIMEText

   
    #credenciales
    proveedor_correo = 'smtp.live.com: 587'
    remitente = 'adsitop.facturacion@hotmail.com'
    password = 'ADSI2021L3J'
    #conexion a servidor
    servidor = smtplib.SMTP(proveedor_correo)
    servidor.starttls()
    servidor.ehlo()
    #autenticacion
    servidor.login(remitente, password)
    #mensaje 
    mensaje = "<h1> Hola {} {} Se ha registrado ***EXITOSAMENTE*** </h1>".format(nombres,apellidos) 
    msg = MIMEMultipart()
    msg.attach(MIMEText(mensaje, 'html'))
    msg['From'] = remitente
    msg['To'] = 'adsitop.facturacion@hotmail.com'
    msg['Subject'] = 'CONFIRMACION DE REGISTRO'
    servidor.sendmail(msg['From'] , msg['To'], msg.as_string())

    respuesta = "Hola {} {} Se ha registrado ***EXITOSAMENTE*** ".format(nombres,apellidos)
    return render_template("index.html", mensaje = respuesta)

@app.route('/iniciar_sesion', methods=['POST'])
def inicio():
    tipoId = request.form.get("tipoId")
    rol = request.form.get("rol")
    id = request.form.get("id")
    password = request.form.get("password")

    conn = pymysql.connect(
    host="localhost", port=3306, user="root",
    passwd="", db="solution"
    )
    
    if rol == "paciente":
        cursor = conn.cursor()
        cursor.execute(
            "SELECT num_documento,contraseña, nombres FROM pacientes WHERE num_documento=%s", (id, )
        
        )
        conn.commit()
        conn.close()
        pacientes = cursor.fetchone()
        if pacientes:
            if len(pacientes)>0:
    
                if (pacientes[1] == password) and (pacientes[0] == id):

                    session["user"] = id
                respuesta = f"Has iniciado sesion correctamente {pacientes[2]}"
                return render_template("index.html", mensaje = respuesta)
        return "No has podido iniciar sesion. Password incorrecto {}".format(menuA)
    
    elif rol== "personal":
        conn = pymysql.connect(
        host="localhost", port=3306, user="root",
        passwd="", db="solution"
        )
        cursor1 = conn.cursor()
        cursor1.execute(
            "SELECT nume_documento,contraseña FROM personal WHERE num_documento=%s", (id, )
        )
        conn.commit()
        conn.close()
        #pacientes = cursor.fetchone()
        #print(pacientes)

        personal = cursor1.fetchone()
    
       
        if len(personal)>0:

            if (personal[1] == password) and (personal[0] == id):

                session["user"] = id

            return "Has iniciado sesion correctamente{}".format(menuA)
            
        return "No has podido iniciar sesion. Password incorrecto"        
    else:
        return "Aun no estas registrado en nuestro sistema, por favor llena el formulario para tu registro"
    

@app.route('/cerrado_sesion')
def logout():
    if "user" in session:
        session.pop("user")
        respuesta = f"Has cerrado la sesion correctamente"
        return render_template("index.html", mensaje = respuesta)
    respuesta = "No tienes una sesion iniciada "
    return render_template("index.html", mensaje = respuesta)

@app.route('/cambiar_contraseña_usuario', methods=['POST'])
def cambio_contraseña():
    tipoId = request.form.get("tipoId")
    id = request.form.get("id")
    f_exp = request.form.get("f_exp")
    f_nac = request.form.get("f_nac")
    password = request.form.get("password")
    password2 = request.form.get("repeatpassword")
    
    conn = pymysql.connect(
    host="localhost", port=3306, user="root",
    passwd="", db="solution"
    )
    cursor = conn.cursor()
    cursor.execute(
        "UPDATE pacientes set contraseña=password WHERE num_documento=%s", (id)
        
    )
    conn.commit()
    conn.close()
    
    """
    contra = cursor.fetchone()

    print(contra)

    if password != password2:
        return "Su contraseña no coincide intentelo nuevamente"

    elif len(contra)>0:
    
        if (contra[5] == id):

            return "Usuario {}, tienes una cita de ---{}---, con el Doctor ---{}---, el dia ---{}---, a las ---{}--- {}".format(cita[5],cita[4],cita[3],cita[1],cita[2],menuA)
        else:
        
            return "Usuario NO Tienes Reservada una cita  ***RESERVA UNA CITA*** {}".format(menuA)

    
    
    else:
        return "{} Haz Cambiado tu contraseña ***EXITOSAMENTE*** {} ".format(id, menuA)

    """

@app.route('/solicitud_citas', methods=['POST'])
def solicitudCita3():

    if "user" in session:
        f_cit = request.form.get("fecha_cita")
        medico = request.form.get("medico")
        h_cita = request.form.get("hora_cita")
        paciente = request.form.get("id")
        especialidad = request.form.get("especialidad")
        
        """cita[id] = {"especialidad":especialidad, "fecha_cita":f_cit, "medico":medico, "hora_cita":h_cita, "id":id}"""
        
        conn = pymysql.connect(
        host="localhost", port=3306, user="root",
        passwd="", db="solution"
        )
        cursor = conn.cursor()
        cursor.execute(
            "INSERT INTO citas(fecha_cita,hora_cita,medico,especialidad,paciente) VALUES(%s, %s, %s, %s, %s)", (f_cit,h_cita,medico,especialidad,paciente)
        )

        conn.commit()
        cursor.execute(
            "SELECT nombres, apellidos from pacientes where num_documento = %s", (paciente)
        )

        nombres = cursor.fetchone()
        conn.close()


        #return "cita asignada" 

    
        # Scrib para envio de correo
        import smtplib
        from email.mime.multipart import MIMEMultipart
        from email.mime.image import MIMEImage
        from email.mime.text import MIMEText

    
        #credenciales
        proveedor_correo = 'smtp.live.com: 587'
        remitente = 'adsitop.facturacion@hotmail.com'
        password = 'ADSI2021L3J'
        #conexion a servidor
        servidor = smtplib.SMTP(proveedor_correo)
        servidor.starttls()
        servidor.ehlo()
        #autenticacion
        servidor.login(remitente, password)
        """file = open("static/img/solution.PNG", "rb")
        attach_image = MIMEImage(file.read())
        attach_image.add_header('Content-Disposition', 'attachment; filename = "static/img/solution.PNG"')"""
        
        
        
        #mensaje 
        mensaje = """
        <html>

        <p style="text-align: center;"><strong>Buen dia,&nbsp;</strong></p>
        <p>Se&ntilde;or(a):&nbsp; {} {}</p>
        <p>Usted asigno una cita de: {}</p>
        <p>Con el profesional: {}</p>
        <p>El dia: {}</p>
        <p>A las: {}</p>
        <p>&nbsp;</p>
        <p style="text-align: center;"><strong><em>Recuerde estar 20 minutos antes de su cita para procesos administrativos, si desea cancelar su cita no olvide hacerlo minimo 3 horas antes.</em></strong></p>
        <p>&nbsp;</p>
        <p style="text-align: center;">Gracias por confiar en nosotros.</p>
        <p>&nbsp;</p>
        <img src="{{url_for('static', filename = 'img/solution.png')}}" />

        </html>
               
        """.format(nombres[0],nombres[1],especialidad,medico,f_cit,h_cita)
        
        msg = MIMEMultipart()
        #msg.attach(attach_image)
        msg.attach(MIMEText(mensaje, 'html'))
        msg['From'] = remitente
        msg['To'] = 'adsitop.facturacion@hotmail.com'
        msg['Subject'] = 'SU CITA HA SIDO ASIGNADA'
        servidor.sendmail(msg['From'] , msg['To'], msg.as_string())
        respuesta = "Haz Reservado tu cita de {} **EXITOSAMENTE** con el medico  {} --------".format(especialidad,medico)
        
        return render_template("index.html", mensaje = respuesta)
    return f"No tienes una sesion iniciada {menuA}"


@app.route('/consultar_citas', methods=['POST'])
def consulta_cita2():
    if "user" in session:
        tipoId = request.form.get("tipoId")
        id = request.form.get("id")
        
        conn = pymysql.connect(
            host="localhost", port=3306, user="root",
            passwd="", db="solution"
            )
        cursor = conn.cursor()
        cursor.execute(
            "SELECT * FROM citas WHERE paciente=%s", (id )
            
        )
        conn.commit()
        conn.close()

        citas = cursor.fetchall()

    print(citas)

    if len(citas)>0:
        a = len(citas)
         
        
        #if (cita[5] == id):

        return render_template('resultado_consulta.html', citas=citas,a=a)
            #"usted tiene las siguientes citas {} {}".format(citas,menuA)
            #return "Usuario {}, tienes una cita de ------, con el Doctor ------, el dia ------, a las ------ ".format(cita)
    else:
        
        #return "Usuario NO Tienes Reservada una cita  ***RESERVA UNA CITA*** {}".format(menuA)
        respuesta ="Usuario usted no cuenta con una cita asiganda" 
        return render_template('consulta.html', mensaje = respuesta)

@app.route('/actualizacion_cita/<id>', methods=['POST'])
def actualizacion_cita(id):
    id= id
    f_cit = request.form.get("fecha_cita")
    medico = request.form.get("medico")
    h_cita = request.form.get("hora_cita")
    paciente = request.form.get("id")
    especialidad = request.form.get("especialidad")
    conn = pymysql.connect(
    host="localhost", port=3306, user="root",
    passwd="", db="solution"
    )
    cursor = conn.cursor()
    cursor.execute(
        "UPDATE citas set fecha_cita=%s, hora_cita=%s, medico=%s,especialidad=%s WHERE idcitas=%s", (f_cit,h_cita,medico,especialidad,id)
            
    )
    conn.commit()
    conn.close()

    # Scrib para envio de correo
    import smtplib
    from email.mime.multipart import MIMEMultipart
    #from email.mime.image import MIMEImage
    from email.mime.text import MIMEText

    
    #credenciales
    proveedor_correo = 'smtp.live.com: 587'
    remitente = 'adsitop.facturacion@hotmail.com'
    password = 'ADSI2021L3J'
    #conexion a servidor
    servidor = smtplib.SMTP(proveedor_correo)
    servidor.starttls()
    servidor.ehlo()
        #autenticacion
    servidor.login(remitente, password)
    """file = open("static/img/solution.PNG", "rb")
    attach_image = MIMEImage(file.read())
    attach_image.add_header('Content-Disposition', 'attachment; filename = "static/img/solution.PNG"')"""
        
        
        
    #mensaje 
    mensaje = """
        <html>

        <p style="text-align: center;"><strong>Buen dia,&nbsp;</strong></p>
        <p>Estimado(a) Usuario(a):&nbsp;</p>
        <p>Usted Reasigno su cita de: {}</p>
        <p>Con el profesional: {}</p>
        <p>El dia: {}</p>
        <p>A las: {}</p>
        <p>&nbsp;</p>
        <p style="text-align: center;"><strong><em>Recuerde estar 20 minutos antes de su cita para procesos administrativos, si desea cancelar su cita no olvide hacerlo minimo 3 horas antes.</em></strong></p>
        <p>&nbsp;</p>
        <p style="text-align: center;">Gracias por confiar en nosotros.</p>
        <p>&nbsp;</p>
        <img src="{{url_for('static', filename = 'img/solution.png')}}" />

        </html>
               
        """.format(especialidad,medico,f_cit,h_cita)
        
    msg = MIMEMultipart()
    #msg.attach(attach_image)
    msg.attach(MIMEText(mensaje, 'html'))
    msg['From'] = remitente
    msg['To'] = 'adsitop.facturacion@hotmail.com'
    msg['Subject'] = 'SU CITA HA SIDO MODIFICADA'
    servidor.sendmail(msg['From'] , msg['To'], msg.as_string())
    respuesta = "Haz Modificado tu cita de {} **EXITOSAMENTE** con el medico  {} --------".format(especialidad,medico)
        
    return render_template("index.html", mensaje = respuesta)
    #return "Usuario NO Tienes Reservada una cita  ***RESERVA UNA CITA*** {}".format(menuA)   
    #return "Cambio con exito"


@app.route('/eliminar_citas/<id>')
def eliminar_cita(id):
    id= id
    if "user" in session:
        conn = pymysql.connect(
        host="localhost", port=3306, user="root",
        passwd="", db="solution"
        )
        cursor = conn.cursor()
        cursor.execute(
            "DELETE FROM citas WHERE idcitas=%s", (id)
                
        )
        conn.commit()
        conn.close()  
        respuesta = "Haz Eliminado Tu cita con Éxito"  
        return render_template('consulta.html', mensaje = respuesta)
    
    respuesta ="Usuario no tiene una cita reservada" 
    return render_template('consulta.html', mensaje = respuesta)



app.run(debug = True, port=5000)