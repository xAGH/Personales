from flask import Flask, request
from Routes import *

app = Flask(__name__)
app.secret_key = "q'9UpcvqOf,C!4NedKKp*r(EVtfFH:4*IpY2f*%Vws:-FdB'h4clwM2AynQn2'RG46:RIzw7aJ1wMtJ"

routes = Routes()

@app.route("/")
def index():
    return routes.index()

@app.route("/registrar_cliente")
def registrar_cliente():
    return routes.form_registro_cliente()

@app.route("/registro_cliente",methods=["POST", "GET"])
def registro_cliente():
    return routes.registro_cliente()

@app.route("/ver_clientes")
def ver_clientes():
    return routes.ver_clientes()

@app.route("/editar_cliente")
def editar_cliente():
    return routes.editar_cliente()

    
@app.route("/update/<uid>", methods=["POST"])
def update(uid):
    return routes.update(uid)

if __name__=='__main__':
    app.run(
        port=5000, 
        debug=True
    )