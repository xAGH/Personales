from flask import Flask, jsonify, request, make_response
app = Flask(__name__)

products = [
    {
        "Id": 1,
        "Product": "Tv",
        "Price": 1000000
    },
    {
        "Id": 2,
        "Product": "Smarthphone",
        "Price": 800000
    },
    {
        "Id": 3,
        "Product": "PS4",
        "Price": 900000
    },
    {
        "Id": 4,
        "Product": "Radio",
        "Price": 100000
    },
]

@app.route('/', methods=["GET"])
def index():
    return make_response(jsonify({
        "data": products
    }), 200)

if __name__ == '__main__':
    app.run(host='localhost', port=5000, debug=True)
