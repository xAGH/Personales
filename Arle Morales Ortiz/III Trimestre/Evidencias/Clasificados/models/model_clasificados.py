from mysql import connector as sql
from datetime import date

class Clasificados():

    def __init__(self):
        try:
            """Método constructor que inicializa la configuración necesaria para conectar a la base de datos."""
            self.config = {
                'user': "root",
                'password': "Sena1234",
                'host': 'localhost',
                'database': "clasificados",
                'raise_on_warnings': True
            }
        except:
            return 400

    def get_clasificados(self):
        """Método para obtener los clasificados"""
        try:
            db = sql.connect(**self.config)
            cursor = db.cursor()
            cursor.execute("""
            SELECT * FROM producto;
            """)
            data = cursor.fetchall()
            db.close()
            return data

        except:
            return 400

    def get_user_data(self, documento):
        db = sql.connect(**self.config)
        cursor = db.cursor()
        cursor.execute(f"SELECT * FROM propietario WHERE documento = {documento}")
        resultado = cursor.fetchall()
        return resultado
    
    def add_clasificados(self, nombrepro, descripcion, nombrefoto, documento):
        """Método para añadir clasificados."""
        db = sql.connect(**self.config)
        cursor = db.cursor()
        fecha = date.today().strftime('%Y/%m/%d')
        estado = '1'
        cursor.execute("INSERT INTO producto(nombrepro, descripcion, fecha, estado, nombrefoto, documento) VALUES(%s,%s,%s,%s,%s,%s)", 
                (nombrepro, descripcion, fecha, estado, nombrefoto, documento))
        db.commit()
        db.close()
        return 200

    def add_user(self, documento, nombre, email, telefono):
            db = sql.connect(**self.config)
            cursor = db.cursor()
            resultado = self.get_user_data(documento)
            if len(resultado) == 0:
                cursor.execute("INSERT INTO propietario(documento, nombre, email, telefono) VALUES(%s,%s,%s,%s)", 
                        (documento, nombre, email, telefono))
                db.commit()
                db.close()
            
            return 200

    def disable_item(self, idproducto):
        
            db = sql.connect(**self.config)
            cursor = db.cursor()
            cursor.execute(f"UPDATE producto SET estado = '0' WHERE idproducto = {idproducto}")
            db.commit()
            db.close()
            return 200

        


    # def update_clasificados(self, idproducto, documento, nombrepro, descripcion, fecha, nombrefoto):
    #     """Método para actualizar los clasificados."""
    #     try:
    #         db = sql.connect(**self.config)
    #         cursor = db.cursor()
    #         cursor.execute("""
    #         UPDATE producto 
    #         SET(documento={}, nombrepro={}, descripcion={}, fecha={}, nombrefoto={})
    #         WHERE idproducto={}
    #         """.format(documento, nombrepro, descripcion, fecha, nombrefoto, idproducto))
    #         db.commit()
    #         db.close()
    #         return 200

    #     except:
    #         return 400

    # def delete_clasificados(self, idproducto):
    #     """Método para eliminar los clasificados."""
    #     try:
    #         db = sql.connect(**self.config)
    #         cursor = db.cursor()
    #         cursor.execute("DELETE FROM producto WHERE idproducto={}".format(idproducto))
    #         return 200

    #     except:
    #         return 400