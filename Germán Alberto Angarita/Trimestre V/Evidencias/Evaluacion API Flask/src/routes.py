from src.controllers.register_contoller import RegisterController
from src.controllers.login_contoller import LoginController
from src.controllers.product_controller import ProductsController

version = "v01"

routes = {
    "register": f"/api/{version}/register", "register_controller": RegisterController.as_view("register"),
    "login": f"/api/{version}/login", "login_controller": LoginController.as_view("login"),
    "productos": f"/api/{version}/productos", "productos_controller": ProductsController.as_view("productos"),
}
