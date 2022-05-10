from flask import Flask, jsonify, request, make_response
from flask_cors import CORS
app = Flask(__name__)

CORS(app, resources={
               r"/*": {
                   "origins": ["http://localhost:4200", "*"]
               }
            }, supports_credentials=True)

products = [
    {
        "id": 1,
        "product": "Tv",
        "price": 1000000
    },
    {
        "id": 2,
        "product": "Smarthphone",
        "price": 800000
    },
    {
        "id": 3,
        "product": "PS4",
        "price": 900000
    },
    {
        "id": 4,
        "product": "Radio",
        "price": 100000
    },
    {
        "id": 5,
        "product": "PC",
        "price": 400000
    },
]

@app.route('/', methods=["GET"])
def index():
    return make_response(jsonify({
        "data": products
    }), 200)

if __name__ == '__main__':
    app.run(host='localhost', port=5000, debug=True)
