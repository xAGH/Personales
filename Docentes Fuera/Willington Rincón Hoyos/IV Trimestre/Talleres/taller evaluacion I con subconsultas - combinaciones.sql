/*1. Seleccione los nombres del asesor, el id de la asesoría, 
la fecha y hora de la asesoría de las asesorías en estado Asignada. 
Asegúrese de mostrar TODOS los registros de asesores así tengan o no 
tengan asesorías relacionadas.*/
select as2.nombres,as1.idasesoria,as1.fecha,as1.hora
from asesores as2 left join asesorias as1 on as2.codigo=as1.asesor
where as1.estado='Asignada';

/*REALIZAR ESTA CONSULTA CON UNA SUBCONSULTA. MUESTRE SOLO LOS NOMBRES DE LOS ASESORES
QUE HAN BRINDADO ASESORIAS EN ESTADO ASIGNADA. NO SE REUIEREN LOS DATOS DE LA ASESORIA*/

select as1.nombres
from asesores as1
left join asesorias a on as1.codigo=a.asesor
where as1.nombres in(
    select as2.nombres
    from asesores as2
    where estado = 'Asignada'
);

/* ===================================================================================================================================================================================*/

/*2. Seleccione los apellidos y nombres del aprendiz, el nombre del 
programa de formación de los jugadores que Juegan video juegos O que 
son de sexo masculino.*/
select a.apellidos,a.nombres, p.nombre
from aprendices a inner join programas p on p.codigo=a.programa
where a.jugadorvd='S' or a.sexo='M';

/*MODIFIQUE ESTA CONSULTA E INCLUYA UNA SUBCONSULTA PARA MOSTRAR SOLO LOS APRENDICES DE ADSI.
MUESTRE SOLO LOS DATOS DE APELLIDOS Y NOMBRES DEL APRENDIZ, JUGADORVD Y SEXO. NO SE REQUIERE
MOSTRAR EL NOMBRE DEL PROGRAMA DE FORMACIÓN*/

select a.apellidos, a.nombres, a.jugadorvd, a.sexo, a.programa
from aprendices a
where a.programa in (SELECT codigo FROM programas WHERE nombre = 'ADSI') AND (a.jugadorvd='S' or a.sexo='M');

/* ===================================================================================================================================================================================*/

/*3. Seleccione los datos de la asesoria, idasesoria, fecha y hora,los apellidos y nombres 
del aprendiz, el nombre del programa de formación 
de los jugadores, nombre del instructor y nombre del asesor. SIEMPRE debe existir los 
datos del aprendiz y del instructor, pero no interesa si existe o no datos del asesor 
(pueden quedar nulos).*/
select ase.idasesoria,ase.fecha,ase.hora,a.apellidos,a.nombres,p.nombre as nomprograma,
i.nombre as nominstructor, ase1.nombres as nomasesor
from asesorias ase inner join aprendices a on a.documento=ase.aprendiz
inner join programas p on p.codigo=a.programa inner join instructores i
on i.login=ase.instructor left join asesores ase1 on ase1.codigo=ase.asesor
order by ase.idasesoria;

/*MODIFIQUE ESTA CONSULTA PARA IMPLEMENTAR 2 SUBCONSULTAS. MUESTRE LOS DATOS DE LA ASESORIA
NOMBRES DEL APRENDIZ, APELLIDOS DEL APRENDIZ. QUITE DE LA CONSULTA PRINCIPAL LAS TABLAS 
INSTRUCTORES Y ASESORES, PERO CONDICIONES LOS ASESORES CUYO NOMBRE COMIENCE POR LA LETRA L
Y LOS INSTRUCTORES QUE TENGAN LA LETRA M EN CUALQUIER PARTE DE SU NOMBRE*/

SELECT a.idasesoria, a.fecha, a.hora, 
       CONCAT(ap.nombres, '' , ap.apellidos) AS nombre_aprendiz
FROM asesorias a 
INNER JOIN aprendices ap ON a.aprendiz = ap.documento
WHERE a.instructor IN (
    SELECT login
    FROM instructores
    WHERE nombre LIKE '%M%'
) AND a.asesor IN (
    SELECT codigo
    FROM asesores
    WHERE nombres LIKE 'L%'
);

/* ===================================================================================================================================================================================*/

/*4. Seleccione los datos de las asesorías, id de la asesoría, fecha y hora de la asesoría y 
relacione en la consulta los nombres y apellidos del aprendiz que tiene asignada la asesoría y el nombre 
del instructor que se relacionó en la asesoría. SIEMPRE debe salir los datos del instructor 
pero los datos del aprendiz pueden estar allí o pueden quedar nulos. */
select ase.idasesoria,ase.fecha,ase.hora,a.apellidos,a.nombres,i.nombre as nominstructor
from asesorias ase left join aprendices a on a.documento=ase.aprendiz
inner join instructores i on i.login=ase.instructor 
order by ase.idasesoria;

/*QUITE DE LA CONSULTA LA TABLA APRENDICES Y MUESTRE LAS ASESORIAS DONDE LOS APRENDICES
SEAN DE SEXO FEMENINO. MUESTRE DATOS DE ASESORIAS Y DE INSTRUCTOR, PERO NO SE REQUIERE MOSTRAR
DATOS DE APRENDICES*/

select ase.idasesoria,ase.fecha,ase.hora, i.nombre as nominstructor
from asesorias ase inner join instructores i on i.login=ase.instructor
WHERE ase.aprendiz IN(
    SELECT documento
    FROM aprendices
    WHERE sexo = "F"
)
order by ase.idasesoria;

/* ===================================================================================================================================================================================*/

/*5 ¿Cuántas asesorías brindó cada asesor? Muestre el nombre del asesor y la cantidad de 
asesorías ofrecidas por cada uno de ellos. si el asesor no está relacionado, debe salir 
de todas formas la cifra con un asesor no identificado.*/
select ase2.nombres as nomasesor, count(*) as cantidad
from asesorias ase1 left join asesores ase2 on ase1.asesor=ase2.codigo
group by ase2.nombres;

/*EN ESTA CONSULTA TENGA EN CUENTA SOLO LAS ASESORIAS BRINDADAS A APRENDICES QUE JUEGAN VIDEOJUEGOS
IMPLEMENTE PARA ELLO UNA SUBCONSULTA*/

select ase2.nombres as nomasesor, count(*) as cantidad
from asesorias ase1 left join asesores ase2 on ase1.asesor=ase2.codigo
WHERE ase1.aprendiz IN (
    SELECT documento
    FROM aprendices 
    WHERE jugadorvd = 'S'
)
group by ase2.nombres
ORDER BY 2;