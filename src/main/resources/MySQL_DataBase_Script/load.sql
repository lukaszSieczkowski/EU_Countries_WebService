-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: eueconomy
-- ------------------------------------------------------
-- Server version	5.7.16-log

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
-- Table structure for table `country`
--

DROP TABLE IF EXISTS `country`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `country` (
  `id_country` bigint(20) NOT NULL AUTO_INCREMENT,
  `name_country` varchar(255) DEFAULT NULL,
  `code_country` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_country`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `country`
--

LOCK TABLES `country` WRITE;
/*!40000 ALTER TABLE `country` DISABLE KEYS */;
INSERT INTO `country` VALUES (1,'Austria','AU'),(2,'Belgium','BE'),(3,'Bulgaria','BG'),(4,'Cyprus','CY'),(5,'Croatia','CR'),(6,'The Czech Republic','CZ'),(7,'Denmark','DK'),(8,'Estonia','EE'),(9,'Finland','FI'),(10,'France','FR'),(11,'Greece','GR'),(12,'Spain','ES'),(13,'The Netherlands','NL'),(14,'Ireland','IE'),(15,'Lithuania','LT'),(16,'Luxemburg','LU'),(17,'Latvia','LV'),(18,'Malta','MT'),(19,'Germany','DE'),(20,'Poland','PL'),(21,'Portugal','PT'),(22,'Romania','RO'),(23,'Slovakia','SK'),(24,'Slowenia','SI'),(25,'Sweden','SE'),(26,'Hungary','HU'),(27,'Great Britain','GB'),(28,'Italy','IT');
/*!40000 ALTER TABLE `country` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `details`
--

DROP TABLE IF EXISTS `details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `details` (
  `id_details` int(11) NOT NULL,
  `area_details` int(11) DEFAULT NULL,
  `population_details` bigint(11) DEFAULT NULL,
  `capital_details` varchar(45) DEFAULT NULL,
  `currency_details` varchar(45) DEFAULT NULL,
  `gros_domestic_product_details` bigint(20) DEFAULT NULL,
  `gros_domestic_product_per_person_details` bigint(20) DEFAULT NULL,
  `id_country` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id_details`),
  KEY `FK2tcw65q0nyecsychjj5svy27g` (`id_country`),
  CONSTRAINT `FK2tcw65q0nyecsychjj5svy27g` FOREIGN KEY (`id_country`) REFERENCES `country` (`id_country`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `details`
--

LOCK TABLES `details` WRITE;
/*!40000 ALTER TABLE `details` DISABLE KEYS */;
INSERT INTO `details` VALUES (1,83871,8443000,'Viena','EURO',310000000000,47000,1),(2,30528,11090000,'Brussels','EURO',376000000000,43686,2),(3,111910,7300000,'Sofia','BGN',51000000000,7043,3),(4,5642,862000,'Nicosia','EURO',23000000000,26389,4),(5,56593,4300000,'Zagreb','HRK',44200000000,12000,5),(6,78866,10516000,'Prag','CZK',196000000000,18579,6),(7,43098,5500000,'Kopenhanen','DKK',210100000000,37657,7),(8,45226,1340000,'Talin','EURO',21800000000,16561,8),(9,338145,5427000,'Helsinki','EURO',250100000000,46098,9),(10,643801,65300000,'Paris','EURO',2032100000000,44007,10),(11,131957,11200000,'Athens','EURO',249200000000,22055,11),(12,504645,46000000,'Madrit','EURO',1352100000000,19289,12),(13,41526,16778000,'Amsterdam','EURO',773100000000,46142,13),(14,70723,4500000,'Dublin','EURO',210400000000,45888,14),(15,65300,2900000,'Wilno','EURO',42700000000,13262,15),(16,2586,520000,'Luxemburg','EURO',56700000000,107206,16),(17,64589,2000000,'Ryga','EURO',28300000000,13900,17),(18,316,408000,'Valletta','EURO',8600000000,27022,18),(19,357121,81900000,'Berlin','EURO',3700000000000,41513,19),(20,312879,38544000,'Warszawa','PLN',487600000000,12538,20),(21,92391,10500000,'Lisbona','EURO',212700000000,20179,21),(22,238391,21300000,'Bukarest','RON',169300000000,7935,22),(23,49035,5400000,'Bratislava','EURO',91000000000,16899,23),(24,20273,2000000,'Lublana','EURO',45600000000,22192,24),(25,449964,9500000,'Stockholm','SEK',544700000000,57638,25),(26,93030,9900000,'Budapest','HUF',126800000000,12735,26),(27,277820,63000000,'London','GBP',2440900000000,38859,27),(28,310230,59500000,'Roma','EURO',2014100000000,33115,28);
/*!40000 ALTER TABLE `details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `export`
--

DROP TABLE IF EXISTS `export`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `export` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `export_2002` bigint(20) NOT NULL,
  `export_2006` bigint(20) DEFAULT NULL,
  `export_2007` bigint(20) DEFAULT NULL,
  `export_2008` bigint(20) DEFAULT NULL,
  `export_2009` bigint(20) DEFAULT NULL,
  `export_2010` bigint(20) DEFAULT NULL,
  `export_2011` bigint(20) DEFAULT NULL,
  `export_2012` bigint(20) DEFAULT NULL,
  `export_2013` bigint(20) DEFAULT NULL,
  `export_2014` bigint(20) DEFAULT NULL,
  `export_2015` bigint(20) DEFAULT NULL,
  `id_country` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKfigt03l8dvbqyqggl14hq6tat` (`id_country`),
  CONSTRAINT `FKfigt03l8dvbqyqggl14hq6tat` FOREIGN KEY (`id_country`) REFERENCES `country` (`id_country`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `export`
--

LOCK TABLES `export` WRITE;
/*!40000 ALTER TABLE `export` DISABLE KEYS */;
/*!40000 ALTER TABLE `export` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gros_domestic_product_year_to_year_percentage`
--

DROP TABLE IF EXISTS `gros_domestic_product_year_to_year_percentage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gros_domestic_product_year_to_year_percentage` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `gros_domestic_product_2003` double DEFAULT NULL,
  `gros_domestic_product_2004` double DEFAULT NULL,
  `gros_domestic_product_2005` double DEFAULT NULL,
  `gros_domestic_product_2006` double DEFAULT NULL,
  `gros_domestic_product_2007` double DEFAULT NULL,
  `gros_domestic_product_2008` double DEFAULT NULL,
  `gros_domestic_product_2009` double DEFAULT NULL,
  `gros_domestic_product_2010` double DEFAULT NULL,
  `gros_domestic_product_2011` double DEFAULT NULL,
  `gros_domestic_product_2012` double DEFAULT NULL,
  `gros_domestic_product_2013` double DEFAULT NULL,
  `gros_domestic_product_2014` double DEFAULT NULL,
  `id_country` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK4stxckf0nam3839x2u9xwh1og` (`id_country`),
  CONSTRAINT `FK4stxckf0nam3839x2u9xwh1og` FOREIGN KEY (`id_country`) REFERENCES `country` (`id_country`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gros_domestic_product_year_to_year_percentage`
--

LOCK TABLES `gros_domestic_product_year_to_year_percentage` WRITE;
/*!40000 ALTER TABLE `gros_domestic_product_year_to_year_percentage` DISABLE KEYS */;
INSERT INTO `gros_domestic_product_year_to_year_percentage` VALUES (1,0.9,2.6,2.4,3.7,3.7,1.4,-3.8,2.1,2.7,0.8,0.7,1.9,1),(2,0.8,3.3,1.8,2.7,2.9,1,-2.8,2.4,1.8,-0.2,0.2,1.5,2),(3,5.5,6.7,6.4,6.5,6.4,6.2,-5.5,0.4,1.8,0.8,1.4,2,3),(4,1.9,4.2,3.9,4.1,5.1,3.6,-1.9,1.3,0.5,-2.4,-3.5,-1.3,4),(5,5.1,4.1,4.3,4.9,5.1,2.1,-6.9,-2.3,0,-2,-1,0.2,5),(6,3.8,4.7,6.8,7,5.7,3.1,-4.5,2.5,1.9,-1.3,0,1.9,6),(7,0.4,2.3,2.4,3.4,1.6,-0.8,-5.7,1.6,1.1,-0.6,1.1,1.7,7),(8,7.8,6.3,8.9,10.1,7.5,-4.2,-14.1,3.3,8.3,3.2,3,4,8),(9,2,4.1,2.9,4.4,5.3,0.3,-8.5,3.3,2.8,-0.2,0.3,1.2,9),(10,0.9,2.5,1.8,2.5,2.3,-0.1,-3.1,1.7,1.7,0,0.1,1.2,10),(11,5.9,4.4,2.3,5.5,3.5,-0.2,-3.1,-4.9,-7.1,-6.4,-4.4,0.6,11),(12,3.1,3.3,3.6,4.1,3.5,0.9,-3.7,-0.3,0.4,-1.4,-1.4,0.8,12),(13,0.3,2.2,2,3.4,3.9,1.8,-3.7,1.5,1,-1,-0.6,1.1,13),(14,3.9,4.4,5.9,5.4,5.4,-2.1,-5.5,-0.8,1.4,0.9,1.1,2.2,14),(15,10.3,7.4,7.8,7.8,9.8,2.9,-14.8,1.5,5.9,-3.6,3.1,3.6,15),(16,1.7,4.4,5.3,4.9,6.6,-0.7,-4.1,2.9,1.7,0.3,0.5,1.6,16),(17,7.6,8.9,10.1,11.2,9.6,-3.3,-17.7,-0.9,5.5,5.6,3.8,4.1,17),(18,0.7,-3,3.6,2.6,4.1,3.9,-2.6,2.9,1.7,0.8,1.5,2,18),(19,-0.4,1.2,0.7,3.7,3.3,1.1,-5.1,4.2,3,0.7,0.5,2,19),(20,3.9,5.3,3.6,6.2,6.8,5.1,1.6,3.9,4.3,2,1.2,2.2,20),(21,-0.9,1.6,0.8,1.4,2.4,0,2.9,1.9,-1.6,-3.2,-1.9,0.8,21),(22,5.2,8.5,4.2,7.9,6.3,7.3,-6.6,-1.1,2.2,0.7,1.6,2.5,22),(23,4.8,5.1,6.7,8.3,10.5,5.8,-4.9,4.4,3.2,-2,1.1,2.9,23),(24,2.9,4.4,4,5.8,7,3.4,-7.8,1.2,0.6,-2.3,-2,0.7,24),(25,2.3,4.2,3.2,4.3,3.3,-0.6,-5,6.6,3.7,0.8,1.3,2.7,25),(26,3.9,4.8,4,3.9,0.1,0.9,-6.8,1.3,1.6,-1.7,-0.1,1.3,26),(27,3.8,2.9,2.8,2.6,3.6,-1,-4,1.8,1,0.3,0.9,1.9,27),(28,0,1.7,0.9,2.2,1.7,-1.2,-5.5,1.7,0.4,-2.4,-1,0.8,28);
/*!40000 ALTER TABLE `gros_domestic_product_year_to_year_percentage` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inflation`
--

DROP TABLE IF EXISTS `inflation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `inflation` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `inflation_2001` double DEFAULT NULL,
  `inflation_2002` double DEFAULT NULL,
  `inflation_2003` double DEFAULT NULL,
  `inflation_2004` double DEFAULT NULL,
  `inflation_2005` double DEFAULT NULL,
  `inflation_2006` double DEFAULT NULL,
  `inflation_2007` double DEFAULT NULL,
  `inflation_2008` double DEFAULT NULL,
  `inflation_2009` double DEFAULT NULL,
  `inflation_2010` double DEFAULT NULL,
  `inflation_2011` double DEFAULT NULL,
  `inflation_2012` double DEFAULT NULL,
  `id_country` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKe6oa27cvcdyvwllfh6dq6qrig` (`id_country`),
  CONSTRAINT `FKe6oa27cvcdyvwllfh6dq6qrig` FOREIGN KEY (`id_country`) REFERENCES `country` (`id_country`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inflation`
--

LOCK TABLES `inflation` WRITE;
/*!40000 ALTER TABLE `inflation` DISABLE KEYS */;
/*!40000 ALTER TABLE `inflation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `interest_rates`
--

DROP TABLE IF EXISTS `interest_rates`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `interest_rates` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `interest_rates_2002` double DEFAULT NULL,
  `interest_rates_2003` double DEFAULT NULL,
  `interest_rates_2004` double DEFAULT NULL,
  `interest_rates_2005` double DEFAULT NULL,
  `interest_rates_2006` double DEFAULT NULL,
  `interest_rates_2007` double DEFAULT NULL,
  `interest_rates_2008` double DEFAULT NULL,
  `interest_rates_2009` double DEFAULT NULL,
  `interest_rates_2010` double DEFAULT NULL,
  `interest_rates_2011` double DEFAULT NULL,
  `interest_rates_2012` double DEFAULT NULL,
  `id_country` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK3lb8d80l7y9d49fo6pdu3ho28` (`id_country`),
  CONSTRAINT `FK3lb8d80l7y9d49fo6pdu3ho28` FOREIGN KEY (`id_country`) REFERENCES `country` (`id_country`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `interest_rates`
--

LOCK TABLES `interest_rates` WRITE;
/*!40000 ALTER TABLE `interest_rates` DISABLE KEYS */;
/*!40000 ALTER TABLE `interest_rates` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `keys`
--

DROP TABLE IF EXISTS `keys`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `keys` (
  `id` int(11) NOT NULL,
  `key_name` varchar(45) DEFAULT NULL,
  `key_password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `keys`
--

LOCK TABLES `keys` WRITE;
/*!40000 ALTER TABLE `keys` DISABLE KEYS */;
INSERT INTO `keys` VALUES (1,'myclientkey','ckpass'),(2,'maservicekey','skpass');
/*!40000 ALTER TABLE `keys` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `population`
--

DROP TABLE IF EXISTS `population`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `population` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `population_2001` bigint(20) DEFAULT NULL,
  `population_2002` bigint(20) DEFAULT NULL,
  `population_2003` bigint(20) DEFAULT NULL,
  `population_2004` bigint(20) DEFAULT NULL,
  `population_2005` bigint(20) DEFAULT NULL,
  `population_2006` bigint(20) DEFAULT NULL,
  `population_2007` bigint(20) DEFAULT NULL,
  `population_2008` bigint(20) DEFAULT NULL,
  `population_2009` bigint(20) DEFAULT NULL,
  `population_2010` bigint(20) DEFAULT NULL,
  `population_2011` bigint(20) DEFAULT NULL,
  `population_2012` bigint(20) DEFAULT NULL,
  `id_country` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKmrejn5ikvuo335dcm8afsaxb3` (`id_country`),
  CONSTRAINT `FKmrejn5ikvuo335dcm8afsaxb3` FOREIGN KEY (`id_country`) REFERENCES `country` (`id_country`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `population`
--

LOCK TABLES `population` WRITE;
/*!40000 ALTER TABLE `population` DISABLE KEYS */;
/*!40000 ALTER TABLE `population` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `unemployment`
--

DROP TABLE IF EXISTS `unemployment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `unemployment` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `unemployment_2003` double DEFAULT NULL,
  `unemployment_2004` double DEFAULT NULL,
  `unemployment_2005` double DEFAULT NULL,
  `unemployment_2006` double DEFAULT NULL,
  `unemployment_2007` double DEFAULT NULL,
  `unemployment_2008` double DEFAULT NULL,
  `unemployment_2009` double DEFAULT NULL,
  `unemployment_2010` double DEFAULT NULL,
  `unemployment_2011` double DEFAULT NULL,
  `unemployment_2012` double DEFAULT NULL,
  `id_country` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKiw7yiw6lkccp7j8wijgpdufbu` (`id_country`),
  CONSTRAINT `FKiw7yiw6lkccp7j8wijgpdufbu` FOREIGN KEY (`id_country`) REFERENCES `country` (`id_country`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `unemployment`
--

LOCK TABLES `unemployment` WRITE;
/*!40000 ALTER TABLE `unemployment` DISABLE KEYS */;
INSERT INTO `unemployment` VALUES (1,4.3,4.9,5.2,4.8,4.4,3.8,4.8,4.4,4.2,4.3,1),(2,8.2,8.4,8.5,8.3,7.5,7,7.9,8.3,7.2,7.6,2),(3,13.7,12.1,10.1,9,6.9,5.6,6.8,10.3,11.3,12.3,3),(4,4.1,4.6,5.3,4.6,3.9,3.7,5.4,6.3,7.9,11.9,4),(5,14.1,13.8,12.8,11.4,9.8,8.4,9.1,11.8,13.5,15.9,5),(6,7.8,8.3,7.9,7.1,5.3,4.4,6.7,7.3,6.7,7,6),(7,5.4,5.5,4.8,3.9,3.8,3.4,6,7.5,7.6,7.5,7),(8,10.1,9.7,7.9,5.9,4.6,5.5,13.8,16.9,12.5,10.2,8),(9,9,8.8,8.4,7.7,6.9,6.4,8.2,8.4,7.8,7.7,9),(10,8.9,9.3,9.3,9.2,8.4,7.8,9.5,9.7,9.6,10.2,10),(11,9.7,10.5,9.9,8.9,8.3,7.7,9.5,12.6,17.7,24.3,11),(12,11.4,10.9,9.2,8.5,8.3,11.3,18,20.1,21.7,25,12),(13,4.2,5.1,5.3,4.4,3.6,3.1,3.7,4.5,4.4,5.3,13),(14,4.6,4.5,4.4,4.5,4.7,6.4,12,13.9,14.7,14.7,14),(15,12.4,11.3,8,5.2,3.8,5.3,13.6,18,15.3,13.3,15),(16,3.8,5,4.6,4.6,4.2,4.9,5.1,4.6,4.8,5.1,16),(17,11.3,11.2,9.6,7.3,6.5,8,18.2,19.8,16.2,14.9,17),(18,7.7,7.2,7.3,6.9,6.5,6,6.9,6.9,6.5,6.4,18),(19,9.8,10.5,11.3,10.3,8.7,7.5,7.8,7.1,5.9,5.5,19),(20,19.8,19.1,17.9,13.9,9.6,7.1,8.1,9.7,9.7,10.1,20),(21,7.1,7.5,8.6,8.6,8.9,8.5,10.6,12,12.9,15.9,21),(22,6.8,8,7.2,7.3,6.4,5.8,6.9,7.3,7.4,7,22),(23,17.7,18.4,16.4,13.5,11.2,9.6,12.1,14.5,13.6,14,23),(24,6.7,6.3,6.5,6,4.8,4.4,5.9,7.3,8.2,8.9,24),(25,6.6,7.4,7.7,7.1,6.1,6.2,8.3,8.6,7.8,8,25),(26,5.8,6.1,7.2,7.5,7.4,7.8,10,11.2,10.9,10.9,26),(27,5,4.7,4.8,5.4,5.3,5.6,7.6,7.8,8,7,27),(28,8.4,8,7.7,6.8,6.1,6.7,7.8,8.4,8.4,10.7,28);
/*!40000 ALTER TABLE `unemployment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `password` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'pass1','user1'),(2,'pass2','user2'),(3,'ckpass','myclientkey'),(4,'skpass','myservicekey');
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

-- Dump completed on 2017-08-27 13:21:36
