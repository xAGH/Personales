/* 1. ¿Cuántos pacientes existen en la base de datos por género femenino y masculino? */
SELECT sexo, count(sexo) as cantidad
FROM pacientes
GROUP BY sexo;

/* 2. ¿Cuántos pacientes existen en la base de datos por género femenino y masculino, y
además de ello por cada zona de residencia? */
SELECT sexo, zona, count(*) as cantidad
FROM pacientes
GROUP BY sexo, zona
ORDER BY sexo;

/* 3. Genere una consulta para saber cuánto se ha facturado en la unidad funcional de
laboratorio clínico a pacientes de género Femenino. Muestre los valores consolidados
y los datos de nombres, apellidos y fecha de nacimiento del paciente. */
SELECT CONCAT(p.nombre1, " ", p.nombre2) AS nombres, CONCAT(p.apellido1, " ",p.apellido2) AS apellidos, CONCAT(day(fecnac), '/', month(fecnac), '/', year(fecnac)) AS fecha_nacimiento, SUM(vtotal) AS facturado
FROM detallesfac d, pacientes p, unidadesf u
WHERE (d.identifica = p.numero AND u.codigo = d.unidadf) AND u.nombre LIKE "%LABORATORIO%" AND p.sexo = 'F'
GROUP BY 1,2,3
ORDER BY 4 DESC;

/* 4. Se requiere una consulta para saber la cantidad de pacientes por cada estado civil. ¿De
qué forma podríamos realizar esa consulta para mostrar los nombres de cada uno de
los estados civiles que se manejan en la base de datos? Consulta el comando CASE. */
SELECT CASE p.estcivil
	WHEN '1' THEN 'Soltero(a)'
	WHEN '2' THEN 'Casado(a)'
	WHEN '3' THEN 'Unión Libre'
	WHEN '4' THEN 'Separado(a)'
	WHEN '5' THEN 'Viudo(a)'
	ELSE 'No especificado'
END AS 'estado civil', COUNT(*) AS cantidad
FROM pacientes p
GROUP BY 1
ORDER BY 2 DESC;

/* 5. Consulte para qué sirve la cláusula Having en las consultas agrupadas y trate de
realizar un ejemplo con la base de datos existente.*/
SELECT CONCAT(p.nombre1, ' ', p.nombre2) AS nombres, CONCAT(p.apellido1, ' ',p.apellido2) AS apellidos, CONCAT(day(fecnac), '/', month(fecnac), '/', year(fecnac)) AS fecha_nacimiento, SUM(vtotal) AS facturado
FROM detallesfac d, pacientes p, unidadesf u
WHERE (d.identifica = p.numero AND u.codigo = d.unidadf) AND u.nombre LIKE '%LABORATORIO%' AND p.sexo = 'F'
GROUP BY 1,2,3
HAVING SUM(vtotal) > 300000
ORDER BY 4 DESC;

/* EXTRA. Consultar el rh de los pacientes los cuales den un valor mayor a 200 */
SELECT rh, COUNT(*) AS cantidadRH
FROM pacientes
GROUP BY rh
HAVING cantidadRH > 200

