"use strict";
const promesa6 = new Promise((resolve, reject) => {
    setTimeout(() => {
        resolve("Promesa resuelta.");
    }, 2000);
    setTimeout(() => {
        reject("La promesa no se cumplió");
    }, 1000);
});
promesa6.then(res => console.log(res))
    .catch(e => {
    console.error(new Error(e));
});
