"use strict";
/*
Cree una función llamada “cuadradoAsincrono” que llame en su bloque de instrucciones a la función
“resultado” definida anteriormente, de tal manera que la ejecución se detenga hasta obtener el valor
retornado por “resultado”, luego, que eleve tal valor al cuadrado y este sea impreso. Use Async - Await. ¿
Qué imprimió ? ¿una promesa?, ¿ un entero ?
*/
var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
function resultado2() {
    return new Promise((resolve) => {
        setTimeout(() => {
            resolve(8);
        }, 6000);
    });
}
function cuadradoAsincrono() {
    return __awaiter(this, void 0, void 0, function* () {
        const numero = yield resultado2();
        console.log(numero * numero); // Valor esperado: 64
    });
}
cuadradoAsincrono();
