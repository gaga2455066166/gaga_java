/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80020
 Source Host           : localhost:3306
 Source Schema         : onlinestore

 Target Server Type    : MySQL
 Target Server Version : 80020
 File Encoding         : 65001

 Date: 21/11/2020 14:48:22
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for cart
-- ----------------------------
DROP TABLE IF EXISTS `cart`;
CREATE TABLE `cart`  (
  `suser` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `nid` int NULL DEFAULT NULL,
  `sname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sdescription` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `nprice` double(10, 2) NULL DEFAULT NULL,
  `simg` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `nquantity` int NULL DEFAULT NULL,
  `ntotal` double(10, 2) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of cart
-- ----------------------------
INSERT INTO `cart` VALUES ('adminuser', 10001, '鼠标', '超级好用去', 23.60, 'images/04-search_03.jpg', 6, 308.46);
INSERT INTO `cart` VALUES ('adminuser', 10002, '键盘', '好用', 52.60, 'images/04-search_03.jpg', 1, 52.30);
INSERT INTO `cart` VALUES ('adminuser', 10003, '手机', '可以玩游戏', 56.32, 'images/04-search_03.jpg', 9, 268.44);

-- ----------------------------
-- Table structure for commodity
-- ----------------------------
DROP TABLE IF EXISTS `commodity`;
CREATE TABLE `commodity`  (
  `nid` int NULL DEFAULT NULL,
  `sname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sdescription` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `nprice` double(10, 2) NULL DEFAULT NULL,
  `simg` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `smctag` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `dcdate` date NULL DEFAULT NULL,
  `nmaxid` int NULL DEFAULT NULL,
  `nminid` int NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of commodity
-- ----------------------------
INSERT INTO `commodity` VALUES (10001, '鼠标', '鼠标', 11.23, 'images/04-search_03.jpg', 'Y', '2020-11-03', 0, 1);
INSERT INTO `commodity` VALUES (10002, '键盘', '键盘', 452.30, 'images/04-search_03.jpg', 'Y', '2020-11-05', NULL, NULL);

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order`  (
  `sorder` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `suser` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `nid` int NULL DEFAULT NULL,
  `sname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sdescription` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `nprice` double(10, 2) NULL DEFAULT NULL,
  `simg` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `nquantity` int NULL DEFAULT NULL,
  `ntotal` double NULL DEFAULT NULL,
  `ddate` date NULL DEFAULT NULL,
  `saddress` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sdelivery` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of order
-- ----------------------------
INSERT INTO `order` VALUES ('date2020/11/20', 'adminuser', 10001, '鼠标', '可以握着', 45.60, 'images/04-search_03.jpg', 2, 80, '2020-11-11', '二区二B506', '未发货');
INSERT INTO `order` VALUES ('date2020/11/20', 'adminuser', 10002, '键盘', '******', 52.60, 'images/04-search_03.jpg', 1, 25.9, '2020-11-17', '二区二B506', '未发货');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `suser` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `spwd` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ssex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `dbirth` date NULL DEFAULT NULL,
  `semail` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sphone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `saddress` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `scode` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `nlevel` int NULL DEFAULT NULL,
  `dregdate` date NULL DEFAULT NULL,
  `slock` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `dlastdate` date NULL DEFAULT NULL,
  `nlogin` int NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('adminuser', 'pwd123456', 'dd', 'd', '2020-10-14', 'd', 'd', 'd', 'd', 1, NULL, NULL, NULL, NULL);
INSERT INTO `user` VALUES ('dwefssssss', 'ssdfsf', 'dfsdfs', '男', '2020-11-05', '2455066166@qq.com', 'sdfsfs', 'sdfsf', NULL, NULL, NULL, NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
