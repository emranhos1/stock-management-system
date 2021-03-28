-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: grosary-shop-exam
-- ------------------------------------------------------
-- Server version	8.0.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `brand`
--

DROP TABLE IF EXISTS `brand`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `brand` (
  `t_brand_id` int(11) NOT NULL AUTO_INCREMENT,
  `t_brand_name` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `t_status` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`t_brand_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `brand`
--

LOCK TABLES `brand` WRITE;
/*!40000 ALTER TABLE `brand` DISABLE KEYS */;
INSERT INTO `brand` VALUES (1,'Rupchada','1'),(2,'Pran','1'),(3,'AAAA','1');
/*!40000 ALTER TABLE `brand` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `category` (
  `t_category_id` int(11) NOT NULL AUTO_INCREMENT,
  `t_category_name` varchar(45) DEFAULT NULL,
  `t_status` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`t_category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (1,'Rice','1'),(2,'Oil','1'),(3,'Egg','1'),(4,'Suger','1'),(5,'asfasdf','1'),(6,'asdfasdf','2'),(7,'asdfasdf','2'),(8,'asdfasdfasfa','1'),(9,'sdfgsdfg','2'),(10,'sdfgsdfg','2'),(11,'sdfgsdfg','1'),(12,'sdfgsdfg','2'),(13,'sdfgsdfgsdg','1'),(14,'sdfgsdgdsgf','1');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `consumtion_details`
--

DROP TABLE IF EXISTS `consumtion_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `consumtion_details` (
  `t_cons_details_id` int(11) NOT NULL AUTO_INCREMENT,
  `t_cons_master_id` int(11) DEFAULT NULL,
  `t_product_id` int(11) DEFAULT NULL,
  `t_expiry_date` datetime DEFAULT NULL,
  `t_unit` varchar(45) DEFAULT NULL,
  `t_unit_price` double DEFAULT NULL,
  `t_qty` double DEFAULT NULL,
  `t_total_price` double DEFAULT NULL,
  `t_status` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`t_cons_details_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `consumtion_details`
--

LOCK TABLES `consumtion_details` WRITE;
/*!40000 ALTER TABLE `consumtion_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `consumtion_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `consumtion_master`
--

DROP TABLE IF EXISTS `consumtion_master`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `consumtion_master` (
  `t_consm_master_id` int(11) NOT NULL AUTO_INCREMENT,
  `t_consm_date` datetime DEFAULT NULL,
  `t_consm_code` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `t_total_qty` double DEFAULT NULL,
  `t_total_price` double DEFAULT NULL,
  `t_create_date` datetime DEFAULT NULL,
  `t_create_user` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `t_update_date` datetime DEFAULT NULL,
  `t_update_user` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`t_consm_master_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `consumtion_master`
--

LOCK TABLES `consumtion_master` WRITE;
/*!40000 ALTER TABLE `consumtion_master` DISABLE KEYS */;
/*!40000 ALTER TABLE `consumtion_master` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `t_customer_id` int(11) NOT NULL AUTO_INCREMENT,
  `t_customer_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `t_customer_phone` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `t_entry_date` datetime DEFAULT NULL,
  `t_entry_user` int(11) DEFAULT NULL,
  `t_upd_date` datetime DEFAULT NULL,
  `t_upd_user` int(11) DEFAULT NULL,
  PRIMARY KEY (`t_customer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,'forruk','01670932273','2021-03-04 11:41:03',1,'2021-03-04 11:55:38',1),(2,'sojib','01982736454','2021-03-04 11:41:16',1,'2021-03-04 11:41:31',1),(3,'AAAAAA','01928374837','2021-03-04 11:56:04',1,'2021-03-07 17:51:37',1),(4,'BBBB','01670932273','2021-03-07 17:51:57',1,NULL,NULL);
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gender`
--

DROP TABLE IF EXISTS `gender`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `gender` (
  `t_gender_code` int(11) NOT NULL AUTO_INCREMENT,
  `t_upd_date` datetime DEFAULT NULL,
  `t_upd_user` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `t_entry_date` datetime DEFAULT NULL,
  `t_entry_user` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `t_lang2_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `t_lang1_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `t_short_gndr_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`t_gender_code`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gender`
--

LOCK TABLES `gender` WRITE;
/*!40000 ALTER TABLE `gender` DISABLE KEYS */;
INSERT INTO `gender` VALUES (1,'2021-02-23 17:57:52','SELF','2021-02-23 17:57:52','SELF','Male','পুরুষ','M'),(2,'2021-02-23 17:57:52','SELF','2021-02-23 17:57:52','SELF','Female','মহিলা','F');
/*!40000 ALTER TABLE `gender` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `login` (
  `t_login_table_id` int(11) NOT NULL AUTO_INCREMENT,
  `t_login_date` datetime DEFAULT NULL,
  `t_logout_date` datetime DEFAULT NULL,
  `t_user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`t_login_table_id`)
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES (1,'2021-03-04 17:45:04','2021-03-04 17:45:16',1),(2,'2021-03-07 11:13:31','2021-03-07 11:13:33',1),(3,'2021-03-07 11:13:38','2021-03-07 11:13:54',1),(4,'2021-03-07 11:39:41','2021-03-07 11:40:21',1),(5,'2021-03-07 11:41:39','2021-03-07 11:41:48',1),(6,'2021-03-07 11:44:09','2021-03-07 11:44:15',1),(7,'2021-03-07 11:44:50','2021-03-07 11:45:18',1),(8,'2021-03-07 11:46:22','2021-03-07 11:46:41',1),(9,'2021-03-07 11:47:30','2021-03-07 11:47:48',1),(10,'2021-03-07 11:50:45','2021-03-07 11:51:06',1),(11,'2021-03-07 11:52:22','2021-03-07 11:53:04',1),(12,'2021-03-07 11:57:20','2021-03-07 11:57:40',1),(13,'2021-03-07 15:39:50','2021-03-07 15:42:02',1),(14,'2021-03-07 15:42:54','2021-03-07 15:43:13',1),(15,'2021-03-07 15:44:27','2021-03-07 15:45:00',1),(16,'2021-03-07 15:45:15','2021-03-07 15:47:22',1),(17,'2021-03-07 15:49:10','2021-03-07 15:49:40',1),(18,'2021-03-07 15:50:00','2021-03-07 15:50:24',1),(19,'2021-03-07 15:54:53','2021-03-07 15:55:18',1),(20,'2021-03-07 15:56:43','2021-03-07 15:57:08',1),(21,'2021-03-07 15:57:39','2021-03-07 15:57:58',1),(22,'2021-03-07 15:59:07','2021-03-07 16:00:21',1),(23,'2021-03-07 16:00:36','2021-03-07 16:04:21',1),(24,'2021-03-07 16:04:35','2021-03-07 16:06:21',1),(25,'2021-03-07 16:06:52','2021-03-07 16:07:00',1),(26,'2021-03-07 16:07:31','2021-03-07 16:08:18',1),(27,'2021-03-07 16:10:40','2021-03-07 16:11:37',1),(28,'2021-03-07 16:28:40','2021-03-07 17:00:37',1),(29,'2021-03-07 16:58:58','2021-03-07 17:00:37',1),(30,'2021-03-07 17:00:54','2021-03-07 17:02:24',1),(31,'2021-03-07 17:15:01','2021-03-07 17:15:31',1),(32,'2021-03-07 17:16:19','2021-03-07 17:52:45',1),(33,'2021-03-07 17:50:50','2021-03-07 17:52:45',1),(34,'2021-03-07 17:52:56','2021-03-07 17:53:41',1),(35,'2021-03-07 17:55:48','2021-03-07 17:55:56',1),(36,'2021-03-07 18:01:31','2021-03-07 18:01:33',1),(37,'2021-03-08 08:55:18','2021-03-08 08:55:46',1),(38,'2021-03-08 09:13:54','2021-03-08 09:14:04',1),(39,'2021-03-08 09:15:38','2021-03-08 09:15:46',1),(40,'2021-03-08 09:15:56','2021-03-08 09:17:01',1),(41,'2021-03-08 09:17:15','2021-03-08 09:17:43',1),(42,'2021-03-08 09:54:28','2021-03-08 09:57:47',1),(43,'2021-03-08 09:58:05','2021-03-08 09:58:56',1),(44,'2021-03-08 09:59:13','2021-03-08 10:00:15',1),(45,'2021-03-08 10:00:28','2021-03-08 10:01:14',1),(46,'2021-03-08 10:06:25','2021-03-08 10:06:26',1),(47,'2021-03-08 10:06:34',NULL,3),(48,'2021-03-08 10:13:45','2021-03-08 10:15:10',1),(49,'2021-03-08 12:19:31','2021-03-08 12:19:56',1),(50,'2021-03-08 12:20:50','2021-03-08 12:21:15',1),(51,'2021-03-08 12:21:54','2021-03-08 12:22:04',1),(52,'2021-03-08 12:24:22','2021-03-08 12:24:36',1),(53,'2021-03-08 12:38:45','2021-03-08 12:39:25',1),(54,'2021-03-08 12:43:45','2021-03-08 12:43:58',1),(55,'2021-03-08 12:44:18','2021-03-08 12:44:23',1),(56,'2021-03-08 16:15:34','2021-03-08 16:16:25',1),(57,'2021-03-09 08:50:30','2021-03-09 10:31:20',1),(58,'2021-03-09 11:16:34','2021-03-09 11:17:00',1),(59,'2021-03-09 11:46:10','2021-03-09 11:48:04',1),(60,'2021-03-09 11:46:59','2021-03-09 11:48:04',1),(61,'2021-03-09 11:47:48','2021-03-09 11:48:04',1),(62,'2021-03-28 09:20:44',NULL,1);
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `panel_label`
--

DROP TABLE IF EXISTS `panel_label`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `panel_label` (
  `t_panel_label_id` int(11) NOT NULL,
  `t_label_name_global` varchar(100) DEFAULT NULL,
  `t_label_name_native` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`t_panel_label_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `panel_label`
--

LOCK TABLES `panel_label` WRITE;
/*!40000 ALTER TABLE `panel_label` DISABLE KEYS */;
INSERT INTO `panel_label` VALUES (1,'log_in','প্রবেশ করুন'),(2,'sign_up','নিবন্ধন করুন'),(3,'forget_password?','পাসওয়ার্ড ভুলে গেছেন?'),(4,'write_username','ব্যবহারকারীর নাম লিখুন!'),(5,'write_password','পাসওয়ার্ড লিখুন!');
/*!40000 ALTER TABLE `panel_label` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product` (
  `t_product_id` int(11) NOT NULL AUTO_INCREMENT,
  `t_product_name` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `t_description` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `t_category_id` int(11) DEFAULT NULL,
  `t_brand_id` int(11) DEFAULT NULL,
  `t_status` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `t_entry_date` datetime DEFAULT NULL,
  `t_entry_user` int(11) DEFAULT NULL,
  `t_upd_date` datetime DEFAULT NULL,
  `t_upd_user` int(11) DEFAULT NULL,
  PRIMARY KEY (`t_product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (1,'Rice','Goood',1,2,'1','2021-03-04 11:22:29',1,NULL,NULL),(2,'Oil','asdfasfdasfs',2,1,'1','2021-03-04 11:22:55',1,'2021-03-04 11:39:46',1),(3,'asdfa','asdfasdf',1,2,'1','2021-03-04 11:39:36',1,NULL,NULL),(4,'DDDD','DDDDD',1,1,'1','2021-03-07 16:05:26',1,'2021-03-07 16:05:57',1);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `raise_details`
--

DROP TABLE IF EXISTS `raise_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `raise_details` (
  `t_raise_details_id` int(11) NOT NULL AUTO_INCREMENT,
  `t_raise_master_id` int(11) DEFAULT NULL,
  `t_product_id` int(11) DEFAULT NULL,
  `t_expiry_date` datetime DEFAULT NULL,
  `t_unit` varchar(45) DEFAULT NULL,
  `t_unit_price` double DEFAULT NULL,
  `t_qty` double DEFAULT NULL,
  `t_total_price` double DEFAULT NULL,
  `t_status` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`t_raise_details_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='	';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `raise_details`
--

LOCK TABLES `raise_details` WRITE;
/*!40000 ALTER TABLE `raise_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `raise_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `raise_master`
--

DROP TABLE IF EXISTS `raise_master`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `raise_master` (
  `t_raise_master_id` int(11) NOT NULL AUTO_INCREMENT,
  `t_raise_date` datetime DEFAULT NULL,
  `t_raise_code` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `t_total_qty` double DEFAULT NULL,
  `t_total_price` double DEFAULT NULL,
  `t_create_date` datetime DEFAULT NULL,
  `t_create_user` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `t_update_date` datetime DEFAULT NULL,
  `t_update_user` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`t_raise_master_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `raise_master`
--

LOCK TABLES `raise_master` WRITE;
/*!40000 ALTER TABLE `raise_master` DISABLE KEYS */;
/*!40000 ALTER TABLE `raise_master` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `role` (
  `t_role_id` int(11) NOT NULL AUTO_INCREMENT,
  `t_upd_date` datetime DEFAULT NULL,
  `t_upd_user` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `t_entry_date` datetime DEFAULT NULL,
  `t_entry_user` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `t_lang2_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `t_lang1_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `t_short_role_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`t_role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'2021-02-23 17:57:52','SELF','2021-02-23 17:57:52','SELF','SUPPER ADMIN','সুপার অ্যাডমিন','SUPADM'),(2,'2021-02-23 17:57:52','SELF','2021-02-23 17:57:52','SELF','ADMIN','অ্যাডমিন','ADM'),(3,'2021-02-23 17:57:52','SELF','2021-02-23 17:57:52','SELF','EMPLOYEE','কর্মচারী','EMP');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `t_user_id` int(11) NOT NULL AUTO_INCREMENT,
  `t_address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `t_upd_date` datetime DEFAULT NULL,
  `t_upd_user` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `t_email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `t_entry_date` datetime DEFAULT NULL,
  `t_entry_user` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `t_gender_code` int(11) DEFAULT NULL,
  `t_lang2_fname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `t_lang2_lname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `t_lang1_fname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `t_lang1_lname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `t_nid_no` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `t_password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `t_phone_no` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `t_role_id` int(11) DEFAULT NULL,
  `t_user_photo` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `t_status` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`t_user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'moghbazar, Dhaka, Bangladesh',NULL,NULL,NULL,'2021-03-04 10:37:20',NULL,1,'Md. Emran','Hossain',NULL,NULL,'1019292837747483','81dc9bdb52d04dc20036dbd8313ed055','0167',2,NULL,'1'),(2,'Tongi gazipur','2021-03-08 10:00:46','1','admin@fagmai.caom','2021-03-04 11:57:23',NULL,1,'Mizanur','Rahaman',NULL,NULL,'141231423141','81dc9bdb52d04dc20036dbd8313ed055','01711263621',1,NULL,'1'),(3,'Dhaka	','2021-03-08 10:01:05','1','sfas','2021-03-07 11:12:17',NULL,1,'Md. Emran','Hossain',NULL,NULL,'019298388342','81dc9bdb52d04dc20036dbd8313ed055','01670932273',3,NULL,'1');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-03-28  9:52:39
