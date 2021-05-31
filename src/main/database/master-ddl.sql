CREATE DATABASE IF NOT EXISTS `customer-relationship-management-system`;
USE `customer-relationship-management-system`;

-------------------------------------
-- Create the Customer table
-------------------------------------

DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

-------------------------------------
-- Add data to Customer table
-------------------------------------
INSERT INTO `customer` VALUES 
	(1,'Elina','Garanca','e.garanca@asylvestre.com'),
	(2,'Beverly','Sills','b.sills@asylvestre.com'),
	(3,'Luciano','Pavarotti','l.pavarotti@asylvestre.com'),
	(4,'Natalie','Dessay','n.dessay@asylvestre.com'),
	(5,'Ramon','Vargas','r.vargas@asylvestre.com');
