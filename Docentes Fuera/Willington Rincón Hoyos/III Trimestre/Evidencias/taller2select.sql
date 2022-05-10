/*1. Realizar una consulta para obtener los siguientes datos. Nombre del contrato, descripción del
servicio, cantidad, valor unitario, fecha. Los registros deben estar entre el 01/02/2021 y el
15/02/2021 y deben ser registros facturados. Ordene los resultados por el nombre del contrato
y la descripción del servicio.*/

SELECT c.nombre AS nombre_contrato, d.descripcion,  d.cantidad, d.vunitario AS valor_unitario, substr(d.fecha,1,10) as fecha
FROM contratos c, detallesfac d
WHERE  (d.estadocar='F') AND (c.codigo=d.contrato) AND (fecha BETWEEN '2021/02/01' AND '2021/02/15') ORDER BY c.nombre, d.descripcion;

/*2. Realice una consulta para obtener: Nombre de la unidad Funcional, Nombre del contrato,
Nombre del servicio (de la tabla servicios), fecha, hora, valor total. Los registros facturados
deben estar activos, las unidades funcionales a incluir son las siguientes: 005,009, 003 y los
contratos a incluir son 081,063,159,064,158. Los servicios deben contener la palabra
CONSULTA. */

SELECT d.unidadf AS unidad_funcional, c.nombre AS nombre_contrato, s.nombre AS nombre_servicio, substr(d.fecha,1,10) AS fecha, d.hora, d.vtotal AS valor_total
FROM detallesfac d, servicios s, contratos c
WHERE (d.estadocar!='A') AND (d.contrato=c.codigo and d.codigo=s.codigo) AND (d.unidadf in ('005','009','003')) AND (c.codigo in ('081','063','159','064','158')) AND (s.nombre LIKE '%CONSULTA%');


/*3. Consulte los detalles de facturación en estado anulado. Se requiere saber el nombre del
contrato, la fecha, el valor total, el nombre del servicio y el nombre de la unidad funcional.*/

SELECT c.nombre AS nombre_contrato,  substr(d.fecha,1,10) AS fecha, d.vtotal AS valor_total, descripcion AS nombre_servicio, d.unidadf as unidad_funcional
FROM detallesfac d, contratos c
WHERE (d.estadocar='A') AND (d.contrato=c.codigo);


/*4. El área de auditoria requiere un listado de los detalles de facturación. Requiere saber los
cargos realizados a menores de edad (RC, TI), que NO hayan sido CONSULTAS, cuyo valor
total sea mayor a 30.000 y que el cargo NO este anulado. Se requiere el listado con el nombre
del contrato, código y nombre del servicio, el valor total, la fecha y que esté ordenado por
fecha, nombre del servicio y cantidad.*/

SELECT c.nombre AS nombre_contrato, s.codigo AS codigo_servicio, s.nombre AS nombre_servicio, d.vtotal AS valor_total, substr(d.fecha,1,10) as fecha
FROM detallesfac d, contratos c, servicios s
WHERE (d.contrato=c.codigo AND d.codigo=s.codigo) AND (d.tipodoc='RC' OR d.tipodoc='TI') AND (s.nombre NOT LIKE '%CONSULTA%') AND (d.vtotal > 30000) AND (d.estadocar != 'A') ORDER BY fecha, d.descripcion, d.cantidad;


/*5. Se requiere un listado de los detalles de facturación de los contratos de SEGUROS y de los
exámenes de laboratorio clínico (los códigos comienzan por 90). Muestre el nombre del
contrato, el código y descripción del servicio, la fecha, el valor unitario, la cantidad y el estado
del registro facturado.*/

SELECT c.nombre AS nombre_contrato, d.codigo AS codigo_servicio, d.descripcion as descripcion_servicio, substr(d.fecha,1,10) AS fecha, d.vunitario AS valor_unitario, d.cantidad, d.estadocar AS estado_registro
FROM contratos c, detallesfac d
WHERE (d.contrato=c.codigo) AND (c.nombre LIKE '%SEGUROS%') AND (d.codigo LIKE '%90%');
