/*
Cree una función llamada “cuadradoAsincrono” que llame en su bloque de instrucciones a la función
“resultado” definida anteriormente, de tal manera que la ejecución se detenga hasta obtener el valor
retornado por “resultado”, luego, que eleve tal valor al cuadrado y este sea impreso. Use Async - Await. ¿
Qué imprimió ? ¿una promesa?, ¿ un entero ?
*/

function resultado2(): Promise<number> {
    return new Promise<number>((resolve) => {
        setTimeout(() => {
            resolve(8);
        }, 6000)
    })
}

async function cuadradoAsincrono(): Promise<any> {
    const numero = await resultado2();
    console.log(numero * numero); // Valor esperado: 64
}

cuadradoAsincrono();