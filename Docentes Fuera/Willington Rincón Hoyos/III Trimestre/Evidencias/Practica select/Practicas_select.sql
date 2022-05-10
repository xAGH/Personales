/* 1. Seleccione los registros de la tabla detallesfac donde el tipo de documento sea cedula de ciudadanía. */
SELECT * FROM detallesfac WHERE tipodoc='CC';

/* 2. Seleccione los campos factura, contrato, fecha, hora y descripción de los detalles de facturación donde los minutos correspondan al minuto 30 de cada hora */
SELECT factura, contrato, fecha, hora, descripcion FROM detallesfac WHERE hora LIKE "%:30";

/* 3. Seleccione todos los registros de detallesfac donde exista la palabra CONTROL en la descripción. */ 
SELECT * FROM detallesfac WHERE descripcion LIKE "%CONTROL%";

/* 4. Seleccione todos los registros de detallesfac donde exista la palabra CONTROL y además la palabra ENFERMERIA y también los registros donde exista la palabra CONTROL y además la palabra MEDICINA. */
SELECT * FROM detallesfac WHERE descripcion LIKE "%CONTROL%" AND (descripcion LIKE "%ENFERMERIA%" OR descripcion LIKE "%MEDICINA%");

/* 5. Seleccione de detallesfac los códigos(campo código) que terminen en las letras CP. */
SELECT codigo FROM detallesfac WHERE codigo LIKE "%CP";

/* 6. Seleccione los registros que tengan diferencia en el cálculo de la cantidad por el valor unitario comparado con el valor total(campo vtotal) de la tabla detallesfac. UTILICE PARA ELLO UNA OPERACIÓN LÓGICA NOT. */
SELECT * FROM detallesfac WHERE NOT(cantidad * vunitario = vtotal);

/* 7. Seleccione los registros de la tabla detallesfac que estén entre el día 01 de febrero de 2021 hasta el 10 de febrero de 2021 y 
que estén entre los contratos con código desde 150 al 170 y que estén en las unidades funcionales con códigos 001, 006, 012, 011 */
SELECT * FROM detallesfac WHERE (fecha BETWEEN '2021-02-01' AND '2021-02-10') AND (contrato BETWEEN '150' and '170') AND (unidadf='001' OR unidadf='006' OR unidadf='012' OR unidadf='011');

/* 8. Seleccione los apellidos, nombres, teléfono de los pacientes cuyo celular comience por 313 */
SELECT CONCAT(apellido1," ", apellido2) AS apellidos, CONCAT(nombre1," ",nombre2 ) AS nombres, celular FROM pacientes WHERE celular LIKE "313%";

/* 9. Seleccione los apellidos, nombres, teléfono, tipo de documento de los pacientes cuyo tipo de sangre sea O+ y que no estén casados y que vivan en el área Urbana. */
SELECT CONCAT(apellido1," ", apellido2) AS apellidos, CONCAT(nombre1," ",nombre2 ) AS nombres, celular, tipodoc FROM pacientes WHERE rh='O+' AND estcivil!=2 AND zona='U';

/* 10. ¿Cuántos pacientes son de sexo femenino? */
SELECT count(*) AS cantidad_datos FROM pacientes WHERE sexo='F';

/* 11. Cuantos pacientes son de sexo masculino que se llamen DIEGO? El nombre puede estar en el primer nombre o en el segundo nombre. */
SELECT count(*) AS cantidad_datos FROM pacientes WHERE sexo='M' and (nombre1="DIEGO" OR nombre2="DIEGO");

/* 12. Seleccione la fecha y la hora de la tabla detallesfac y agregue otro campo a la consulta que sea el resultado de 
concatenar esa fecha en formato dd/mm/yyyy y la hora. Ejemplo: si la fecha es 2018-02-01 00:00:00 y la hora es 15:45, el campo resultante debe tener el valor 01/02/2018 15:45 */
SELECT substr(fecha,1,10), hora,concat(substr(fecha,1,10)," ",hora) AS fechahora FROM detallesfac;