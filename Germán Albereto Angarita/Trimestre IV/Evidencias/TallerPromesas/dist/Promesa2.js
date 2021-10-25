"use strict";
const promesa2 = new Promise((resolve, reject) => {
    reject(new Error("Ha ocurrido un error desconocido."));
});
promesa2
    .catch((err) => {
    console.error(err);
});
