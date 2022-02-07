SELECT *
FROM pacientes
WHERE tipodoc IS NULL;

UPDATE pacientes 
SET tipodoc = NULL, fecnac = NULL
WHERE numero = '1000002360';

INSERT INTO unidadesf(codigo) 
VALUES('015');

SELECT c.nombre, d.codigo, d.descripcion
FROM detallesfac d, contratos c
WHERE d.contrato = c.codigo
ORDER BY d.codigo DESC;

SELECT *
FROM detallesfac
ORDER BY contrato;

UPDATE detallesfac 
SET contrato = NULL
WHERE ncargo = 2530;

CREATE TABLE usuarios (
    idusuario INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nombre CHAR(60)
);

ALTER TABLE detallesfac 
	ADD COLUMN idusuario int,
    ADD FOREIGN KEY(idusuario) 
		REFERENCES usuarios(idusuario);