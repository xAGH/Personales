/*
1. Seleccione los nombres del instructor, el id de la asesoría, la fecha y hora de la asesoría de las asesorías
en estado Anulada. Asegúrese de mostrar SOLO los registros con un instructor definido. 
*/
SELECT a.idasesoria, i.nombre AS nombre_instructor, a.fecha, a.hora, a.estado
FROM instructores i 
LEFT JOIN asesorias a ON a.instructor = i.login
WHERE a.estado = 'Anulada';

/*
2. Seleccione los apellidos y nombres del aprendiz, el nombre del programa de formación de los aprendices
que sean de ADSI. Muestre también el id de la asesoría SÓLO cuando pertenezca dicha asesoría a un
aprendiz.
*/
SELECT CONCAT(ap.nombres, ' ', ap.apellidos) AS nombre_aprendiz, p.nombre AS nobre_programa, a.idasesoria
FROM aprendices ap
LEFT JOIN programas p ON p.codigo = ap.programa
RIGHT JOIN asesorias a ON ap.documento = a.aprendiz
WHERE p.codigo = '001'
ORDER BY a.idasesoria;

/*
3. Seleccione los datos de la asesoría, idasesoria, fecha y hora, los apellidos y nombres
del aprendiz, el nombre del programa de formación de los aprendices, nombre del instructor y nombre
del asesor. SIEMPRE debe existir los datos del asesor, pero no interesa si existe o no datos del instructor
o del aprendiz (pueden quedar nulos). Ordene los datos por el id de la asesoría
*/
SELECT a.idasesoria, a.fecha, a.hora, CONCAT(ap.nombres, ' ', ap.apellidos) AS nombre_aprendiz, p.nombre as nombre_programa, i.nombre AS nombre_instructor, ase.nombres AS nombre_asesor
FROM asesores ase
LEFT JOIN asesorias a ON a.asesor = ase.codigo
LEFT JOIN aprendices ap ON a.aprendiz = ap.documento
LEFT JOIN programas p ON ap.programa = p.codigo
LEFT JOIN instructores i ON a.instructor = i.login
ORDER BY a.idasesoria;

/*
4. Muestre la cantidad de asesorías que se han brindado por cada programa de formación. Debe mostrar
el nombre del programa de formación y cuantas asesorías se han brindado en cada programa. 
*/
SELECT p.nombre AS nombre_programa, COUNT(a.idasesoria) AS cantidad_asesorias
FROM asesorias a
RIGHT JOIN aprendices ap ON ap.documento = a.aprendiz
RIGHT JOIN programas p ON p.codigo = ap.programa
GROUP BY nombre_programa
ORDER BY cantidad_asesorias DESC;
	
/*
Muestre la cantidad de asesorías que ha brindado cada instructor. Sólo muestre los instructores con mas
de 5 asesorías.
*/
SELECT i.nombre AS nombre_instructor, COUNT(a.idasesoria) AS cantidad_asesorias
FROM asesorias a
RIGHT JOIN instructores i ON a.instructor = i.login
GROUP BY nombre_instructor
HAVING cantidad_asesorias > 5





