from mysql import connector as sql

class ManageDB():
   
    config = {
        'user': 'root',
        'password': '',
        'host': 'localhost',
        'database': 'hugo',
        'raise_on_warnings': True
    }

    def start(self):
        self.db = sql.connect(**self.config)
        self.cursor = self.db.cursor()

    def fetch_all(self, query):
        try:
            self.start()
            self.cursor.execute(query)
            data = self.cursor.fetchall()
            return data

        except:
            return 400
        
        finally:
            self.db.close()

    def fetch_one(self, query):
        try:
            self.start()
            self.cursor.execute(query)
            data = self.cursor.fetchone()
            return data

        except:
            return 400
        
        finally:
            self.db.close()

    def do_commit(self, query):
        try:
            self.start()
            self.cursor.execute(query)
            self.db.commit()
            return True

        except:
            return False

        finally:
            self.db.close()


class Models(ManageDB):

    def crear_cliente(self, nombre, saldo, movil):
        return  self.do_commit(f"INSERT INTO cliente(nombre, telefono, saldo) VALUES('{nombre}','{movil}',{saldo})")

    def consultar_clientes(self):
        return self.fetch_all(f"SELECT * FROM cliente")

    def buscar_cliente(self, consulta):
        return self.fetch_all(f"""SELECT * FROM cliente 
                               WHERE (id LIKE '%{consulta}%') 
                               OR (nombre LIKE '%{consulta}%')
                               OR (telefono LIKE '%{consulta}%') 
                               OR (saldo LIKE '%{consulta}%')""")


    def editar_cliente(self, uid, nombre, saldo, telefono):
        return self.do_commit(f"""UPDATE cliente 
                                  SET nombre = '{nombre}', 
                                  telefono = '{telefono}', 
                                  saldo = {saldo}
                                  WHERE id = {uid}""")

    def obtener_datos(self, uid):
        return self.fetch_one(f"SELECT * FROM cliente WHERE id = {uid}")