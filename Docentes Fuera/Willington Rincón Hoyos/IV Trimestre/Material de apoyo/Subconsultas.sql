USE asesorias2236347;

SELECT * FROM aprendices
WHERE jugadorvd = 'S' AND documento 
IN (SELECT aprendiz FROM asesorias WHERE estado = 'Anulada');

/*Seleccione los datos de las asesorías que hayan realizado los asesores
 cuyo nombre comience por la letra L. 
 Muestre el nombre del instructor y el nombre del aprendiz.*/
SELECT ase.fecha, ase.hora, a.apellidos, a.nombres, i.nombre as nominstru
FROM asesorias ase INNER JOIN aprendices a ON ase.aprendiz + a.documento
INNER JOIN instructores i ON i.login = ase.instructor
WHERE ase.asesor IN (
    SELECT codigo 
    FROM asesores  
    WHERE nombres LIKE 'L%'
);

/* Seleccione los aprendices que hayan recibido asesorias entre los dias 18 y 20.
No importa el mes ni el año*/
SELECT * FROM aprendices a
INNER JOIN asesorias ase ON a.documento = ase.aprendiz
WHERE ase.fecha IN (
    SELECT fecha
    FROM asesorias 
    WHERE day(fecha) BETWEEN '18' AND '20'
);