from pymysql import connect, MySQLError
from os import getenv

class Connection:

    @classmethod
    def open_connection(cls):
        try:
            cls.mysql = connect(host=getenv("DB_HOST"), user=getenv("DB_USER"), password=getenv("DB_PASS"), database=getenv("DB_NAME"), port=getenv("DB_PORT"))
            return cls.mysql
        except MySQLError as me:
            raise me
        except Exception as e:
            print("Error: {0}".format(e))
            raise e