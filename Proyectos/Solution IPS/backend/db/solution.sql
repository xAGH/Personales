-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 29-06-2021 a las 01:42:45
-- Versión del servidor: 10.4.18-MariaDB
-- Versión de PHP: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `solution`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `citas`
--

CREATE TABLE `citas` (
  `idcitas` int(11) NOT NULL,
  `fecha_cita` varchar(45) DEFAULT NULL,
  `hora_cita` varchar(45) DEFAULT NULL,
  `medico` varchar(100) DEFAULT NULL,
  `especialidad` varchar(45) DEFAULT NULL,
  `paciente` varchar(45) DEFAULT NULL,
  `personal` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `citas`
--

INSERT INTO `citas` (`idcitas`, `fecha_cita`, `hora_cita`, `medico`, `especialidad`, `paciente`, `personal`) VALUES
(1, '2021-06-18', '13:55', 'Cris Solano', 'Medicina General', NULL, NULL),
(2, '2021-06-01', '19:47', 'Juan Agudelo', 'Odontologia', NULL, NULL),
(3, '2021-06-16', '20:49', 'Julian Franco', 'Psicologia', NULL, NULL),
(4, '2021-06-10', '09:02', 'Julian Franco', 'Odontologia', NULL, NULL),
(6, '2021-06-09', '09:35', 'Juan Agudelo', 'Psiquiatria', '55555', NULL),
(8, '2021-06-12', '11:19', 'Julian Franco', 'Psiquiatria', '1094974365', NULL),
(9, '2021-06-15', '17:03', 'Cris Solano', 'Medicina General', '1094974365', NULL),
(10, '2021-06-16', '11:11', 'Julian Franco', 'Medicina General', '1094974365', NULL),
(11, '2021-06-10', '10:13', 'Juan Agudelo', 'Odontologia', '1094974365', NULL),
(12, '2021-06-03', '09:27', 'Julian Franco', 'Medicina General', '1094974365', NULL),
(13, '2021-06-30', '10:36', 'Juan Camilo Hernandez Ocampo', 'Medicina General', '1094974365', NULL),
(14, '2021-06-13', '10:51', 'Cris Solano', 'Odontologia', '1094974365', NULL),
(15, '2021-06-09', '12:43', 'Cris Solano', 'Medicina General', '1094974365', NULL),
(16, '2021-06-24', '11:51', 'Michael Jackson', 'Psicologia', '1094974365', NULL),
(17, '2021-06-03', '11:53', 'Julian Franco', 'Psicologia', '1094974365', NULL),
(18, '2021-06-18', '11:58', 'Juan Agudelo', 'Medicina General', '1094974365', NULL),
(19, '2021-06-18', '11:58', 'Juan Agudelo', 'Medicina General', '1094974365', NULL),
(20, '2021-06-09', '15:47', 'Juan Camilo Hernandez Ocampo', 'Medicina General', '1094974365', NULL),
(21, '2021-06-09', '15:47', 'Juan Camilo Hernandez Ocampo', 'Medicina General', '1094974365', NULL),
(22, '2021-06-05', '15:50', 'Juan Camilo Hernandez Ocampo', 'Medicina General', '1094974365', NULL),
(23, '2021-06-12', '17:53', 'Julian Franco', 'Medicina General', '1094974365', NULL),
(24, '2021-06-06', '18:04', 'Michael Jackson', 'Odontologia', '1094974365', NULL),
(25, '2021-06-06', '18:04', 'Michael Jackson', 'Odontologia', '1094974365', NULL),
(26, '2021-06-06', '18:04', 'Michael Jackson', 'Odontologia', '1094974365', NULL),
(27, '2021-06-06', '18:04', 'Michael Jackson', 'Odontologia', '1094974365', NULL),
(28, '2021-06-06', '18:04', 'Michael Jackson', 'Odontologia', '1094974365', NULL),
(29, '2021-06-11', '17:17', 'Cris Solano', 'Odontologia', '1094974365', NULL),
(30, '2021-06-09', '17:18', 'Juan Camilo Hernandez Ocampo', 'Psicologia', '1094974365', NULL),
(31, '2021-06-09', '17:18', 'Juan Camilo Hernandez Ocampo', 'Psicologia', '1094974365', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pacientes`
--

CREATE TABLE `pacientes` (
  `tipo_documento` char(1) NOT NULL,
  `num_documento` varchar(45) NOT NULL,
  `fecha_documento` varchar(20) NOT NULL,
  `fecha_nacimiento` varchar(20) NOT NULL,
  `nombres` varchar(45) NOT NULL,
  `apellidos` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `contraseña` varchar(45) NOT NULL,
  `direccion` varchar(45) NOT NULL,
  `celular` varchar(45) NOT NULL,
  `telefono` varchar(45) NOT NULL,
  `idcita` int(11) DEFAULT NULL,
  `nume_documento` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `pacientes`
--

INSERT INTO `pacientes` (`tipo_documento`, `num_documento`, `fecha_documento`, `fecha_nacimiento`, `nombres`, `apellidos`, `email`, `contraseña`, `direccion`, `celular`, `telefono`, `idcita`, `nume_documento`) VALUES
('0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', 0, NULL),
('0', '1', '0', '0', '0', '0', '0', '0', '0', '0', '0', 0, NULL),
('C', '1094974365', '2018-06-10', '1990-06-12', 'juanjo', 'solano', 'juanjo@gmail.com', '123456', 'norte  pueblotapao', '55555555', '33333333', 0, NULL),
('C', '11111', '2021-06-05', '2021-06-10', 'tommy', 'riaño', 'g@gmail.com', '123456', 'cra 25', '33333', '23654', 0, NULL),
('C', '123456', '2021-06-12', '2021-06-05', 'sola', 'ella', 'g@gmail.com', '123456', 'cra 27', '999999', '44444', 0, NULL),
('C', '22222222', '2021-06-17', '2021-06-25', 'Juan Esteban', 'Sanchez', 'je@gmail.com', '123456', 'manzana verde 25', '3125246869', '75326987', NULL, NULL),
('C', '333666999', '2021-06-17', '2021-06-10', 'Cristina Marcela', 'Solano Pardo', 'solis@gmail.com', '123456', 'cra 52', '3215236985', '4236541', NULL, NULL),
('C', '365988885', '2021-06-09', '2021-06-18', 'alejandro', 'rodriguez', 'alejoreodu@gmail.com', '123456', 'trv 45', '444444', '36855', NULL, NULL),
('C', '369852', '2021-06-18', '2021-06-12', 'Natalia', 'Atheortua', 'nata@gmail.com', '123456', 'cra 36', '3212365478', '45632153', NULL, NULL),
('C', '444555666', '2021-06-11', '2021-06-18', 'Jose Leonardo', 'Perdomo', 'g@gmail.com', '123456', 'la floresta 36', '3102587413', '3654215', NULL, NULL),
('C', '55555', '2021-06-19', '2021-06-05', 'cris', 'solano', 'g@gmail.com', '123456', 'cra 27', '999999', '888888', 0, NULL),
('C', '789654321', '2021-06-11', '2021-10-01', 'german', 'angarita', 'hu@hotmail.com', '123456', 'cra 85', '320000000', '6666666', 0, NULL),
('C', '8888888', '2021-06-11', '2021-06-24', 'francisco', 'gutierrez', 'ki@gmail.com', '123456', 'trv 236', '6666666', '2457777', NULL, NULL),
('C', '98763', '2021-06-10', '2021-07-03', 'finn', 'cortez', 'cortez@gmail.com', '', 'trv 36', '66666544', '985622', NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personal`
--

CREATE TABLE `personal` (
  `tipo_documento` char(1) DEFAULT NULL,
  `nume_documento` varchar(45) NOT NULL,
  `fecha_documento` char(25) NOT NULL,
  `fecha_nacimiento` char(25) NOT NULL,
  `nombres` varchar(45) NOT NULL,
  `apellidos` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `contraseña` varchar(45) NOT NULL,
  `direccion` varchar(45) NOT NULL,
  `celular` varchar(45) NOT NULL,
  `telefono` varchar(45) NOT NULL,
  `tp` varchar(45) DEFAULT NULL,
  `rol` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `personal`
--

INSERT INTO `personal` (`tipo_documento`, `nume_documento`, `fecha_documento`, `fecha_nacimiento`, `nombres`, `apellidos`, `email`, `contraseña`, `direccion`, `celular`, `telefono`, `tp`, `rol`) VALUES
('C', '1023365412', '2005-02-03', '1987-02-03', 'Juan Camilo', 'Hernandez Ocampo', 'hernandez@gmail.com', '123456', 'cra 26 # 13-36', '3123698521', '7236985', '18560', 'Clinico'),
('C', '1023369852', '2006-06-04', '1998-06-11', 'Cris', 'Solano', 'cris@gmail.com', '123456', 'cra 36 # 98-25', '3004265896', '7852369', '256315', 'Clinico'),
('C', '1068632145', '2020-01-18', '2002-01-12', 'Juan ', 'Agudelo', 'agudelo@gmail.com', '123456', 'cra 32 - 54-12', '3503698521', '3698521', '35352', 'Clinico'),
('C', '1073658742', '2018-06-28', '2000-08-25', 'Michael', 'Jackson', 'jackson@gmail.com', '123456', 'Calle 23 # 15-45', '3012589631', '2563654', '98523', 'Clinico'),
('C', '1073852147', '2004-08-23', '1986-10-12', 'Julian', 'Franco', 'franco@gmail.com', '123456', 'cra 25 # 25-36', '3112587413', '3652147', '12576', 'Clinico');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `citas`
--
ALTER TABLE `citas`
  ADD PRIMARY KEY (`idcitas`),
  ADD KEY `pacientefk_idx` (`paciente`),
  ADD KEY `personalfk_idx` (`personal`);

--
-- Indices de la tabla `pacientes`
--
ALTER TABLE `pacientes`
  ADD PRIMARY KEY (`num_documento`),
  ADD KEY `cita_t_idx` (`idcita`);

--
-- Indices de la tabla `personal`
--
ALTER TABLE `personal`
  ADD PRIMARY KEY (`nume_documento`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `citas`
--
ALTER TABLE `citas`
  MODIFY `idcitas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `citas`
--
ALTER TABLE `citas`
  ADD CONSTRAINT `pacientefk` FOREIGN KEY (`paciente`) REFERENCES `pacientes` (`num_documento`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `personalfk` FOREIGN KEY (`personal`) REFERENCES `personal` (`nume_documento`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
