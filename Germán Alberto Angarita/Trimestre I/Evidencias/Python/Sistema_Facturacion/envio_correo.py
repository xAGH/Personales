# Librería
import smtplib

# Módulos necesarios
from email.mime.multipart import MIMEMultipart
from email.mime.image import MIMEImage
from email.mime.text import MIMEText

# Plantilla del mensaje
def mensaje_html():
    mensaje = "Prueba"
    return mensaje 


# Creamos objeto Multipart, quien será el recipiente que enviaremos
msg = MIMEMultipart()
msg['From']="EMAIL DESDE  EL CUAL SERA ENVIADO"
msg['To']= "EMAIL"
msg['Subject']="ASUNTO"

# Adjuntamos imagen
file = open("AdsiTop.PNG", "rb")
attach_image = MIMEImage(file.read())
attach_image.add_header('Content-Disposition', 'attachment; filename = "AdsiTop.png"')
msg.attach(attach_image)

# Adjuntamos mensaje
mensaje = mensaje_html()
msg.attach(MIMEText(mensaje, 'html'))

# Autenticamos
mailServer = smtplib.SMTP('smtp.live.com',587)
mailServer.starttls()
mailServer.login("EMAIL","CONTRASEÑA")

# Enviamos
mailServer.sendmail("adstitopfacturacion@outlook.com", "EMAIL", msg.as_string())

# Cerramos conexión
mailServer.close()