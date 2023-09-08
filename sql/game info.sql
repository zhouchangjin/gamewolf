/*
SQLyog Community v13.2.0 (64 bit)
MySQL - 11.2.0-MariaDB : Database - gameinfo
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`gameinfo` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;

USE `gameinfo`;

/*Table structure for table `undo_log` */

DROP TABLE IF EXISTS `undo_log`;

CREATE TABLE `undo_log` (
  `branch_id` bigint(20) NOT NULL COMMENT 'branch transaction id',
  `xid` varchar(128) NOT NULL COMMENT 'global transaction id',
  `context` varchar(128) NOT NULL COMMENT 'undo_log context,such as serialization',
  `rollback_info` longblob NOT NULL COMMENT 'rollback info',
  `log_status` int(11) NOT NULL COMMENT '0:normal status,1:defense status',
  `log_created` datetime(6) NOT NULL COMMENT 'create datetime',
  `log_modified` datetime(6) NOT NULL COMMENT 'modify datetime',
  UNIQUE KEY `ux_undo_log` (`xid`,`branch_id`),
  KEY `ix_log_created` (`log_created`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='AT transaction mode undo table';

/*Data for the table `undo_log` */

/*Table structure for table `vg_info` */

DROP TABLE IF EXISTS `vg_info`;

CREATE TABLE `vg_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `gametitle_en` varchar(40) DEFAULT NULL,
  `gametitle_zh` varchar(20) DEFAULT NULL,
  `dev_com_id` int(11) DEFAULT NULL,
  `dev_com_name` varchar(20) DEFAULT NULL,
  `pub_com_id` int(11) DEFAULT NULL,
  `pub_com_name` varchar(20) DEFAULT NULL,
  `release_date` date DEFAULT NULL,
  `platform` varchar(20) DEFAULT NULL,
  `genreids` varchar(20) DEFAULT NULL,
  `themes` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `vg_info` */

insert  into `vg_info`(`id`,`gametitle_en`,`gametitle_zh`,`dev_com_id`,`dev_com_name`,`pub_com_id`,`pub_com_name`,`release_date`,`platform`,`genreids`,`themes`) values 
(4,Ultima,创世纪1,NULL,NULL,NULL,NULL,NULL,PC,1,1);

/*Table structure for table `vg_menu` */

DROP TABLE IF EXISTS `vg_menu`;

CREATE TABLE `vg_menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `menu_name` varchar(20) DEFAULT NULL,
  `menu_cname` varchar(20) DEFAULT NULL,
  `menu_icon` varchar(20) DEFAULT NULL,
  `menu_path` varchar(40) DEFAULT NULL,
  `menu_icon_url` varchar(40) DEFAULT NULL,
  `parent_id` int(11) DEFAULT NULL,
  `menu_type` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `vg_menu` */

insert  into `vg_menu`(`id`,`menu_name`,`menu_cname`,`menu_icon`,`menu_path`,`menu_icon_url`,`parent_id`,`menu_type`) values 
(1,test,test,NULL,NULL,NULL,NULL,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
