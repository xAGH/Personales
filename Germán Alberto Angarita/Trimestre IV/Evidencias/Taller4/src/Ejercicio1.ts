/*
Cree una función que reciba como argumento un número y retorne el cuadrado de éste cómo una
promesa usando Async para ello. Luego, llame a la función y trate de imprimir su valor de retorno. ¿Cuál
es el resultado de la impresión? ¿un valor numérico ? ¿una promesa ?
*/ 

function elevarAlCuadrado(x: number): Promise<number> {
    return Promise.resolve(x * x);
}

async function llamadaAsync1(): Promise<any>  {
    console.log(await elevarAlCuadrado(2)); // Valor esperado: 4
}

llamadaAsync1();