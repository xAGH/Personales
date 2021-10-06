USE citas_2236347;

/* Inserción de datos*/
INSERT INTO manuales
VALUES('C1', 'Manual tarifario 2021', 3500.00, 2021);

INSERT INTO eps
VALUES('EPS001', 'Sánitas', 'Cra. 13 #117 #1a, Armenia - Quindío', '7466310', '7466310', 'Privada', 'C1');

INSERT INTO pacientes
VALUES('1004916686', 'CC', 'Giraldo', 'Herrera', 'Alejandro', '', 'Barrio La Cecilia', '3013258495',
	   'EPS001', 'M', '');
       
INSERT INTO pacientes
VALUES('4378072', 'CC', 'Giraldo', 'Tobón', 'Jhon', 'Eider', 'Barrio La Cecilia', '3017136116',
	   'EPS001', 'M', '');

/* Realizar una consulta que muestre los nombres y apellidos de los pacientes, el teléfono y el nombre de la EPS*/
SELECT CONCAT(p.pnombre, " ", p.snombre) AS nombres, CONCAT(p.papellido, " ", p.sapellido) AS apellidos,
		e.telefono AS telefono_eps, e.nombre AS nombre_eps
FROM pacientes p, eps e
WHERE e.codigo = p.eps;

/* Inserción con valores null*/
INSERT INTO pacientes
VALUES('1004870802', 'CC', 'Giraldo', 'Bañol', 'Michael', '', 'Barrio La Cecilia', '3012672710',
	   null, 'M', '');