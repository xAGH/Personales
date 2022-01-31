from src.controllers.public_controllers import *

public: dict = {
    "index":"/", "index_controller": IndexController.as_view("index"),
    
}

def error():
    return "Nada"

errors: dict = {
    "not_found": 404, "manejo": error() 
}