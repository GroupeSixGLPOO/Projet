# GroupeSixGLPOO
Notre groupe n'a pas réussit a deposer le fichier de la base de donnée sur github.
Tout d'abord il faut importer le package de mysql dans la librairie (mysql-connector-java-8.0.11.jar)



Ci-après le code de mysql pour crée la base sur le logiciel Navicat :





/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 80020
Source Host           : localhost:3306
Source Database       : chatdb

Target Server Type    : MYSQL
Target Server Version : 80020
File Encoding         : 65001

Date: 2020-06-21 21:41:47
*/

SET FOREIGN_KEY_CHECKS=0;

DROP TABLE IF EXISTS `chatstore`;
CREATE TABLE `chatstore` (
  `chatid` int NOT NULL AUTO_INCREMENT,
  `senderid` int NOT NULL,
  `receiverid` int NOT NULL,
  `content` varchar(300) DEFAULT NULL,
  `sendtime` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`chatid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


DROP TABLE IF EXISTS `contacts`;
CREATE TABLE `contacts` (
  `uid` int NOT NULL,
  `uname` varchar(100) NOT NULL,
  `email` varchar(300) NOT NULL,
  `age` int NOT NULL,
  `password` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `online` tinyint DEFAULT NULL,
  `peerip` varchar(30) DEFAULT NULL,
  `peerport` int DEFAULT NULL,
   PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


INSERT INTO `contacts` VALUES ('10000', 'hy', '963@yy.com', '20', '4321', '0', 'DESKTOP-52I1905/10.188.193.173', '50177');
INSERT INTO `contacts` VALUES ('10001', 'YY', '123@wjq.com', '21', '1234', '0', 'DESKTOP-52I1905/10.188.193.173', '49832');
INSERT INTO `contacts` VALUES ('10002', 'ZZ', '456@kk.com', '25', '1234', '0', null, null);
INSERT INTO `contacts` VALUES ('10003', 'houyu', 'houyu@gmail.com', '23', '123654', '0', null, '49757');


