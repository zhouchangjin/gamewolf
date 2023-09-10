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

/*Data for the table `undo_log` */

/*Data for the table `vg_info` */

insert  into `vg_info`(`id`,`gametitle_en`,`gametitle_zh`,`dev_com_id`,`dev_com_name`,`pub_com_id`,`pub_com_name`,`release_date`,`platform`,`genreids`,`themes`) values 
(5,Ultima,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Data for the table `vg_menu` */

insert  into `vg_menu`(`id`,`menu_name`,`menu_cname`,`menu_icon`,`menu_path`,`menu_icon_url`,`parent_id`,`menu_type`) values 
(2,gameplatform,游戏平台,platform,NULL,NULL,NULL,NULL),
(3,gamecategory,游戏类别,grid,NULL,NULL,NULL,NULL),
(4,gameinfo,游戏信息,info,NULL,NULL,NULL,NULL),
(5,gamecompany,游戏公司,house,NULL,NULL,NULL,NULL),
(6,gamereview,游戏评论,comment,NULL,NULL,NULL,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
