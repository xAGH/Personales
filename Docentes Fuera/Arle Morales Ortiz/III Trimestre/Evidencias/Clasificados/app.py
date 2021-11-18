from flask import Flask
from controllers import logic_routes as control


app = Flask(__name__, template_folder="views")
app.secret_key = "H$j]-%h$QhYZRfsd0VLC;uf9JpVKbfxQ#p&8ZQPR*!E/tX:btC#S>X_G9{tKp5Zq9*h$5V3xB:e477,:"
upload_folder = "./static/images"
app.config['UPLOAD_FOLDER'] = upload_folder

pag = control.Pages()

@app.route('/', methods=['POST', 'GET'])
def index():
    return pag.index()
    
@app.route('/subir_clasificado', methods=['POST', 'GET'])
def subir_clasificado():
    return pag.subir_clasificado()

@app.route('/publicar_clasificado', methods=['POST', 'GET'])
def publicar_clasificado():
    return pag.publicar_clasificado(app.config['UPLOAD_FOLDER'])

@app.route('/admin', methods=['POST', 'GET'])
def admin():
    return pag.admin()

@app.route('/error', methods=['POST', 'GET'])
def error():
    return pag.error()


if __name__ == '__main__':
    app.run(port=8000, debug=True)