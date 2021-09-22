from mysql import connector as sql

class Models():

    def __init__(self):
        self.config = {
            'user': 'root',
            'password': 'alejo23001',
            'host': 'localhost',
            'database': 'hugo',
            'raise_on_warnings': True
        }

    def crear_cliente(self, nombre, saldo, movil):
        print("entra")
        try:
            db = sql.connect(**self.config)
            cursor = db.cursor()
            cursor.execute(f"INSERT INTO cliente(nombre, telefono, saldo) VALUES('{nombre}','{movil}',{saldo})")
            db.commit()
            return True

        except:
            return False

        finally:
            db.close()

    def consultar_clientes(self):
        try:
            db = sql.connect(**self.config)
            cursor = db.cursor()
            cursor.execute(f"SELECT * FROM cliente")
            data = cursor.fetchall()
            return data

        except:
            return False

        finally:
            db.close()

    def buscar_cliente(self, consulta):
        try:
            db = sql.connect(**self.config)
            cursor = db.cursor()
            cursor.execute(f"""SELECT * FROM cliente 
                               WHERE (id LIKE '%{consulta}%') 
                               OR (nombre LIKE '%{consulta}%')
                               OR (telefono LIKE '%{consulta}%') 
                               OR (saldo LIKE '%{consulta}%')""")
            data = cursor.fetchall()
            return data

        except:
            return False

        finally:
            db.close()