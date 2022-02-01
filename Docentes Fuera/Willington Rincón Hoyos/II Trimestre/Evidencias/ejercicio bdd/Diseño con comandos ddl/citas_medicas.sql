CREATE DATABASE citas_medicas;

USE citas_medicas;

CREATE TABLE usuarios (
    idusuario INT(11) PRIMARY KEY NOT NULL,
    nombre VARCHAR(80),
    direccion VARCHAR(100),
    telefono CHAR(30),
    email VARCHAR(80),
    password VARCHAR(256)
);

CREATE TABLE citas (
    idcita INT(11) PRIMARY KEY NOT NULL,
    fecha DATE,
    hora CHAR(5),
    medico INT(11),
    eps CHAR(6),
    paciente CHAR(20),
    servicio CHAR(10),
    estado TINYINT(4),
    idusuario INT(11)
);

CREATE TABLE servicios (
    codigo CHAR(10) PRIMARY KEY NOT NULL,
    nombre VARCHAR(300),
    estado TINYINT(4)
);

CREATE TABLE medicos (
    idmedico INT(11) PRIMARY KEY NOT NULL,
    documento CHAR(15),
    regmedico CHAR(20),
    nombres CHAR(40),
    apellidos CHAR(40),
    direccion VARCHAR(100),
    telefono CHAR(30),
    especialidad CHAR(3),
    firma VARCHAR(100)
);

CREATE TABLE eps (
    codigo CHAR(6) PRIMARY KEY NOT NULL,
    nombre VARCHAR(80),
    direccion VARCHAR(100),
    telefono CHAR(30),
    contacto VARCHAR(50),
    tipoentidad CHAR(10),
    manual CHAR(2)
);

CREATE TABLE tarifas (
    idregistro INT(11) PRIMARY KEY NOT NULL,
    codmanual CHAR(2),
    codservicio CHAR(10),
    valor FLOAT
);

CREATE TABLE especialidades (
    codigo CHAR(3) PRIMARY KEY NOT NULL,
    nombre CHAR(60),
    nivel TINYINT(4)
);

CREATE TABLE manuales (
    codigo CHAR(2) PRIMARY KEY NOT NULL,
    nombre CHAR(50),
    base FLOAT,
    anno INT(11)
);

CREATE TABLE pacientes (
    documento CHAR(20) PRIMARY KEY NOT NULL,
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

CREATE TABLE pacientes_fotos (
    documento CHAR(20) PRIMARY KEY,
    foto BLOB
);

alter table citas
add foreign key `FK_medicos_medico_citas` (medico) references medicos(idmedico);

alter table citas
add foreign key `FK_eps_eps_citas` (eps) references eps(codigo);

alter table citas
add foreign key `FK_pacientes_paciente_citas` (paciente) references pacientes(documento);

alter table citas
add foreign key `FK_servicios_servicio_citas` (servicio) references servicios(codigo);

alter table citas
add foreign key `FK_usuarios_idusuario_citas` (idusuario) references usuarios(idusuario);

alter table medicos
add foreign key `FK_especialidades_especialidad_medicos` (especialidad) references especialidades(codigo);

alter table tarifas
add foreign key `FK_servicios_servicio_tarifas` (codservicio) references servicios(codigo);

alter table tarifas
add foreign key `FK_manuales_codmanual_tarifas` (codmanual) references manuales(codigo);

alter table pacientes 
add foreign key `FK_eps_eps_pacientes` (eps) references eps(codigo);

alter table pacientes_fotos
add foreign key `FK_pacientes_documento_pacientes_fotos` (documento) references pacientes(documento);

alter table eps
add foreign key `FK_manuales_manual_eps` (manual) references manuales(codigo);