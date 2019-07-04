-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: locate_io
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
-- Table structure for table `10_no`
--

DROP TABLE IF EXISTS `10_no`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `10_no` (
  `S_no` int(2) NOT NULL AUTO_INCREMENT,
  `Place` varchar(50) DEFAULT NULL,
  `Address` varchar(200) DEFAULT NULL,
  `phone_no` bigint(10) DEFAULT NULL,
  `Cost_for_two` varchar(4) DEFAULT 'null',
  `Rating` decimal(2,1) DEFAULT NULL,
  PRIMARY KEY (`S_no`),
  UNIQUE KEY `phone_no` (`phone_no`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `10_no`
--

LOCK TABLES `10_no` WRITE;
/*!40000 ALTER TABLE `10_no` DISABLE KEYS */;
INSERT INTO `10_no` VALUES (1,'Sagar Gaire Fast Food','10, Number Market, Arera Colony, Bhopal',9424438581,'400',5.0),(2,'Bake N Shake','B-1, GM Tower, Stop No. 10, Arera Colony, Bhopal',7554291111,'500',4.5),(3,'Hideout','10 no. Market, E-3/52, Area Colony, Apposite Shree Brijesh Sweet Centre, Bhopal, Madhya Pradesh 462016',9893238187,'800',4.0),(4,'Day 2 Day','71, 10 No Market, Arera Colony, Bhopal, Madhya Pradesh 462001',7554222281,'500',3.5);
/*!40000 ALTER TABLE `10_no` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `10_no_bak`
--

DROP TABLE IF EXISTS `10_no_bak`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `10_no_bak` (
  `S_no` int(2) NOT NULL DEFAULT '0',
  `Place` varchar(50) DEFAULT NULL,
  `Address` varchar(200) DEFAULT NULL,
  `phone_no` bigint(10) DEFAULT NULL,
  `Cost_for_two` varchar(4) DEFAULT 'null',
  `Rating` decimal(2,1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `10_no_bak`
--

LOCK TABLES `10_no_bak` WRITE;
/*!40000 ALTER TABLE `10_no_bak` DISABLE KEYS */;
INSERT INTO `10_no_bak` VALUES (1,'Sagar Gaire Fast Food','10, Number Market, Arera Colony, Bhopal',9424438581,'400',5.0),(2,'Bake N Shake','B-1, GM Tower, Stop No. 10, Arera Colony, Bhopal',7554291111,'500',4.5),(3,'Hideout','10 no. Market, E-3/52, Area Colony, Apposite Shree Brijesh Sweet Centre, Bhopal, Madhya Pradesh 462016',9893238187,'800',4.0),(4,'Day 2 Day','71, 10 No Market, Arera Colony, Bhopal, Madhya Pradesh 462001',7554222281,'500',3.5);
/*!40000 ALTER TABLE `10_no_bak` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `credentials`
--

DROP TABLE IF EXISTS `credentials`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `credentials` (
  `Uname` varchar(50) NOT NULL,
  `Password` varchar(50) DEFAULT NULL,
  `Joined_On` date DEFAULT NULL,
  `Login_Time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`Uname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `credentials`
--

LOCK TABLES `credentials` WRITE;
/*!40000 ALTER TABLE `credentials` DISABLE KEYS */;
INSERT INTO `credentials` VALUES ('ILoveSpices','spicesluv','2017-07-29','2017-08-30 09:19:06'),('nayan','saxena','2017-08-30','2017-08-30 09:17:22'),('test','abc','2017-08-30','2017-08-30 09:44:18'),('trial','xyz','2017-02-09','2017-09-01 16:36:35');
/*!40000 ALTER TABLE `credentials` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `credentials_bak`
--

DROP TABLE IF EXISTS `credentials_bak`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `credentials_bak` (
  `Uname` varchar(50) NOT NULL,
  `Password` varchar(50) DEFAULT NULL,
  `Joined_On` date DEFAULT NULL,
  `Login_Time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `credentials_bak`
--

LOCK TABLES `credentials_bak` WRITE;
/*!40000 ALTER TABLE `credentials_bak` DISABLE KEYS */;
INSERT INTO `credentials_bak` VALUES ('ILoveSpices','spicesluv','2017-07-29','2017-08-30 09:19:06'),('nayan','saxena','2017-08-30','2017-08-30 09:17:22'),('test','abc','2017-08-30','2017-08-30 09:17:35'),('trial','xyz','2017-02-09','2017-09-01 16:36:35'),('trial','xyz','2017-02-09','2017-09-01 16:36:35');
/*!40000 ALTER TABLE `credentials_bak` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gulmohar`
--

DROP TABLE IF EXISTS `gulmohar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gulmohar` (
  `S_no` int(2) NOT NULL AUTO_INCREMENT,
  `Place` varchar(50) DEFAULT NULL,
  `Address` varchar(200) DEFAULT NULL,
  `phone_no` bigint(10) DEFAULT NULL,
  `Cost_for_two` varchar(4) DEFAULT 'null',
  `Rating` decimal(2,1) DEFAULT NULL,
  PRIMARY KEY (`S_no`),
  UNIQUE KEY `phone_no` (`phone_no`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gulmohar`
--

LOCK TABLES `gulmohar` WRITE;
/*!40000 ALTER TABLE `gulmohar` DISABLE KEYS */;
INSERT INTO `gulmohar` VALUES (1,'Bombay Street Cafe','G9 Tower, 1st Floor, Opp., Aura Mall , Gulmohar., Bhopal, Madhya Pradesh 462039',8889851888,'500',3.5),(2,'Kafe Kulture','A-66A, Jai Bhawani Housing Society, Bawadiyan Kalan, Gulmohar Colony,Bhopal',919893769492,'600',3.5),(3,'Subway','Shop no. 2, Ground floor Aura mall, Gulmohar, Bhopal, Madhya Pradesh 462016',7556062222,'800',3.0),(4,'Rolls Mania','Shop 4, Green City Mall, Gulmohar Colony, Bhopal',7554900222,'300',3.0),(5,'PVR CINEMAS','E-8, AURA Mall, Trilanga Colony, Gulmohar, Fortune Pride, Shahpura, Bhopal, Madhya Pradesh 462039',8800900009,'300',4.0),(6,'Tilaks Chocolady Bakery & Restaurant','Plot 2, Trilochand Nagar, Near Bank Of Baroda, Gulmohar Colony, Bhopal',9179177114,'300',4.5),(7,'7 Course','Shop No. G-10, Kk Platinum, Trilanga, Gulmohar, Bhopal, Madhya Pradesh 462016',9826677733,'500',3.5);
/*!40000 ALTER TABLE `gulmohar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gulmohar_bak`
--

DROP TABLE IF EXISTS `gulmohar_bak`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gulmohar_bak` (
  `S_no` int(2) NOT NULL DEFAULT '0',
  `Place` varchar(50) DEFAULT NULL,
  `Address` varchar(200) DEFAULT NULL,
  `phone_no` bigint(10) DEFAULT NULL,
  `Cost_for_two` varchar(4) DEFAULT 'null',
  `Rating` decimal(2,1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gulmohar_bak`
--

LOCK TABLES `gulmohar_bak` WRITE;
/*!40000 ALTER TABLE `gulmohar_bak` DISABLE KEYS */;
INSERT INTO `gulmohar_bak` VALUES (1,'Bombay Street Cafe','G9 Tower, 1st Floor, Opp., Aura Mall , Gulmohar., Bhopal, Madhya Pradesh 462039',8889851888,'500',3.5),(2,'Kafe Kulture','A-66A, Jai Bhawani Housing Society, Bawadiyan Kalan, Gulmohar Colony,Bhopal',919893769492,'600',3.5),(3,'Subway','Shop no. 2, Ground floor Aura mall, Gulmohar, Bhopal, Madhya Pradesh 462016',7556062222,'800',3.0),(4,'Rolls Mania','Shop 4, Green City Mall, Gulmohar Colony, Bhopal',7554900222,'300',3.0),(5,'PVR CINEMAS','E-8, AURA Mall, Trilanga Colony, Gulmohar, Fortune Pride, Shahpura, Bhopal, Madhya Pradesh 462039',8800900009,'300',4.0),(6,'Tilaks Chocolady Bakery & Restaurant','Plot 2, Trilochand Nagar, Near Bank Of Baroda, Gulmohar Colony, Bhopal',9179177114,'300',4.5),(7,'7 Course','Shop No. G-10, Kk Platinum, Trilanga, Gulmohar, Bhopal, Madhya Pradesh 462016',9826677733,'500',3.5);
/*!40000 ALTER TABLE `gulmohar_bak` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mp_nagar`
--

DROP TABLE IF EXISTS `mp_nagar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mp_nagar` (
  `S_no` int(2) NOT NULL AUTO_INCREMENT,
  `Place` varchar(50) DEFAULT NULL,
  `Address` varchar(200) DEFAULT NULL,
  `phone_no` bigint(10) DEFAULT NULL,
  `Cost_for_two` varchar(4) DEFAULT 'null',
  `Rating` decimal(2,1) DEFAULT NULL,
  PRIMARY KEY (`S_no`),
  UNIQUE KEY `phone_no` (`phone_no`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mp_nagar`
--

LOCK TABLES `mp_nagar` WRITE;
/*!40000 ALTER TABLE `mp_nagar` DISABLE KEYS */;
INSERT INTO `mp_nagar` VALUES (1,'Manohar Dairy And Restaurant','132, Zone 1, Maharana Pratap Nagar, Bhopal',7554040407,'400',3.0),(2,'Greek Food and Beyond','R-8, 3rd Floor, DB City Mall, M.P. Nagar, Arera Hills, Bhopal, Madhya Pradesh 462016',7556644108,'500',4.0),(3,'Bake N Shake','Near Jyoti Cineplex, Zone 1, Maharana Pratap Nagar, Bhopal',7554292222,'400',3.0),(4,'Bay Leaf - Courtyard Marriott','Courtyard By Marriot, 4th Floor, DB City Mall, Maharana Pratap Nagar, Bhopal',7553096236,'400',3.5),(5,'Hong Kong Chinese Restaurant','131/4, Near Pragati Petrol Pump, Zone-II, MP Nagar, Bhopal, Madhya Pradesh 462021',7554271900,'400',4.0),(6,'Jyoti Cineplex','MP Nagar Zone-I, Bhopal,, Bhopal, Madhya Pradesh 462011',7552768680,'400',4.0),(7,'Fun Cinemas','Level 4, D.B. City, Arera Hills, M.P. Nagar, Bhopal, Madhya Pradesh 462011',NULL,'null',4.0);
/*!40000 ALTER TABLE `mp_nagar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mp_nagar_bak`
--

DROP TABLE IF EXISTS `mp_nagar_bak`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mp_nagar_bak` (
  `S_no` int(2) NOT NULL DEFAULT '0',
  `Place` varchar(50) DEFAULT NULL,
  `Address` varchar(200) DEFAULT NULL,
  `phone_no` bigint(10) DEFAULT NULL,
  `Cost_for_two` varchar(4) DEFAULT 'null',
  `Rating` decimal(2,1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mp_nagar_bak`
--

LOCK TABLES `mp_nagar_bak` WRITE;
/*!40000 ALTER TABLE `mp_nagar_bak` DISABLE KEYS */;
INSERT INTO `mp_nagar_bak` VALUES (1,'Manohar Dairy And Restaurant','132, Zone 1, Maharana Pratap Nagar, Bhopal',7554040407,'400',3.0),(2,'Greek Food and Beyond','R-8, 3rd Floor, DB City Mall, M.P. Nagar, Arera Hills, Bhopal, Madhya Pradesh 462016',7556644108,'500',4.0),(3,'Bake N Shake','Near Jyoti Cineplex, Zone 1, Maharana Pratap Nagar, Bhopal',7554292222,'400',3.0),(4,'Bay Leaf - Courtyard Marriott','Courtyard By Marriot, 4th Floor, DB City Mall, Maharana Pratap Nagar, Bhopal',7553096236,'400',3.5),(5,'Hong Kong Chinese Restaurant','131/4, Near Pragati Petrol Pump, Zone-II, MP Nagar, Bhopal, Madhya Pradesh 462021',7554271900,'400',4.0),(6,'Jyoti Cineplex','MP Nagar Zone-I, Bhopal,, Bhopal, Madhya Pradesh 462011',7552768680,'400',4.0),(7,'Fun Cinemas','Level 4, D.B. City, Arera Hills, M.P. Nagar, Bhopal, Madhya Pradesh 462011',NULL,'null',4.0);
/*!40000 ALTER TABLE `mp_nagar_bak` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `oldcity`
--

DROP TABLE IF EXISTS `oldcity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `oldcity` (
  `S_no` int(2) NOT NULL AUTO_INCREMENT,
  `Place` varchar(50) DEFAULT NULL,
  `Address` varchar(200) DEFAULT NULL,
  `phone_no` bigint(10) DEFAULT NULL,
  `Cost_for_two` varchar(4) DEFAULT 'null',
  `Rating` decimal(2,1) DEFAULT NULL,
  PRIMARY KEY (`S_no`),
  UNIQUE KEY `phone_no` (`phone_no`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `oldcity`
--

LOCK TABLES `oldcity` WRITE;
/*!40000 ALTER TABLE `oldcity` DISABLE KEYS */;
INSERT INTO `oldcity` VALUES (1,'Zam Zam Fast Food','Besides Corporation Bank, Bharat Talkies Road, Bhopal, Madhya Pradesh 462001, India',9009019196,'500',4.5),(2,'Khan Sahab Restaurant & Fast Food','Model Ground, Hamidia Road, Bhopal, Madhya Pradesh, India',9229332500,'500',4.5),(3,'Jameel Hotel','Shop No 24, Gali No 1, Near Moti Masjid, Ibrahimpura, Bhopal, Madhya Pradesh, 462001, India',9893615785,'500',4.0),(4,'Shobhit Food Storm','Guliya Dai Street, Lalwani Press, Itwara Road, Bhopal M.P, 462001, Bhopal, Madhya Pradesh 462001',8817770201,'500',3.5),(5,'Sangam Cineplex','Hamidia Road, Near Railway Overbridge, Main Railway Station, Dangi Colony, Ghora Nakkas, Peer Gate Area, Bhopal, Madhya Pradesh 462001, India',NULL,'null',2.5),(6,'Alapana Talkies','Hamidia Rd, Railway Colony, Bhopal, Madhya Pradesh 460160',NULL,'null',2.5),(7,'Bharat Talkies','37, Chhawni Road, Patwa Market, Momin Pura, Peer Gate Area, Bhopal, Madhya Pradesh 462001',7552535225,'null',3.5);
/*!40000 ALTER TABLE `oldcity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `oldcity_bak`
--

DROP TABLE IF EXISTS `oldcity_bak`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `oldcity_bak` (
  `S_no` int(2) NOT NULL DEFAULT '0',
  `Place` varchar(50) DEFAULT NULL,
  `Address` varchar(200) DEFAULT NULL,
  `phone_no` bigint(10) DEFAULT NULL,
  `Cost_for_two` varchar(4) DEFAULT 'null',
  `Rating` decimal(2,1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `oldcity_bak`
--

LOCK TABLES `oldcity_bak` WRITE;
/*!40000 ALTER TABLE `oldcity_bak` DISABLE KEYS */;
INSERT INTO `oldcity_bak` VALUES (1,'Zam Zam Fast Food','Besides Corporation Bank, Bharat Talkies Road, Bhopal, Madhya Pradesh 462001, India',9009019196,'500',4.5),(2,'Khan Sahab Restaurant & Fast Food','Model Ground, Hamidia Road, Bhopal, Madhya Pradesh, India',9229332500,'500',4.5),(3,'Jameel Hotel','Shop No 24, Gali No 1, Near Moti Masjid, Ibrahimpura, Bhopal, Madhya Pradesh, 462001, India',9893615785,'500',4.0),(4,'Shobhit Food Storm','Guliya Dai Street, Lalwani Press, Itwara Road, Bhopal M.P, 462001, Bhopal, Madhya Pradesh 462001',8817770201,'500',3.5),(5,'Sangam Cineplex','Hamidia Road, Near Railway Overbridge, Main Railway Station, Dangi Colony, Ghora Nakkas, Peer Gate Area, Bhopal, Madhya Pradesh 462001, India',NULL,'null',2.5),(6,'Alapana Talkies','Hamidia Rd, Railway Colony, Bhopal, Madhya Pradesh 460160',NULL,'null',2.5),(7,'Bharat Talkies','37, Chhawni Road, Patwa Market, Momin Pura, Peer Gate Area, Bhopal, Madhya Pradesh 462001',7552535225,'null',3.5);
/*!40000 ALTER TABLE `oldcity_bak` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-09-01 22:46:52
