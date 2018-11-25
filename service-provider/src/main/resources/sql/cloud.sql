/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50536
Source Host           : localhost:3306
Source Database       : cloud

Target Server Type    : MYSQL
Target Server Version : 50536
File Encoding         : 65001

Date: 2018-11-25 12:20:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `dept_no` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '部门编号',
  `dept_name` varchar(60) DEFAULT NULL COMMENT '部门名称',
  `dept_source` varchar(60) DEFAULT NULL COMMENT '部门来源',
  PRIMARY KEY (`dept_no`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='部门表';

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES ('1', '开发部', 'cloud');
INSERT INTO `dept` VALUES ('2', '人事部', 'cloud');
INSERT INTO `dept` VALUES ('3', '财政部', 'cloud');
INSERT INTO `dept` VALUES ('4', '运维部', 'cloud');
INSERT INTO `dept` VALUES ('5', '市场部', 'cloud');
