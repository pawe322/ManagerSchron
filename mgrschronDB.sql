create database if not exists mgrschron;

use mgrschron;

drop table if exists pets;

CREATE TABLE `pets` (
	`id` int(10) NOT NULL AUTO_INCREMENT,
	`name` varchar(64) DEFAULT NULL,
	`type_of_animal` varchar(64) DEFAULT NULL,
	`age` int(10) DEFAULT NULL,
	`height[cm]` int(10) DEFAULT NULL,
	PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `pets` (`id`,`name`,`type_of_animal`,`age`,`height[cm]`) VALUES (1,'Domestos','Kot',4,40);
INSERT INTO `pets` (`id`,`name`,`type_of_animal`,`age`,`height[cm]`) VALUES (2,'Edmund','Slon',7,140);