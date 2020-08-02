/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50511
Source Host           : localhost:3306
Source Database       : photo

Target Server Type    : MYSQL
Target Server Version : 50511
File Encoding         : 65001

Date: 2012-01-10 13:06:05
*/
use photo;
SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `admin`
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO admin VALUES ('1', 'admin', 'admin');

-- ----------------------------
-- Table structure for `leibie`
-- ----------------------------
DROP TABLE IF EXISTS `leibie`;
CREATE TABLE `leibie` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `shuoming` varchar(45) NOT NULL,
  `contenttime` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of leibie
-- ----------------------------
INSERT INTO leibie VALUES ('11', '同学', '童', '2012-01-09 15:38:21 ');
INSERT INTO leibie VALUES ('12', '搞笑', '搞笑', '2012-01-08 19:51:52 ');
INSERT INTO leibie VALUES ('13', '动物', '动物', '2012-01-08 14:45:51 ');
INSERT INTO leibie VALUES ('14', '呵呵', '漂亮吗？', '2012-01-08 14:46:44 ');
INSERT INTO leibie VALUES ('15', '美女', '都是美女哦', '2012-01-08 14:47:12 ');
INSERT INTO leibie VALUES ('18', '额外加分', '福建警方', '2012-01-08 19:39:25 ');
INSERT INTO leibie VALUES ('19', '是吗', 'Einstein', '2012-01-09 15:31:12 ');
INSERT INTO leibie VALUES ('20', '阿萨德好烦', '家阿凡', '2012-01-09 15:37:42 ');

-- ----------------------------
-- Table structure for `photo`
-- ----------------------------
DROP TABLE IF EXISTS `photo`;
CREATE TABLE `photo` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(225) DEFAULT NULL,
  `path` varchar(45) NOT NULL,
  `dianji` int(10) unsigned NOT NULL,
  `contentTime` varchar(45) NOT NULL,
  `shuoming` varchar(45) DEFAULT NULL,
  `lid` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=83 DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of photo
-- ----------------------------
INSERT INTO photo VALUES ('75', '同学是吗', '1326093716127_min.jpg', '6', '2012-01-09 15:21:56 ', '', '13');
INSERT INTO photo VALUES ('76', '嗯', '1326093725397_min.jpg', '7', '2012-01-09 15:22:05 ', '', '11');
INSERT INTO photo VALUES ('77', '娜娜', '1326093732951_min.jpg', '1', '2012-01-09 15:22:13 ', '妨碍', '11');
INSERT INTO photo VALUES ('78', '方发俄方', '1326093743602_min.jpg', '0', '2012-01-09 15:22:23 ', '发俄方i哦', '12');
INSERT INTO photo VALUES ('79', '飞啊飞', '1326093749661_min.jpg', '0', '2012-01-09 15:22:29 ', '妨碍', '11');
INSERT INTO photo VALUES ('80', '分啊', '1326093761827_min.jpg', '0', '2012-01-09 15:22:41 ', '分啊', '13');
INSERT INTO photo VALUES ('81', '额', '1326094299769_min.jpg', '3', '2012-01-09 15:31:40 ', null, '18');
INSERT INTO photo VALUES ('82', '的hi阿飞', '1326094652535_min.jpg', '0', '2012-01-09 15:37:32 ', null, '11');

-- ----------------------------
-- Table structure for `pinglun`
-- ----------------------------
DROP TABLE IF EXISTS `pinglun`;
CREATE TABLE `pinglun` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `contentText` varchar(45) NOT NULL,
  `contentTime` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `pid` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of pinglun
-- ----------------------------
INSERT INTO pinglun VALUES ('1', '阿海珐i', '2012-01-09 14:35:11 ', '额我的', '68');
INSERT INTO pinglun VALUES ('2', '恶化', '2012-01-09 14:35:22 ', '淡定', '68');
INSERT INTO pinglun VALUES ('3', '额外加分', '2012-01-09 14:35:40 ', '我的', '71');
INSERT INTO pinglun VALUES ('4', '方季惟', '2012-01-09 14:56:29 ', '啊hi', '69');
INSERT INTO pinglun VALUES ('9', '我是干什么的啊', '2012-01-09 15:33:14 ', '恩啊，嘿嘿', '81');
INSERT INTO pinglun VALUES ('10', '恩啊，淡定吗？', '2012-01-09 15:33:33 ', '恩，偶也，嘿嘿', '81');
INSERT INTO pinglun VALUES ('11', '法界', '2012-01-09 15:33:47 ', '阿弥陀佛', '81');
INSERT INTO pinglun VALUES ('12', 'fa', '2012-01-10 12:29:55 ', 'fa', '75');
