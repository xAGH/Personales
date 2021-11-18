"use strict";
/*
Cree una función que reciba como argumento un número y retorne el cuadrado de éste cómo una
promesa usando Async para ello. Luego, llame a la función y trate de imprimir su valor de retorno. ¿Cuál
es el resultado de la impresión? ¿un valor numérico ? ¿una promesa ?
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
function elevarAlCuadrado(x) {
    return Promise.resolve(x * x);
}
function llamadaAsync1() {
    return __awaiter(this, void 0, void 0, function* () {
        console.log(yield elevarAlCuadrado(2)); // Valor esperado: 4
    });
}
llamadaAsync1();
