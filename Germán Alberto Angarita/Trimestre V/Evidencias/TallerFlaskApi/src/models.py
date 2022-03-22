users = []
productos = [
    {
        "id":1,
        "producto":"PC",
        "precio":3000000
    },
    {
        "id":2,
        "producto":"Arroz",
        "precio":2700
    },
    {
        "id":3,
        "producto":"Papa",
        "precio":3000
    },
    {
        "id":4,
        "producto":"Teclado",
        "precio":40000
    },
    {
        "id":5,
        "producto":"Xbox One",
        "precio":120000
    },
]

class UsersModel():

    def add_user(self, nombres, apellidos, edad, ciudad, email, password):
        if self.find_user(email)[0]:
            return True

        users.append({
            email: {
                "nombres": nombres,
                "apellidos": apellidos,
                "edad": edad,
                "ciudad": ciudad,
                "password": password
            }
        })
        return False

    def find_user(self, email):
        for i in range(len(users)):
            if users[i].get(email):
                return True, i

        return False, -1

    def get_users(self, index=None):
        if index is None:
            return users
        try:
            return users[index]
        except:
            return []

class ProductosModel():

    def find_products(self, index):
        for i in range(len(productos)):
            if productos[i].get("id") == index:
                return True, i

        return False, -1

    def get_products(self, index=None):
        if index is None:
            return productos 
        try:
            return productos[index]
        except:
            return []

    def remove_product(self, index):
        try:
            find = self.find_products(index)
            
            if find[0]:
                productos.pop(find[1])
                return True

            return False
        except:
            return False
