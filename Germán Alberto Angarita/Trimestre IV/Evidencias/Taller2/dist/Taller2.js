"use strict";
// Cree una función con un paraḿetro opcional tipo boolean, uno por defecto tipo string, y uno obligatorio de
// tipo number. Haga el llamado a la función.
function Ejercicio1(obligatorio, opcional, defecto = "Por defecto") {
    console.log(opcional);
    console.log(defecto);
    console.log(obligatorio);
}
Ejercicio1(10);
// Cree una variable tipo función que tenga como parámetros dos números y retorne su suma, haga el
// llamado a la función.
const Ejercicio2 = (num1, num2) => {
    return num1 + num2;
};
console.log(Ejercicio2(1, 2));
// Use setTimeOut para implementar un callback que se llame a los 5 segundos e imprima por consola el
// mensaje “HOLA ADSI”
setTimeout(function () {
    console.log("HOLA ADSI");
}, 3000);
//
