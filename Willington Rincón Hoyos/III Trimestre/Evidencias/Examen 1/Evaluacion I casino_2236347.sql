/*1.	Muestre la cantidad de jugadores por cada país.*/
SELECT p.nombre AS pais, COUNT(j.idjugador) AS cantidad_jugadores
FROM jugadores j, paises p
WHERE p.idpais = j.idpais
GROUP BY 1
ORDER BY 2;

/*2.	Muestre los jugadores que más juegos tienen como preferencia. En la tabla jugadores_juegos se registran los juegos que le gustan a 
cada jugador.*/
SELECT CONCAT(j.nombres, j.apellidos) AS nombre, COUNT(*) AS cantidad_juegos_preferidos
FROM jugadores j, jugadores_juegos jj
WHERE j.idjugador = jj.idjugador
GROUP BY nombre
ORDER BY 2 DESC;

/*3.	Muestre los jugadores que tienen más de 5 juegos como preferencia. */
SELECT CONCAT(j.nombres, j.apellidos) AS nombre, COUNT(*) AS cantidad_juegos_preferidos
FROM jugadores j, jugadores_juegos jj
WHERE j.idjugador = jj.idjugador
GROUP BY nombre
HAVING cantidad_juegos_preferidos > 5
ORDER BY 2 DESC;

/*4.	Halle el valor total de los pagos hechos por cada edad de los jugadores. En la tabla sesiones_detalle está el valor 
que pagó cada jugador por consumir ese juego(campo precio)*/
SELECT j.edad, SUM(sd.precio) AS pagos_totales
FROM jugadores j, sesiones_detalle sd
WHERE j.idjugador = sd.idjugador
GROUP BY 1
ORDER BY 1;

/*5.	¿Cuántos jugadores hay por cada género (sexo del jugador M ó F)? */
SELECT genero, COUNT(*) AS cantidad
FROM jugadores
GROUP BY 1
ORDER BY 2;

/*6.	Muestre cuales juegos son los que más han tenido demanda. Tenga en cuenta las sesiones que ha tenido cada uno de los juegos*/
SELECT j.nombre AS nombre_juego, COUNT(*) AS cantidad_sesiones
FROM juegos j, sesiones s
WHERE j.idjuego = s.idjuego
GROUP BY 1
ORDER BY 2 DESC;

/*7.	¿Cuáles sesiones han tenido una mayor ganancia de dinero? Muestre la fecha y la hora de inicio, el número de participantes 
y el nombre del juego.*/
SELECT s.numero, s.fechainicio AS fecha_inicio, s.horainicio AS hora_inicio, j.nombre AS nombre_juego, COUNT(sd.idjugador) AS cantidad_jugadores, SUM(sd.precio) AS ganancias_sesion
FROM sesiones s, juegos j, sesiones_detalle sd
WHERE s.numero = sd.numsesion AND s.idjuego = j.idjuego
GROUP BY 1, 2, 3, 4
ORDER BY 6 DESC;

/*8.	¿Cuántos juegos existen por cada género? (tipo de juego: ejemplo: Futbol, Luchas, Acción, Etc)*/
SELECT g.nombre, COUNT(*) AS cantidad_juegos
FROM juegos j, generos g
WHERE j.genero = g.codigo
GROUP BY 1
ORDER BY 2;

/*9.	¿De qué países ha recibido más ingresos la plataforma de Juegos? Realice una consulta para mostrar los 5 primeros países. */
SELECT p.nombre, SUM(sd.precio) AS ingresos_plataforma
FROM paises p, jugadores j, sesiones_detalle sd
WHERE p.idpais = j.idpais AND j.idjugador = sd.idjugador
GROUP BY 1
ORDER BY 2 DESC LIMIT 5;

/*10.	Muestre los 10 primeros juegos (muestre el nombre) que han tenido mayor número de participantes. */
SELECT j.nombre, COUNT(*) AS numero_participantes
FROM juegos j, sesiones_detalle sd, sesiones s
WHERE s.idjuego = j.idjuego AND s.numero = sd.numsesion
GROUP BY 1
ORDER BY 2 DESC LIMIT 10;