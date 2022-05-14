from dotenv import load_dotenv
load_dotenv()
from os import getenv
from src.app import Aplication

app = Aplication.create_app()

if __name__ == '__main__':
    app.run(
        port=int(getenv("PORT")),
        host=getenv("HOST"),
        debug=bool(getenv("DEBUG"))
    )