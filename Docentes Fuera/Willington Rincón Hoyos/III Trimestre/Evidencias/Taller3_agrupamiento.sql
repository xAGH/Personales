/*  1. Muestre la cantidad de videojuegos que existen por cada plataforma. */
SELECT p.nombre AS plataforma, COUNT(*) AS cantidad_juegos
FROM plataformas p, juegos j
WHERE p.codigo=j.plataforma
GROUP BY plataforma
ORDER BY cantidad_videojuegos;

/* 2. Muestre la cantidad de videojuegos que existen por cada género. */
SELECT g.nombre AS genero, COUNT(*) AS cantidad_videojuegos
FROM generos g, juegos j
WHERE g.codigo=j.genero
GROUP BY genero
ORDER BY cantidad_videojuegos;

/* 3. Halle el valor total de los videojuegos por cada plataforma. */
SELECT p.nombre AS plataforma, SUM(precio) AS valor_total_videojuegos
FROM juegos j, plataformas p
WHERE p.codigo=j.plataforma
GROUP BY plataforma
ORDER BY valor_total_videojuegos;

/* 4. Halle el valor total de los videojuegos por cada género y por cada plataforma. */
SELECT p.nombre AS plataforma, g.nombre AS genero, SUM(precio) AS valor_total_videojuegos
FROM plataformas p, generos g, juegos j
WHERE (p.codigo = j.plataforma AND g.codigo = j.genero)
GROUP BY plataforma, genero
ORDER BY plataforma;

/* 5. Seleccione los videojuegos donde el año de lanzamiento sea mayor a 2010 de los
géneros de acción, aventura o fútbol. */
SELECT j.anniolanz AS año_lanzamiento, COUNT(*) cantidad_juegos
FROM generos g, juegos j
WHERE (g.codigo = j.genero) AND (g.nombre LIKE 'acción' OR g.nombre LIKE 'aventura' OR g.nombre LIKE 'fútbol') 
GROUP BY año_lanzamiento
HAVING año_lanzamiento > '2010'
ORDER BY año_lanzamiento;

/* 6. Seleccione Sólo las plataformas de videojuegos donde la sumatoria del precio de
los videojuegos fue mayor a 220.000. */
SELECT p.nombre AS plataforma, SUM(precio) AS valor_total_videojuegos
FROM juegos j, plataformas p
WHERE (j.plataforma = p.codigo)
GROUP BY plataforma
HAVING valor_total_videojuegos > 220000;

/* 7. Muestre como resultado la cantidad de videojuegos por cada año de lanzamiento y
la sumatoria de precios por cada año de lanzamiento. */
SELECT anniolanz AS año_lanzamiento, COUNT(*) cantidad_juegos, SUM(precio) AS suma_precios
FROM juegos
GROUP BY año_lanzamiento
ORDER BY año_lanzamiento, suma_precios;

/* 8. Seleccione todos los campos de la tabla videojuegos, al final agregue otro campo
que indique si el nombre del Juego comienza por la letra M o si el nombre del juego
No comienza por la letra M */
SELECT *, CASE nombre
			WHEN nombre LIKE 'M%' THEN 'No'
            ELSE 'Si'
            END AS empieza_por_m
FROM juegos;

/* 9. Seleccione en una misma consulta todos los campos de la tabla videojuegos, el
nombre del género y el nombre de la plataforma.*/
SELECT j.*, p.nombre AS plataforma, g.nombre AS genero
FROM juegos j, generos g, plataformas p
WHERE (j.plataforma = p.codigo AND j.genero = g.codigo)
ORDER BY j.idjuego;

/* 10. Muestre cual es el valor total de la sumatoria de los video juegos cuya cuarta letra
del nombre del videojuego es la vocal e. */
SELECT COUNT(*) AS cantidad_juegos, SUM(precio) AS suma_precio
FROM juegos
WHERE  SUBSTRING(nombre, 4, 1) = 'e';