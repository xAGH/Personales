"use strict";
const promesa1 = new Promise((resolve) => {
    resolve("Somos programadores, movemos al mundo.");
});
promesa1.
    then((resolve) => {
    console.log(resolve);
}).catch((err) => {
    console.log(err);
});
