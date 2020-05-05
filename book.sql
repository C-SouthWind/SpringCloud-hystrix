/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50717
 Source Host           : localhost:3306
 Source Schema         : redis

 Target Server Type    : MySQL
 Target Server Version : 50717
 File Encoding         : 65001

 Date: 27/04/2020 20:41:31
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `book_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '书名称',
  `book_price` double(10, 2) NULL DEFAULT NULL COMMENT '书价格',
  `book_detail` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '书详情',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES (1, '三国演义', 20.00, 'xxxx');
INSERT INTO `book` VALUES (2, '红楼梦', 20.00, 'yyy');
INSERT INTO `book` VALUES (3, '儿童文学', 10.00, 'zzz');
INSERT INTO `book` VALUES (4, '西游记', 20.00, 'qqq');
INSERT INTO `book` VALUES (5, 'iPhone', 2000.00, 'qqeqw');
INSERT INTO `book` VALUES (6, 'iPhone1', 3000.00, 'wweq');
INSERT INTO `book` VALUES (7, 'iPhone11', 4000.00, '1qweqw');

SET FOREIGN_KEY_CHECKS = 1;
