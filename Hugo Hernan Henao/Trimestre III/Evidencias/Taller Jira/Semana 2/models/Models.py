from mysql import connector as sql

class Models():

    def __init__(self):
        self.config = {
            'user': 'root',
            'password': 'Sena1234',
            'host': 'localhost',
            'database': 'hugo',
            'raise_on_warnings': True
        }

    def crear_cliente(self, nombre, saldo, movil):
        print("entra")
        
        db = sql.connect(**self.config)
        cursor = db.cursor()
        cursor.execute(f"INSERT INTO cliente(nombre, telefono, saldo) VALUES('{nombre}','{movil}',{saldo})")
        db.commit()
        return True
        
       