"use strict";
const promesa2 = Promise.reject("Ha ocurrido un error desconocido.");
promesa2.catch(err => {
    console.error(err);
});
