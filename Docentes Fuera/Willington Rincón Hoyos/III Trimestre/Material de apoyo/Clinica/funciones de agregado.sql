/* FUNCIONES DE AGREGADO*/
/*Se utilizan para consolidar datos*/

/*función SUM. se utiliza para sumar campos
 NUMERICOS. recibe como parametro un campo
 con tipo de dato numérico o una operacion matemática)*/
 select sum(vtotal) as valor_total from detallesfac
 where tipodoc='CC';
 
  select sum(cantidad*vunitario) as valor_total from detallesfac
 where tipodoc='CC';
 
  select sum(tipodoc) as valor_total from detallesfac;
  
/* función COUNT. se utiliza para contar registros
recibe un parametro que generalmente es el caracter
asterisco (*), o puede ser el nombre de un campo
de la tabla relacionada en la consulta*/
select count(*) as cantidad
 from detallesfac where cantidad>10;
 
 /* función AVG - Se utiliza para hallar promedios
 recibe como parametro un campo
 con tipo de dato numérico o una operacion matemática*/
 select avg(cantidad) as promedio from detallesfac;
 
 /*función max - se utiliza para hallar el máximo
 valor de una serie de valores. reciebe como parametro
 CUALQUIER tipo de dato*/
 /*parametro numérico*/
 select max(cantidad) as maximo from detallesfac;
 select max(vtotal) as maximo from detallesfac;
 /*parámetro de fecha*/
 select max(fecnac) from pacientes;
 select max(fecha) from detallesfac;
 
 /*tipos de datos caracter*/
 select max(tipodoc) from pacientes;
 
 select max(unidadf) from detallesfac;
 select max(nombre) from unidadesf;
 
 select max(hora) from detallesfac
 where vtotal<10000;
 
 select * from detallesfac;
 
SELECT MIN(numero) AS minimo, MAX(numero) AS maximo FROM pacientes;