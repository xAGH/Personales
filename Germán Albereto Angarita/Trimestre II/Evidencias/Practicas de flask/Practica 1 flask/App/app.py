from flask import Flask, render_template, request, redirect, url_for, jsonify

app = Flask(__name__)
compras = []
usuarios = []

# Página principal.
@app.route('/')
def index():
    tittle = "Menú Principal"
    return render_template('index.html', tittle = tittle)

@app.route('/registro', methods=['POST'])
def registro():
    nombre = request.form.get('nombre')
    email = request.form.get('email')
    contrasena = request.form.get('contrasena')
    contrasena2 = request.form.get('contrasena2')
    if contrasena == contrasena2:
        user = {email:[nombre,contrasena]}
        usuarios.append(user)
        return jsonify(nombre=nombre, email=email, contrasena=contrasena, contrasena2=contrasena2)
    
    return "Error"

@app.route('/login', methods=['POST'])
def login():
    return

app.run(debug=True, port=5000)