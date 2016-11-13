/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.5.28 : Database - test
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`test` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `test`;

/*Table structure for table `permission` */

DROP TABLE IF EXISTS `permission`;

CREATE TABLE `permission` (
  `permission_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `permission_name` varchar(100) DEFAULT NULL,
  `permission_url` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`permission_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `permission` */

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `role_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

/*Data for the table `role` */

insert  into `role`(`role_id`,`role_name`) values (8,'boss'),(9,'moneyBoss'),(10,'technologyBoss'),(11,'productBoss'),(12,'moneyWorker'),(13,'technologyWorker'),(14,'productWorker');

/*Table structure for table `role_permission` */

DROP TABLE IF EXISTS `role_permission`;

CREATE TABLE `role_permission` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_id` bigint(20) DEFAULT NULL,
  `permission_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `role_permission` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `username` varchar(100) DEFAULT NULL,
  `realname` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `gender` tinyint(1) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `phone` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `id` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`username`,`realname`,`password`,`gender`,`address`,`phone`,`email`,`id`) values ('wangwu_productWorker','王五_产品底层员工',NULL,NULL,NULL,NULL,NULL,'1b93eaef07c84e259c8b19923afb474f'),('zhangsan_moneyWorker','张三_财务底层员工','123456',NULL,NULL,NULL,NULL,'89afaa7be4e14ac09d83bc428f65382f'),('hsy','何世远','123456',0,'北京市昌平区','13800000000','13800000000@163.com','a9f4443cf32b4951ba25fca140d0e0ba'),('wxd','王晓东','123456',0,'北京市西城区广安门内','12323234545','12323234545@163.com','d27498b1f640412386a8c619c6e9b3c8'),('byn','白亚楠','123456',NULL,NULL,NULL,NULL,'d3bdddb0a13f432ea7c6ebfb2d6f5e48'),('lisi_technolodyWorler','李四_技术底层员工','123456',NULL,NULL,NULL,NULL,'e5722e45579343f89f550dc56fbcc668'),('zln','赵丽娜','123456',1,'北京市朝阳区北苑路北奥运媒体村','13567509800','13567509800@163.com','e9869ee284ab4d9281f587acda24bc59');

/*Table structure for table `user_role` */

DROP TABLE IF EXISTS `user_role`;

CREATE TABLE `user_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) DEFAULT NULL,
  `role_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

/*Data for the table `user_role` */

insert  into `user_role`(`id`,`username`,`role_id`) values (4,'hsy',8),(5,'wxd',10),(6,'zln',9),(7,'byn',11),(8,'zhangsan_moneyWorker',12),(9,'wangwu_productWorker',14),(10,'lisi_technolodyWorler',13),(11,'hsy',9),(12,'hsy',10),(13,'hsy',11),(14,'hsy',12),(15,'hsy',13),(16,'hsy',14),(17,'wxd',13),(18,'byn',14),(19,'zln',12);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
