from pymysql.err import MySQLError
from pymysql.cursors import DictCursor as Dic
from src.config.database import Connection

class Model:

    def open_connection(self):
        self.connection = Connection.open_connection()

    def close_connection(self):
        self.connection.close()

    def fetch_one(self, sql: str, as_dict=False, *args):
        self.open_connection()
        try:
            cur = self.connection.cursor(Dic) if as_dict else self.connection.cursor()
            cur.execute(sql, *args)
            data = cur.fetchone()
            self.close_connection()
            return data

        except MySQLError:
            raise MySQLError

        except Exception:
            raise Exception

    def fetch_all(self, sql: str, as_dict=False, *args):
        self.open_connection()
        try:
            cur = self.connection.cursor(Dic) if as_dict else self.connection.cursor()
            cur.execute(sql, *args)
            data = cur.fetchall()
            self.close_connection()
            return data

        except MySQLError:
            raise MySQLError

        except Exception:
            raise Exception

    def execute_query(self, sql: str, *args):
        self.open_connection()
        try:
            with self.connection.cursor(Dic) as cur:
                cur.execute(sql, *args)
                self.connection.commit()
                self.close_connection()
                return True

        except MySQLError:
            raise MySQLError
        except Exception:

            raise Exception