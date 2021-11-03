/*
Cree una función llamada “resultado” que retorne una promesa usando “return new Promise”, de tal
manera que la promesa en su bloque de instrucciones implemente setTimeout demorandose seis
segundos para resolverse con valor 8. Luego, llame a la función e imprima su resultado, ¿qué resultado
obtiene? ¿una promesa?, ¿ un entero ? 
*/

function resultado(): Promise<number> {
    return new Promise<number>((resolve) => {
        setTimeout(() => {
            resolve(8);
        }, 6000)
    })
}

async function llamadaAsync2(): Promise<any>  {
    console.log(await resultado()); // Valor esperado: 8
}

llamadaAsync2();
