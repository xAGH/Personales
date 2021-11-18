"use strict";
//LAS PROMESAS TIENEN TRES ESTADOS: PENDIENTE, RESUELTA Y RECHAZADA
//el arumento del objeto promesa en una funcion
//flecha
//promesa que se resuelve siempre
let promesa1 = new Promise((resolve, reject) => {
    //el resolve se ejecuta cunado la promesa se
    //cumple, y su argumento es el valor de la promesa
    //aca el valor de resolucion es un string: "Promesa 1 cumplida"
    resolve("Promesa 1 cumplida");
});
//en caso de que la promesa se cumpla(se ejecutó el resolve)
//se ejecutará el .then
//el argumento del .then es 
promesa1.then((res) => {
    console.log("Promesa cumplida con valor: ", res);
});
//promesa que siempre se rechaza, es decir, siempre se ejecuta
//el reject
let promesa2 = new Promise((resolve, reject) => {
    //promesa que se rechaza con un booleano false,
    //indicando que la operacion ha fallado
    //el valor del reject es la informacion del error
    reject(false);
});
//llamamos al .catch que tiene como argumento
//una funcion que a su vez tiene como argumento el
//valor de rechazo de la promea, es decir, la informacion del error
promesa2.catch((err) => {
    console.log("Promesa 2 rehazada con valor: ", err);
});
let estadoCivil = "jodido";
let promesa3 = new Promise((resolve, reject) => {
    //si el usuario es soltero...
    if (estadoCivil == "soltero") {
        //la promesa se resuelve con un string
        resolve("el usuario es soltero");
    }
    //si el usuario es casado...
    if (estadoCivil == "casado") {
        //la promesa se resuelve con un string
        resolve("el usuario es casado");
    }
    //si el suuario ingresa un estado civil no valido...
    //la promesa se rechaza con un objeto de error
    reject(new Error("Estado civil no valido"));
    //RECPRDAR QUE SI UNA PROMESA HACE REJECT, NO HARA RESOLVE Y VICEVERSA
});
promesa3.then((res) => {
    console.log("Promesa 3 resuelta con valor: ", res);
}).catch((error) => {
    console.log("Promesa 3 rechazada con info: ", error.message);
});
