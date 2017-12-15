CREATE DATABASE  IF NOT EXISTS `plazasuite_schema` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `plazasuite_schema`;
-- MySQL dump 10.13  Distrib 5.5.16, for Win32 (x86)
--
-- Host: localhost    Database: plazasuite_schema
-- ------------------------------------------------------
-- Server version	5.5.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `other_services_table`
--

DROP TABLE IF EXISTS `other_services_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `other_services_table` (
  `booking_id` int(11) DEFAULT NULL,
  `other_service_item_name` varchar(45) DEFAULT NULL,
  `other_service_item_quantity` int(11) DEFAULT NULL,
  `other_service_item_rate` int(11) DEFAULT NULL,
  `other_service_item_total_price` int(11) DEFAULT NULL,
  `other_service_item_delivered_date_time` datetime DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `other_services_table`
--

LOCK TABLES `other_services_table` WRITE;
/*!40000 ALTER TABLE `other_services_table` DISABLE KEYS */;
/*!40000 ALTER TABLE `other_services_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `service_table`
--

DROP TABLE IF EXISTS `service_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `service_table` (
  `service_id` int(11) NOT NULL AUTO_INCREMENT,
  `service_name` varchar(45) DEFAULT NULL,
  `service_rate` int(11) DEFAULT NULL,
  `sgst_in_percentage` int(11) DEFAULT NULL,
  `cgst_in_percentage` int(11) DEFAULT NULL,
  `gst_in_percentage` int(11) DEFAULT NULL,
  PRIMARY KEY (`service_id`),
  UNIQUE KEY `service_name_UNIQUE` (`service_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='To add available services to the Plazasuite System';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `service_table`
--

LOCK TABLES `service_table` WRITE;
/*!40000 ALTER TABLE `service_table` DISABLE KEYS */;
/*!40000 ALTER TABLE `service_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rooms_table`
--

DROP TABLE IF EXISTS `rooms_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rooms_table` (
  `room_id` int(11) NOT NULL AUTO_INCREMENT,
  `room_number` varchar(45) DEFAULT NULL,
  `room_type` varchar(45) DEFAULT NULL,
  `room_rate` int(11) DEFAULT NULL,
  `room_capacity` int(11) DEFAULT NULL COMMENT 'Number of persons/bed that a room can accomodate',
  `room_plan` varchar(45) DEFAULT NULL,
  `is_open_for_service` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`room_id`),
  UNIQUE KEY `room_number_UNIQUE` (`room_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rooms_table`
--

LOCK TABLES `rooms_table` WRITE;
/*!40000 ALTER TABLE `rooms_table` DISABLE KEYS */;
/*!40000 ALTER TABLE `rooms_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (1);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `booking_table`
--

DROP TABLE IF EXISTS `booking_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `booking_table` (
  `booking_id` int(11) NOT NULL AUTO_INCREMENT,
  `room_id` int(11) DEFAULT NULL,
  `first_name` varchar(45) DEFAULT NULL,
  `middle_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `address` varchar(300) DEFAULT NULL,
  `district` varchar(45) DEFAULT NULL,
  `state_name` varchar(45) DEFAULT NULL,
  `pin_or_zip_code` varchar(45) DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL,
  `nationality` varchar(45) DEFAULT NULL,
  `check-in_date_time` datetime DEFAULT NULL,
  `check-out_date_time` datetime DEFAULT NULL,
  `address_proof` varchar(145) DEFAULT NULL,
  `address_proof_id` varchar(245) DEFAULT NULL,
  `is_dirty` tinyint(4) DEFAULT NULL,
  `is_booked` tinyint(4) DEFAULT NULL,
  `is_extra_bed_opted` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`booking_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='master table for transactions';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `booking_table`
--

LOCK TABLES `booking_table` WRITE;
/*!40000 ALTER TABLE `booking_table` DISABLE KEYS */;
/*!40000 ALTER TABLE `booking_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `provided_services`
--

DROP TABLE IF EXISTS `provided_services`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `provided_services` (
  `booking_id` int(11) DEFAULT NULL,
  `service_provided_date_time` datetime DEFAULT NULL,
  `service_id` int(11) DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `provided_services`
--

LOCK TABLES `provided_services` WRITE;
/*!40000 ALTER TABLE `provided_services` DISABLE KEYS */;
/*!40000 ALTER TABLE `provided_services` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-11-27  3:07:00
