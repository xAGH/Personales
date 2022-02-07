CREATE SCHEMA citas_2236347;
use citas_2236347;

CREATE TABLE especialidades
( codigo CHAR(3) PRIMARY KEY NOT NULL, 
  nombre CHAR(60),
  nivel TINYINT
);

CREATE TABLE medicos
( idmedico INT PRIMARY KEY NOT NULL AUTO_INCREMENT, 
  documento CHAR(15),
  regmedico CHAR(20),
  nombres CHAR(40),
  apellidos CHAR(40),
  direccion VARCHAR(100),
  telefono CHAR(30),
  especialidad CHAR(3),
  firma VARCHAR(100),
  FOREIGN KEY FK_medicos_especialidad (especialidad) REFERENCES
  especialidades(codigo)
);

/*DROP TABLE medicos se borra la tabla medicos pero el comando de creacion de medicos sigue ahi mismo */

CREATE TABLE eps
( codigo CHAR(6) PRIMARY KEY NOT NULL, 
  nombre VARCHAR(80),
  direccion VARCHAR(100),
  telefono CHAR(30),
  contacto VARCHAR(50),
  tipoentidad CHAR(10),
  manual CHAR(2)
);

CREATE TABLE tarifas
( idregistro INT PRIMARY KEY NOT NULL AUTO_INCREMENT, 
  codmanual CHAR(2),
  codservicio CHAR(10),
  valor FLOAT
);

CREATE TABLE manuales
( codigo CHAR(2) PRIMARY KEY NOT NULL, 
  nombre CHAR(50),
  base FLOAT,
  anno INT
);

CREATE TABLE pacientes
( documento CHAR(20) PRIMARY KEY NOT NULL, 
  tipodoc CHAR(2),
  papellido CHAR(20),
  sapellido CHAR(20),
  pnombre CHAR(20),
  snombre CHAR(20),
  direccion VARCHAR(100),
  telefono CHAR(30),
  eps CHAR(6),
  genero CHAR(1),
  discapacidad CHAR(1)
);


CREATE TABLE pacientes_fotos
( documento CHAR(20) PRIMARY KEY NOT NULL, 
  foto BLOB
);

CREATE TABLE citas
( idcita INT PRIMARY KEY NOT NULL AUTO_INCREMENT, 
  fecha DATE,
  hora CHAR(5),
  medico INT,
  eps CHAR(6),
  paciente CHAR(20),
  servicio CHAR(10),
  estado TINYINT(4),
  idusuario INT
);

CREATE TABLE usuarios
( idusuario INT PRIMARY KEY NOT NULL AUTO_INCREMENT, 
  nombre VARCHAR(80),
  direccion VARCHAR(100),
  telefono CHAR(30),
  email VARCHAR(80),
  password VARCHAR(256)
);

CREATE TABLE servicios
( codigo CHAR(6) PRIMARY KEY NOT NULL, 
  nombre VARCHAR(300),
  estado TINYINT(4)
);
ALTER TABLE eps ADD FOREIGN KEY FK_eps_manual (manual) REFERENCES
  manuales(codigo);

ALTER TABLE tarifas ADD FOREIGN KEY FK_tarifas_codservicio (codservicio) REFERENCES
  servicios(codigo);
ALTER TABLE tarifas ADD FOREIGN KEY FK_tarifas_codmanual (codmanual) REFERENCES
  manuales(codigo);
  
ALTER TABLE pacientes ADD FOREIGN KEY FK_pacientes_eps (eps) REFERENCES
  eps(codigo);
  
ALTER TABLE pacientes_fotos ADD FOREIGN KEY FK_pacientes_fotos_documento (documento) REFERENCES
  pacientes(documento);
  
ALTER TABLE citas ADD FOREIGN KEY FK_citas_medico (medico) REFERENCES
  medicos(idmedico);
ALTER TABLE citas ADD FOREIGN KEY FK_citas_eps (eps) REFERENCES
  eps(codigo);
ALTER TABLE citas ADD FOREIGN KEY FK_citas_paciente (paciente) REFERENCES
  pacientes(documento);
ALTER TABLE citas ADD FOREIGN KEY FK_citas_servicio (servicio) REFERENCES
  servicios(codigo);
ALTER TABLE citas ADD FOREIGN KEY FK_citas_idusuario (idusuario) REFERENCES
  usuarios(idusuario);