from flask import Flask

app = Flask(__name__)

@app.route("/")
def index():
    return "OK"

if __name__ == '__main__':
    app.run(port=3000, host='0.0.0.0')