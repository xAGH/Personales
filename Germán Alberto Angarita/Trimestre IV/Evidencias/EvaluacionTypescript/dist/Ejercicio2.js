"use strict";
/*
  Cree tres promesas promesa1, promesa2 y promesa3, de tal manera que la promesa1
  siempre se resuelva con el entero 5, que la promesa2 tenga dos opciones, resolverse o
  rechazarse; de tal forma que si se resuelva lo haga con el entero 6 ,
  pero si se rechaza lo haga lanzando un error “Ha ocurrido un error desconocido en la
  promesa 2”. Por último, la promesa3 siempre se debe resolver con el entero 9.
  Encadene las promesas de tal manera que cuando la promesa1 se cumpla, imprima desde su .then
  el valor con el que se resolvió elevado al cuadrado y retorne la promesa2 y cuando ésta
  última se cumpla, imprima desde su .then el valor con el que se resolvió elevado al cubo
  y retorne la promesa3, y cuando la promesa 3 se cumpla imprima desde su .then el valor con
  el que se resolvió multiplicado por -1. Implemente .catch para manejar el error que puede
  ocurrir en la promesa2, en caso de que ocurra el rechazo, imprima el mensaje del error
  mediante err.message.
*/
Object.defineProperty(exports, "__esModule", { value: true });
exports.Promesas = void 0;
class Promesas {
    constructor() {
        this.promesa1 = Promise.resolve(5);
        this.promesa2 = new Promise((resolve, reject) => {
            let estado = true;
            if (estado) {
                resolve(6);
            }
            else {
                reject(new Error("Ha ocurrido un error desconocido en la promesa 2."));
            }
        });
        this.promesa3 = Promise.resolve(9);
    }
    resolver() {
        this.promesa1.then((res) => {
            console.log("Respues de la promesa 1: " + (Math.pow(res, 2)));
            return this.promesa2.then((res2) => {
                console.log("Respues de la promesa 2: " + (Math.pow(res2, 3)));
                return this.promesa3.then((res3) => {
                    console.log("Respues de la promesa 3: " + (res3 * (-1)));
                });
            }).catch((err) => {
                console.log(err.message);
            });
        });
    }
}
exports.Promesas = Promesas;
new Promesas().resolver();
