/*
SQLyog Ultimate v11.27 (32 bit)
MySQL - 5.5.40 : Database - cloudccerp
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`cloudccerp` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `cloudccerp`;

/*Table structure for table `delegate_unit` */

DROP TABLE IF EXISTS `delegate_unit`;

CREATE TABLE `delegate_unit` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `delegate_name` varchar(100) DEFAULT NULL COMMENT '委托单位名称',
  `delegate_age` int(11) DEFAULT NULL COMMENT '委托单位年龄',
  `delegate_distance` decimal(10,2) DEFAULT NULL COMMENT '委托单位运距',
  `create_time` datetime DEFAULT NULL COMMENT '成立时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `delegate_unit` */

insert  into `delegate_unit`(`id`,`delegate_name`,`delegate_age`,`delegate_distance`,`create_time`) values (1,'河南建业',20,'8.50','1999-02-02 10:50:55'),(2,'中铁七局',30,'45.25','1990-01-02 10:51:35');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
