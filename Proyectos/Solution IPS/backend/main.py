from webbrowser import get
from src.app import Aplication
from os import getenv
from dotenv import load_dotenv

load_dotenv()

app = Aplication.create_app()

if __name__ == '__main__':
    app.run(getenv("APP_HOST"), getenv("APP_PORT"), getenv("APP_DEBUG"))