from src.controllers import *

# Api version: 2022-03-14
api_version = "/api/v01"

# Rutas de autenticación
routes = {
    "register": f"{api_version}/registeruser", "register_controller": RegisterController.as_view("register"),
    "login": f"{api_version}/login", "login_controller":LoginController.as_view("login"),
    "productos": f"{api_version}/productos", "productos_controller": ProductosController.as_view("productos"),
    "compras": f"{api_version}/comprar", "compras_controller": ComprasController.as_view("compras")
}