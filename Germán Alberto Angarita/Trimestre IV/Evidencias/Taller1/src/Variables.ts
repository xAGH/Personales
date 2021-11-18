// Declare dos variables logicas.
let variableLogica1: boolean = false;
let variableLogica2: boolean = true; 

// Declare dos variables numericas.
let variableNumerica1: number = 10;
let variableNumerica2: number = -10;

// Declare dos variables any.
let variableAny1: any = true;
let variableAny2: any = "Any 2";

// Declare dos variables string.
let variableString1: string = "Cadena 1";
let variableString2: string = "Cadena 2";

// Cree una plantilla de strings para mostrar un mensaje de bienvenida al usuario luego de
// registrarse en nuestro sitio, por ejemplo. “Bienvenida Paula Pérez a nuestro sitio web, gracias por
// registrarte”. Este template debe usar dos variables, nombres y apellidos
let nombres: string = "Paula";
let apellidos: string = "Pérez";
console.log(`Bienvenida ${nombres} ${apellidos} a nuestro sitio web, gracias por registrarte`);

// Declaracion e impresion de dos arrays.
let numeros: number[] = [1, 2, 3, 4, 5]
let cadenas: string[] = ["Elemento1", "Elemento2", "Elemento3", "Elemento4", "Elemento5"];

// Impresion de los anteriores arrays
for (const iterator of numeros) {
    console.log(iterator);
}

for (const iterator2 of cadenas) {
    console.log(iterator2);
}

// Declaracion de objetos
let diasSemana: any = {
    "1": "Lunes",
    "2": "Martes",
    "3": "Miercoles",
    "4": "Jueves",
    "5": "Viernes",
    "6": "Sabado",
    "7": "Domingo"
};
let numerosObjetos: any = {
    '0': 0,
    '1': 1,
    '2': 2,
    '3': 3,
    '4': 4,
    '5': 5,
    '6': 6,
    '7': 7,
    '8': 8,
    '9': 9
}

// Impresion de los anteriores objetos
for (const numero in numerosObjetos) {
    if (Object.prototype.hasOwnProperty.call(numerosObjetos, numero)) {
        console.log(numerosObjetos[numero])
    }
}

for (const dia in diasSemana) {
    if (Object.prototype.hasOwnProperty.call(diasSemana, dia)) {
        console.log(diasSemana[dia]);
    }
}