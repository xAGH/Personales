from flask import Flask

app = Flask(__name__)

app.secret_key = "q'9UpcvqOf,C!4NedKKp*r(EVtfFH:4*IpY2f*%Vws:-FdB'h4clwM2AynQn2'RG46:RIzw7aJ1wMtJ"



if __name__=='__main__':
    app.run(port=5000, debug=True)
