/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.7.12-log : Database - redis
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`redis` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;

USE `redis`;

/*Table structure for table `account` */

DROP TABLE IF EXISTS `account`;

CREATE TABLE `account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(200) COLLATE utf8_bin DEFAULT NULL COMMENT '用户名',
  `pwd` varchar(200) COLLATE utf8_bin DEFAULT NULL COMMENT '密码',
  `createDate` datetime DEFAULT NULL COMMENT '创建时间',
  `flag` char(1) COLLATE utf8_bin DEFAULT NULL COMMENT '禁用0，启用1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=113 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `account` */

insert  into `account`(`id`,`username`,`pwd`,`createDate`,`flag`) values (111,'张三','admin','2015-10-11 00:00:00','1'),(112,'李四','admin111','2016-10-11 00:00:00','1');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
