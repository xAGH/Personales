from flask import Flask, request, jsonify

app = Flask(__name__)

@app.route('/registro_persona/<domicilio>', methods=['POST']) # Se reciben los datos por parámetros en la ruta y por parámetros de consult(string query)
def registro_persona(domicilio):
    domicilio = domicilio
    cc = request.args.get('cc')
    nombres = request.args.get('nombres')
    apellidos = request.args.get('apellidos')
    return jsonify({"Status":"Los datos se han recibido correctamente", "Datos ingresados:":{"Domicilio: ":domicilio,"C.C: ":cc,"Nombres: ":nombres, "Apellidos: ":apellidos}}), 200

@app.route('/registro_articulo/<id>/<peso>', methods=['POST']) # Se reciben los datos por parámetros en la ruta y propiedades de un Json
def registro_articulo(id, peso):
    id = id
    peso = peso 
    content = request.get_json()
    alto = content["alto"]
    ancho = content["ancho"]
    return jsonify({"Status":"Los datos se han recibido correctamente", "Datos ingresados:":{"Id : ":id,"Peso: ":peso,"Alto: ":alto, "Ancho: ":ancho}}), 200

@app.route('/borrado_usuario', methods=['DELETE']) # Se reciben los datos por parámetros de consulta, propiedades de un Json y por medio de cabeceras.
def borrado_usuario():
    cc = request.args.get('cc')
    content = request.get_json()
    motivo = content['motivo']
    id = request.headers.get('id')
    return jsonify({"Status":"Los datos se han eliminado correctamente", "Datos eliminados:":{"C.C: ":cc,"Motivo: ":motivo,"Id: ":id}}), 200

@app.route('/actualizacion_usuario', methods=['PUT']) # Se reciben los datos por parámetros de consulta, propiedades de un Json y por medio de cabeceras.
def actualizacion_usuario():
    cc = request.args.get('cc')
    content = request.get_json()
    apellidos = content['apellidos']
    domicilio = request.headers.get('domicilio')
    return jsonify({"Status":"Los datos se han actualizado correctamente", "Datos actualizados:":{"C.C: ":cc,"Apellidos: ":apellidos,"Domicilio: ":domicilio}}), 200

@app.route("/registro_actualizacion_usuario/<cantidad>/<marca>", methods=['GET']) # Se reciben los datos por parámetros de consulta, parámetros de ruta y header.
def registro_actualizacion_usuario(cantidad, marca):
    precio = request.args.get('precio')
    cantidad = cantidad
    marca = marca
    domicilio = request.headers.get('domicilio')
    return jsonify({"Status":"Se han registrado los datos actualizados correctamente", "Registro de datos actualizados:":{"Precio: ":precio, "Cantidad: ":cantidad,"Marca: ":marca, "Domicilio :":domicilio}}), 200

app.run(debug = True, port=5000)