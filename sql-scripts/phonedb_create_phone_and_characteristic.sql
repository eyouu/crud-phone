CREATE DATABASE  IF NOT EXISTS `phonedb` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `phonedb`;
-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: phonedb
-- ------------------------------------------------------
-- Server version	8.0.19

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
-- Table structure for table `characteristic`
--

DROP TABLE IF EXISTS `characteristic`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `characteristic` (
  `id` int NOT NULL AUTO_INCREMENT,
  `memory` varchar(25) DEFAULT NULL,
  `screen_diagonal` varchar(25) DEFAULT NULL,
  `RAM` varchar(25) DEFAULT NULL,
  `front_camera` varchar(25) DEFAULT NULL,
  `main_camera` varchar(25) DEFAULT NULL,
  `battery` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `characteristic`
--

LOCK TABLES `characteristic` WRITE;
/*!40000 ALTER TABLE `characteristic` DISABLE KEYS */;
INSERT INTO `characteristic` VALUES (1,'128GB/512GB','6.1\'\'','8 GB','10 MP','12 MP + 12 MP + 16 MP','3400 mAh'),(2,'64GB/256GB/512GB','5.8\'\'','4 GB','12 MP','12 MP + 12 MP + 12 MP','3046 mAh'),(3,'128GB/256GB/512GB','6.47\'\'','6/8 GB','32 MP','40 MP','4200 mAh'),(4,'32 GB','6.22\'\'','2/3 GB','8 MP','13 MP + 2 MP','5000 mAh'),(5,'512 GB','7.3\'\'','12 GB','10 MP + 8 MP','12 MP + 12 MP + 16 MP','4235 mAh'),(6,'256 GB','6.7\'\'','8 GB','12 MP','12 MP + 12 MP','3300 mAh'),(7,'32GB/128GB/256GB ','5.5\'\'','3 GB','7 MP','12 MP + 12 MP','2900 mAh'),(8,'64GB/128GB/256GB','6.1\'\'','3 GB','7 MP','12 MP','2942 mAh'),(9,'16GB/32GB/128GB','4.0\'\'','2 GB','1.2 MP','12 MP','1624 mAh');
/*!40000 ALTER TABLE `characteristic` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `phone`
--

DROP TABLE IF EXISTS `phone`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `phone` (
  `id` int NOT NULL AUTO_INCREMENT,
  `model` varchar(128) DEFAULT NULL,
  `producing_country` varchar(64) DEFAULT NULL,
  `characteristic_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `characteristic_id` (`characteristic_id`),
  CONSTRAINT `phone_ibfk_1` FOREIGN KEY (`characteristic_id`) REFERENCES `characteristic` (`id`) ON DELETE SET NULL
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phone`
--

LOCK TABLES `phone` WRITE;
/*!40000 ALTER TABLE `phone` DISABLE KEYS */;
INSERT INTO `phone` VALUES (1,'Samsung Galaxy S10','China',1),(2,'iPhone 11 Pro','USA',2),(3,'Huawei P30 Pro','China',3),(4,'Xiaomi Redmi 8A Dual','China',4),(5,'Samsung Galaxy Fold 5G','China',5),(6,'Samsung Galaxy Z Flip','China',6),(7,'Apple iPhone 7 Plus','USA',7),(8,'Apple iPhone XR','USA',8),(9,'Apple iPhone SE','USA',9);
/*!40000 ALTER TABLE `phone` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-02-17 18:02:40
