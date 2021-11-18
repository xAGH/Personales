"use strict";
// Declare dos variables logicas.
let variableLogica1 = false;
let variableLogica2 = true;
// Declare dos variables numericas.
let variableNumerica1 = 10;
let variableNumerica2 = -10;
// Declare dos variables any.
let variableAny1 = true;
let variableAny2 = "Any 2";
// Declare dos variables string.
let variableString1 = "Cadena 1";
let variableString2 = "Cadena 2";
// Cree una plantilla de strings para mostrar un mensaje de bienvenida al usuario luego de
// registrarse en nuestro sitio, por ejemplo. “Bienvenida Paula Pérez a nuestro sitio web, gracias por
// registrarte”. Este template debe usar dos variables, nombres y apellidos
let nombres = "Paula";
let apellidos = "Pérez";
console.log(`Bienvenida ${nombres} ${apellidos} a nuestro sitio web, gracias por registrarte`);
// Declaracion e impresion de dos arrays.
let numeros = [1, 2, 3, 4, 5];
let cadenas = ["Elemento1", "Elemento2", "Elemento3", "Elemento4", "Elemento5"];
// Impresion de los anteriores arrays
for (const iterator of numeros) {
    console.log(iterator);
}
for (const iterator2 of cadenas) {
    console.log(iterator2);
}
// Declaracion de objetos
let diasSemana = {
    "1": "Lunes",
    "2": "Martes",
    "3": "Miercoles",
    "4": "Jueves",
    "5": "Viernes",
    "6": "Sabado",
    "7": "Domingo"
};
let numerosObjetos = {
    '0': 0,
    '1': 1,
    '2': 2,
    '3': 3,
    '4': 4,
    '5': 5,
    '6': 6,
    '7': 7,
    '8': 8,
    '9': 9
};
// Impresion de los anteriores objetos
for (const numero in numerosObjetos) {
    if (Object.prototype.hasOwnProperty.call(numerosObjetos, numero)) {
        console.log(numerosObjetos[numero]);
    }
}
for (const dia in diasSemana) {
    if (Object.prototype.hasOwnProperty.call(diasSemana, dia)) {
        console.log(diasSemana[dia]);
    }
}
