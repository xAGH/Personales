/* TALLER CONSULTAS SQL*/

/*1 Seleccione los registros de la tabla detallesfac donde el tipo de 
documento sea cedula de ciudadanía*/

select * from detallesfac where tipodoc='CC';

/*2 Seleccione los campos factura, contrato, fecha, hora y descripción 
de los detalles de facturación donde los minutos correspondan al minuto 
30 de cada hora*/
select  factura, contrato, fecha, hora, descripcion from detallesfac
where hora like '%30';
/*otra forma de hacerla*/
select contrato,fecha,hora,descripcion
from detallesfac where minute(hora)=30;
/*otra forma de hacerla*/
select contrato,fecha,hora,descripcion
from detallesfac where substr(hora,4,2)='30';
1 0 : 3 0
1 2 3 4 5

/*3 Seleccione todos los registros de detallesfac donde exista 
la palabra CONTROL en la descripción*/
select * from detallesfac where 
descripcion like '%CONTROL%';

/*4 Seleccione todos los registros de detallesfac donde exista la 
palabra CONTROL y además la palabra ENFERMERIA y también 
los registros donde exista la palabra CONTROL y además 
la palabra MEDICINA.*/
SELECT * FROM detallesfac WHERE 
(   descripcion LIKE "%CONTROL%" AND descripcion LIKE "%ENFERMERIA%") 
OR (descripcion LIKE "%CONTROL%" AND descripcion LIKE "%MEDICINA%"); 
/*resumiendola un poco*/
SELECT * FROM detallesfac WHERE 
descripcion LIKE "%CONTROL%" AND 
(descripcion LIKE "%ENFERMERIA%" OR descripcion LIKE "%MEDICINA%"); 

/*5 Seleccione de detallesfac los códigos(campo código) 
que terminen en las letras CP.*/
select * from detallesfac
where codigo like '%CP';

/*6 Seleccione los registros que tengan diferencia en el 
cálculo de la cantidad por el valor unitario comparado 
con el valor total(campo vtotal) de la tabla detallesfac. 
UTILICE PARA ELLO UNA OPERACIÓN LÓGICA NOT*/
SELECT * FROM detallesfac WHERE 
not(cantidad * vunitario = vtotal);

/*7 Seleccione los registros de la tabla detallesfac que 
estén entre el día 01 de febrero de 2021 hasta el 10 
de febrero de 2021 y que estén entre los contratos
con código desde 150 al 170 y que estén en las unidades 
funcionales con códigos 001, 006, 012, 011.*/
SELECT * FROM detallesfac WHERE 
(fecha BETWEEN '2021-02-01' AND '2021-02-10') 
AND (contrato BETWEEN '150' and '170') AND 
unidadf in('001', '006', '012', '011');

/*8 Seleccione los apellidos, nombres, teléfono de los pacientes
 cuyo celular comience por 313*/
 select  apellido1, apellido2, nombre1, nombre2, celular from pacientes
where celular like '313%';

/*9. Seleccione los apellidos, nombres, teléfono, 
tipo de documento de los pacientes cuyo tipo de sangre sea O+ 
y que no estén casados y que vivan en el área Urbana.*/
select  apellido1, apellido2, nombre1, nombre2, celular, 
tipodoc from pacientes
where zona='U' and rh='O+' and estcivil in (1,3,4,5); 

SELECT CONCAT(apellido1," ", apellido2) AS apellidos,
 CONCAT(nombre1," ",nombre2 ) AS nombres, celular, tipodoc 
 FROM pacientes WHERE rh='O+' AND estcivil!=2 AND zona='U';
 
 /*10 Cuantos pacientes son de sexo femenino?*/
 SELECT count(*) AS cantidad_datos FROM pacientes WHERE sexo='F';

/* 11. Cuantos pacientes son de sexo masculino que se llamen DIEGO? 
El nombre puede estar en el primer nombre o en el segundo nombre. */
SELECT count(*) AS cantidad_datos FROM pacientes 
WHERE sexo='M' and 
(nombre1='DIEGO' OR nombre2='DIEGO');

/* 12. Seleccione la fecha y la hora de la tabla detallesfac y agregue 
otro campo a la consulta que sea el resultado de
concatenar esa fecha en formato dd/mm/yyyy y la hora. Ejemplo: 
si la fecha es 2018-02-01 00:00:00 y la hora es 15:45, el campo 
resultante debe tener el valor 01/02/2018 15:45 */
SELECT fecha,hora,concat(substr(fecha,9,2),"/",substr(fecha,6,2),"/",
					substr(fecha,1,4)," ",hora) AS 
fechahora FROM detallesfac;
/*otra forma de hacerla*/
SELECT fecha,hora,concat(date_format(fecha,'%d/%m/%Y')," ",hora) as fecha1
from detallesfac;
/*otra forma de hacerla*/
SELECT fecha,hora,concat(day(fecha),"/",month(fecha),"/",year(fecha)) as fecha1
from detallesfac;

