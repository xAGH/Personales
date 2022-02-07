CREATE DATABASE libreria;
USE libreria;

CREATE TABLE autores( 
	codigo char(5) primary key not null,
	nombre char(60),
	genero char(1)
);

CREATE TABLE aprendices(
	documento char(20) primary key not null,
	nombre char(60),
	hobbies varchar(250),
	alias char(50)
 );
 
 CREATE TABLE libros(
	isbn char(20) primary key not null,
	titulo char(100),
	autor char(5),
	aprendiz char(20),
	calificacion char(1),
	categoria tinyint(1),
	estado tinyint(1),
    FOREIGN KEY  `FK_autor` (autor) REFERENCES autores(codigo),
	FOREIGN KEY `FK_aprendiz` (aprendiz) REFERENCES aprendices(documento)
  );

INSERT INTO autores()
VALUES (1,'Anita Shreve','F');

INSERT INTO autores()
VALUES (2,'Harold Muñoz','M');

INSERT INTO aprendices(documento, nombre, hobbies, alias)
VALUES (1004916686, 'Alejandro Giraldo Herrera', 'Videojuegos', 'Alejo');

INSERT INTO libros()
VALUES ('9789584268969', 'Nadie grita tu nombre', '2', '1004916686', 'B', 2, 1);

INSERT INTO libros()
VALUES ('9788422655374', 'Extraños arrebatos de amor y de ira', '1', '1004916686', 'E', 3, 1);

UPDATE aprendices SET hobbies=CONCAT(hobbies, ", Música", ", Caminar") WHERE documento='1004916686';

/* PUNTO 4. Sentencia que devuelve error:
UPDATE aprendices SET documento = '1010' WHERE docuemnto='1004916686';
*/

/* PUNTO 5. */
UPDATE libros SET calificacion='E', categoria=3 WHERE isbn='9789584268969';

/* PUNTO 6. Sentencia que devuelve error:
DELETE FROM aprendices WHERE documento='1004916686';
*/

/* PUNTO 7. Sentencia que devuelve error:
DELETE FROM autores WHERE codigo='1';
*/

/* PUNTO 8. */
UPDATE libros SET estado = 2 WHERE isbn='9789584268969';

/* PUNTO 9 */
DELETE FROM libros WHERE isbn='9788422655374';

