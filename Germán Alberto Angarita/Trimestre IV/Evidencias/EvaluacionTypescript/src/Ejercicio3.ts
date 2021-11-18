import { Promesas } from './Ejercicio2'

let promesasEjercicio2: Promesas = new Promesas()

Promise.all([
        promesasEjercicio2.promesa1,
        promesasEjercicio2.promesa2,
        promesasEjercicio2.promesa3,
    ]).then(res => console.log(
        "Respues de la promesa 1: " + res[0] + "\n" +
        "Respues de la promesa 2: " + res[1] + "\n" +
        "Respues de la promesa 3: " + res[2]
        )).catch(err => console.error(err.message));
