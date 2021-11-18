/*consultas multitabla*/
/*el objetivo es unir datos de diferentes fuentes
para convertirlos en información unificada*/
/*movimientos de facturación con el nombre
del contrato*/
SELECT 
    c.codigo,
    c.nombre,
    d.fecha,
    d.codigo,
    d.descripcion,
    d.vtotal
FROM
    detallesfac d,
    contratos c
WHERE
    d.contrato = c.codigo
ORDER BY c.nombre , d.fecha , d.descripcion;
 
 /*se requiere los movimientos de facturación
  mostrando la fecha, la descripcion del servicio,
  su valor unitario,los nombres y apellidos del 
  paciente de aquellos que tengan rh O+. 
  muestre también el nombre de la unidad funcional*/
SELECT 
    d.fecha,
    d.descripcion,
    d.vunitario,
    p.apellido1,
    p.apellido2,
    p.nombre1,
    p.nombre2,
    p.rh,
    u.nombre
FROM
    detallesfac d,
    pacientes p,
    unidadesf u
WHERE
		d.identifica = p.numero
        AND d.unidadf = u.codigo
        AND p.rh = 'O+'
ORDER BY p.apellido1 , p.apellido2 , p.nombre1 , p.nombre2 , d.fecha DESC;

SELECT 
    *
FROM
    contratos;
SELECT 
    *
FROM
    detallesfac
WHERE
    identifica = '1058847847';
 
SELECT 
    *
FROM
    detallesfac;
 
 
/*
Se requiere los datos basicos de los pacientes:
apellidos y nombres,
fecha de nacmiento,
zona de residencia,
estado civil,
nombre del contrato al cual esta vinculado c/u.
Tenga en cuenta los pacientes cuyo año de nacimiento es igual superior
al año 2000 y que sean casados.
*/
SELECT  concat(p.nombre1, " ", p.nombre2) AS nombres, concat(p.apellido1, " ", p.apellido2) AS apellidos,
p.fecnac, p.zona, p.estcivil, c.nombre as nombre_contrato FROM pacientes p, contratos c WHERE (p.contrato = c.codigo) AND (year(p.fecnac) >= 2000) AND (p.estcivil = 2)

select estcivil from pacientes