from src.controllers import *

routes = {
    "ejercicio1":"/ruta_comsulta/<domicilio>", "ejercicio1_controller": Ejercicio1Controller.as_view("ejercicio1"),
    "ejercicio2":"/ruta_json/<id>/<peso>", "ejercicio2_controller": Ejercicio2Controller.as_view("ejercicio2"),
    "ejercicio3":"/consulta_json_headers", "ejercicio3_controller": Ejercicio3Controller.as_view("ejercicio3"),
    "ejercicio4":"/consulta_json_headers", "ejercicio4_controller": Ejercicio4Controller.as_view("ejercicio4"),
    "ejercicio5":"/consulta_ruta_headers/<cantidad>/<marca>", "ejercicio5_controller": Ejercicio5Controller.as_view("ejercicio5"),
}