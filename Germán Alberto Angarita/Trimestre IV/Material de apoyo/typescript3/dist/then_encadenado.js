"use strict";
let promesa_then_encadenado = new Promise((resolve, reject) => {
    resolve("A");
});
promesa_then_encadenado.then((res) => {
    console.log(res);
    return res;
}).then((res) => {
    console.log(res);
    return res + "D";
}).then((res) => {
    return res + "S";
}).then((res) => {
    return res + "I";
}).then((res) => {
    console.log(res);
}).catch((error) => {
    //catch se ejecutará si ocurre un error en alguno de los .then encadenados
    console.log(error);
});
