import flask

app = flask.Flask(__name__)

@app.route("/", methods=["GET"])
def index():
    return flask.render_template("index.html")

if __name__ == "__main__":
    app.run()