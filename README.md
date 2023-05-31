# CustomerInfoManager
厂全计科大二JAVAEE期末作业客户信息管理系统模版(基于SpringBoot+Mybatis+Vue+axios+element)
基于MYSQL8的本地数据库,用到两个表
一个是在javaee下叫customer的表,以下是SQL



SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer`  (

  `id` int NOT NULL AUTO_INCREMENT,
	
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
	
  `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
	
  `phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
	
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
	
  `date` date NOT NULL,
	
  `consumption` int NOT NULL,
	
  `level` int NOT NULL,
	
  PRIMARY KEY (`id`) USING BTREE
	
) ENGINE = InnoDB AUTO_INCREMENT = 18 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;


-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES (1, '超级大酥饼', '广东茂名', '17827017384', '2677330142@qq.com', '2023-05-20', 200, 1);
INSERT INTO `customer` VALUES (2, '子欣', '广东茂名', '17827017384', '2677330142@qq.com', '2023-05-20', 500, 3);
INSERT INTO `customer` VALUES (15, '张三', '伊拉克', '123456789', '123456@sina.cim', '2023-05-31', 0, 0);
INSERT INTO `customer` VALUES (16, 'T1', '广东茂名', '+8617827017384', 'cookie2677330142@gmail.com', '2023-05-31', 0, 0);
INSERT INTO `customer` VALUES (17, '张三', '广东茂名', '+8617827017384', 'cookie2677330142@gmail.com', '2023-05-31', 0, 0);

SET FOREIGN_KEY_CHECKS = 1;

另一个也是javaee下的systemt表,以下是SQL



SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for systemt
-- ----------------------------
DROP TABLE IF EXISTS `systemt`;
CREATE TABLE `systemt`  (

  `id` int NOT NULL AUTO_INCREMENT,
	
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
	
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
	
  PRIMARY KEY (`id`) USING BTREE
	
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;


-- ----------------------------
-- Records of systemt
-- ----------------------------
INSERT INTO `systemt` VALUES (1, 'Cookie', '123456');

SET FOREIGN_KEY_CHECKS = 1;



-------------------------------------------------------
跟多细节等我闲了再写
