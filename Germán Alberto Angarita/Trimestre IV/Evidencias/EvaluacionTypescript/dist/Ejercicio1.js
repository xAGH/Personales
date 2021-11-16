"use strict";
/*
  Cree una funcion flecha que tenga como parametros tres cadenas:
  "Lo que hacemos", " es programar ", ", movemos al mundo.", y retorne
  una sola cadena. "Lo que hacemos es programar, movemos al mundo."
  Para formar esta cadena una templates de strings. imprima
  el valor devuelto por la función. La función debe tener mínimo tres
  instrucciones
 */
let concatenacionCadena = (cadena1 = "Lo que hacemos", cadena2 = "es programar", cadena3 = "movemos al mundo") => {
    let mensaje = "";
    mensaje += `${cadena1}`;
    mensaje += ` ${cadena2}, `;
    mensaje += ` ${cadena3}`;
    return mensaje;
};
console.log(concatenacionCadena());
