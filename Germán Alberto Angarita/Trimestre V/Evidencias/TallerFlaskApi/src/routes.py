from src.controllers import *

# Api version: 2022-03-14
api_version = "/api/v01"

# Rutas de autenticación
auth = {
    "register": f"{api_version}/registeruser", "register_controller": RegisterController.as_view("register")
}