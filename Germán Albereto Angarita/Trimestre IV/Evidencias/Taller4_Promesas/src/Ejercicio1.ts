/* Cree una función que reciba como argumento un número y retorne el cuadrado de éste cómo una
promesa usando Async para ello. Luego, llame a la función y trate de imprimir su valor de retorno. ¿Cuál
es el resultado de la impresión? ¿un valor numérico ? ¿una promesa ? */

function cuadrado(x: number): Promise<number>{
    return new Promise<number>((resolve, reject) => {
        resolve(x);
    })
}