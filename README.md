# GroupeSixGLPOO
notre groupe n'a pas reussit a deposerle fichier de la base de donnée sur github.
tout d'abord il faut importer les package de mysql dans la librairie (mysql-connector-java-8.0.11.jar)



ci-après le code pour la base mysql pour crée la base avec quelque utilisateur


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

-- ----------------------------
-- Table structure for chatstore
-- ----------------------------
DROP TABLE IF EXISTS `chatstore`;
CREATE TABLE `chatstore` (
  `chatid` int NOT NULL AUTO_INCREMENT,
  `senderid` int NOT NULL,
  `receiverid` int NOT NULL,
  `content` varchar(300) DEFAULT NULL,
  `sendtime` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`chatid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of chatstore
-- ----------------------------

-- ----------------------------
-- Table structure for contacts
-- ----------------------------
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
