-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Apr 15, 2018 at 03:31 AM
-- Server version: 5.6.20
-- PHP Version: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `biblio_donbosco`
--

-- --------------------------------------------------------

--
-- Table structure for table `autor`
--

CREATE TABLE IF NOT EXISTS `autor` (
`autor_id` int(11) NOT NULL,
  `autor_nombre` varchar(500) NOT NULL,
  `autor_descripcion` varchar(1000) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=10 ;

--
-- Dumping data for table `autor`
--

INSERT INTO `autor` (`autor_id`, `autor_nombre`, `autor_descripcion`) VALUES
(1, 'Alvaro Menen Desleal', 'Escritor'),
(2, 'Choi Wankyu', 'Computacion'),
(3, 'Francisco Javier Gil Rubio', 'Computacion'),
(4, 'David Powers', 'DreamWeaver'),
(5, 'Timothy Boroncyk', 'SQL'),
(6, 'Laura Lemay', 'Java'),
(7, 'Harvey Deitel', 'C++'),
(8, 'Gil Rubio', 'Computacion'),
(9, 'Erika Leonard Mitchell', 'Escritora');

-- --------------------------------------------------------

--
-- Table structure for table `configuracion`
--

CREATE TABLE IF NOT EXISTS `configuracion` (
`configuracion_id` int(11) NOT NULL,
  `configuracion_alumno` int(11) NOT NULL,
  `configuracion_docente` int(11) NOT NULL,
  `configuracion_mora` float NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `configuracion`
--

INSERT INTO `configuracion` (`configuracion_id`, `configuracion_alumno`, `configuracion_docente`, `configuracion_mora`, `estado`) VALUES
(1, 3, 5, 0.25, 1),
(2, 4, 5, 0.25, 0),
(3, 3, 6, 0.5, 0),
(4, 4, 6, 0.25, 0);

-- --------------------------------------------------------

--
-- Table structure for table `editorial`
--

CREATE TABLE IF NOT EXISTS `editorial` (
`editorial_id` int(11) NOT NULL,
  `editorial_nombre` varchar(100) NOT NULL,
  `editorial_descripcion` varchar(100) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=16 ;

--
-- Dumping data for table `editorial`
--

INSERT INTO `editorial` (`editorial_id`, `editorial_nombre`, `editorial_descripcion`) VALUES
(1, 'Prenteice Hall', 'Estados Unidos'),
(2, 'Alfaomega', 'Mexico'),
(3, 'Thompson', 'Mexico'),
(4, 'Mcgraw Hill', 'España'),
(5, 'Perason', 'España'),
(6, 'Mexico', 'Mexico'),
(7, 'Cambrige University Pess', 'New York'),
(8, 'Wiley', 'Nueva York'),
(9, 'Grijalbo', 'Mexico'),
(10, 'Springer Verlag', 'Estados Unidos.'),
(11, 'Wrox Press', 'Inglaterra\r\n'),
(15, 'Vintage Books', 'Britanico');

-- --------------------------------------------------------

--
-- Table structure for table `material`
--

CREATE TABLE IF NOT EXISTS `material` (
`material_id` int(11) NOT NULL,
  `material_isbn` varchar(50) NOT NULL,
  `material_nombre` varchar(200) NOT NULL,
  `material_descripcion` varchar(1000) NOT NULL,
  `id_autor` int(11) NOT NULL,
  `material_anio` int(11) NOT NULL,
  `material_edicion` int(11) NOT NULL,
  `material_fechaRegistro` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `id_editorial` int(11) NOT NULL,
  `material_paginas` varchar(20) DEFAULT NULL,
  `id_TipoMaterial` int(11) NOT NULL,
  `ejemplares` int(11) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `material`
--

INSERT INTO `material` (`material_id`, `material_isbn`, `material_nombre`, `material_descripcion`, `id_autor`, `material_anio`, `material_edicion`, `material_fechaRegistro`, `id_editorial`, `material_paginas`, `id_TipoMaterial`, `ejemplares`) VALUES
(1, '1-86003-73-0', 'Beginning php4', 'Lenguaje de programacion en php', 2, 2000, 1, '2017-05-12 21:48:52', 11, '775', 1, 5),
(2, '84-481-3209-2', 'Creacion de sitios Web con php4 ', 'Lenguaje de programacion en php', 8, 2004, 1, '2017-05-12 21:52:36', 1, '547', 1, 8),
(3, '970-17-0229-8', 'Aprendiendo Java 2', 'Lenguaje de programacion en java', 6, 2000, 1, '2017-05-12 21:54:46', 1, '615', 1, 6),
(4, '970-26-0531-8', 'Como programar en C++ y Java', 'Lenguaje de programacion en java', 7, 2004, 4, '2017-05-12 21:57:09', 1, '9', 5, 9);

-- --------------------------------------------------------

--
-- Table structure for table `prestamo`
--

CREATE TABLE IF NOT EXISTS `prestamo` (
`prestamo_id` int(11) NOT NULL,
  `id_material` int(11) NOT NULL,
  `prestamo_fechaActual` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `prestamo_fechaDevolucion` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `id_usuario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `tipomaterial`
--

CREATE TABLE IF NOT EXISTS `tipomaterial` (
`TipoMaterial_id` int(11) NOT NULL,
  `TipoMaterial_nombre` varchar(50) NOT NULL,
  `TipoMaterial_descripcion` varchar(300) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Dumping data for table `tipomaterial`
--

INSERT INTO `tipomaterial` (`TipoMaterial_id`, `TipoMaterial_nombre`, `TipoMaterial_descripcion`) VALUES
(1, 'Libros', 'Material Escrito'),
(2, 'Obras', 'Material Escrito'),
(3, 'Revistas', 'Material Escrito'),
(4, 'CD-Rom', 'Material Audiovisual'),
(5, 'DVD', 'Material Audiovisual'),
(6, 'Tesis', 'Material Escrito'),
(7, 'prueba', 'Prueba de cat');

-- --------------------------------------------------------

--
-- Table structure for table `tipousuario`
--

CREATE TABLE IF NOT EXISTS `tipousuario` (
`tipousuario_id` int(11) NOT NULL,
  `tipousuario_nombre` varchar(100) NOT NULL,
  `tipousuario_descripcion` varchar(500) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `tipousuario`
--

INSERT INTO `tipousuario` (`tipousuario_id`, `tipousuario_nombre`, `tipousuario_descripcion`) VALUES
(1, 'root', 'usuarios root'),
(2, 'docente', 'usuarios docente'),
(3, 'alumno ', 'usuarios alumnos');

-- --------------------------------------------------------

--
-- Table structure for table `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
`usuario_id` int(11) NOT NULL,
  `usuario_nombre` varchar(100) NOT NULL,
  `usuario_apellido` varchar(100) NOT NULL,
  `usuario_carnet` varchar(10) NOT NULL,
  `id_tipousuario` int(11) NOT NULL,
  `usuario_password` varchar(200) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Dumping data for table `usuario`
--

INSERT INTO `usuario` (`usuario_id`, `usuario_nombre`, `usuario_apellido`, `usuario_carnet`, `id_tipousuario`, `usuario_password`) VALUES
(1, 'root', 'root', 'root', 1, '123456'),
(2, 'Daniel', 'Huezo', 'hr132470', 1, 'hr132470'),
(3, 'Mauricio', 'Duran', 'dc150312', 1, 'dc150312'),
(4, 'David', 'Sanchez', 'is121754', 1, 'is121754'),
(5, 'Fernando', 'Orellana', 'or151715', 1, 'or151715'),
(6, 'Edgardo', 'Ruiz', 'er123456', 2, 'er123456'),
(7, 'Armando', 'Cortez', 'ac123456', 3, 'ac123456');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `autor`
--
ALTER TABLE `autor`
 ADD PRIMARY KEY (`autor_id`);

--
-- Indexes for table `configuracion`
--
ALTER TABLE `configuracion`
 ADD PRIMARY KEY (`configuracion_id`);

--
-- Indexes for table `editorial`
--
ALTER TABLE `editorial`
 ADD PRIMARY KEY (`editorial_id`);

--
-- Indexes for table `material`
--
ALTER TABLE `material`
 ADD PRIMARY KEY (`material_id`), ADD UNIQUE KEY `material_isbn` (`material_isbn`), ADD KEY `id_autor` (`id_autor`), ADD KEY `id_editorial` (`id_editorial`), ADD KEY `id_material` (`id_TipoMaterial`);

--
-- Indexes for table `prestamo`
--
ALTER TABLE `prestamo`
 ADD PRIMARY KEY (`prestamo_id`), ADD KEY `id_material` (`id_material`), ADD KEY `id_usuario` (`id_usuario`);

--
-- Indexes for table `tipomaterial`
--
ALTER TABLE `tipomaterial`
 ADD PRIMARY KEY (`TipoMaterial_id`);

--
-- Indexes for table `tipousuario`
--
ALTER TABLE `tipousuario`
 ADD PRIMARY KEY (`tipousuario_id`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
 ADD PRIMARY KEY (`usuario_id`), ADD KEY `id_tipousuario` (`id_tipousuario`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `autor`
--
ALTER TABLE `autor`
MODIFY `autor_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT for table `configuracion`
--
ALTER TABLE `configuracion`
MODIFY `configuracion_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `editorial`
--
ALTER TABLE `editorial`
MODIFY `editorial_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=16;
--
-- AUTO_INCREMENT for table `material`
--
ALTER TABLE `material`
MODIFY `material_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `prestamo`
--
ALTER TABLE `prestamo`
MODIFY `prestamo_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tipomaterial`
--
ALTER TABLE `tipomaterial`
MODIFY `TipoMaterial_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `tipousuario`
--
ALTER TABLE `tipousuario`
MODIFY `tipousuario_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
MODIFY `usuario_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=8;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `material`
--
ALTER TABLE `material`
ADD CONSTRAINT `material_ibfk_1` FOREIGN KEY (`id_TipoMaterial`) REFERENCES `tipomaterial` (`TipoMaterial_id`),
ADD CONSTRAINT `material_ibfk_2` FOREIGN KEY (`id_autor`) REFERENCES `autor` (`autor_id`),
ADD CONSTRAINT `material_ibfk_3` FOREIGN KEY (`id_editorial`) REFERENCES `editorial` (`editorial_id`);

--
-- Constraints for table `prestamo`
--
ALTER TABLE `prestamo`
ADD CONSTRAINT `prestamo_ibfk_1` FOREIGN KEY (`id_material`) REFERENCES `material` (`material_id`) ON DELETE CASCADE ON UPDATE CASCADE,
ADD CONSTRAINT `prestamo_ibfk_2` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`usuario_id`);

--
-- Constraints for table `usuario`
--
ALTER TABLE `usuario`
ADD CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`id_tipousuario`) REFERENCES `tipousuario` (`tipousuario_id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
