CREATE DATABASE IF NOT EXISTS clasificados;
USE clasificados;

CREATE TABLE propietario(
    documento INT(12) NOT NULL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(80) NOT NULL,
    telefono CHAR(20) NOT NULL
);

CREATE TABLE producto(
    idproducto INT(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombrepro VARCHAR(50) NOT NULL,
    descripcion VARCHAR(1000) NOT NULL,
    fecha DATE,
    estado CHAR(1),
    nombrefoto VARCHAR(100) NOT NULL,
    documento INT(12) NOT NULL,
    FOREIGN KEY (documento)
        REFERENCES propietario (documento)
);