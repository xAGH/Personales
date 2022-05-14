from os import getenv

class APP():
    HOST = getenv("APP_HOST")
    PORT = int(getenv("APP_PORT"))
    DEBUG = bool(getenv("APP_DEBUG"))

class DB():
    HOST = getenv("DB_HOST")
    PORT = int(getenv("DB_PORT"))
    NAME = getenv("DB_NAME")
    USER = getenv("DB_USER")
    PASSWORD = getenv("DB_PASSWORD")