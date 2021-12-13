/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : blog

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2021-12-13 23:10:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `ums_permission`
-- ----------------------------
DROP TABLE IF EXISTS `ums_permission`;
CREATE TABLE `ums_permission` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `pid` bigint(20) DEFAULT NULL COMMENT '父级权限id',
  `name` varchar(100) DEFAULT NULL COMMENT '名称',
  `value` varchar(200) DEFAULT NULL COMMENT '权限值',
  `icon` varchar(500) DEFAULT NULL COMMENT '图标',
  `type` int(1) DEFAULT NULL COMMENT '权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）',
  `uri` varchar(200) DEFAULT NULL COMMENT '前端资源路径',
  `status` int(1) DEFAULT NULL COMMENT '启用状态；0->禁用；1->启用',
  `sort` int(11) DEFAULT NULL COMMENT '排序',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `create_by` varchar(128) DEFAULT NULL COMMENT '创建人',
  `update_by` varchar(128) DEFAULT NULL COMMENT '修改人',
  `is_deleted` varchar(24) DEFAULT NULL COMMENT '是否删除(0->有效，1->无效)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='后台用户权限表';

-- ----------------------------
-- Records of ums_permission
-- ----------------------------

-- ----------------------------
-- Table structure for `ums_role`
-- ----------------------------
DROP TABLE IF EXISTS `ums_role`;
CREATE TABLE `ums_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL COMMENT '名称',
  `description` varchar(500) DEFAULT NULL COMMENT '描述',
  `status` int(1) DEFAULT '1' COMMENT '启用状态：0->禁用；1->启用',
  `sort` int(11) DEFAULT '0',
  `count` int(11) DEFAULT NULL COMMENT '后台用户数量',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '最后一次修改时间',
  `create_by` varchar(128) DEFAULT NULL COMMENT '创建人',
  `update_by` varchar(128) DEFAULT NULL COMMENT '修改人',
  `is_deleted` varchar(24) DEFAULT NULL COMMENT '是否删除(0->有效，1->无效)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='后台用户角色表';

-- ----------------------------
-- Records of ums_role
-- ----------------------------

-- ----------------------------
-- Table structure for `ums_role_permission_relation`
-- ----------------------------
DROP TABLE IF EXISTS `ums_role_permission_relation`;
CREATE TABLE `ums_role_permission_relation` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_id` bigint(20) DEFAULT NULL,
  `permission_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='后台用户角色和权限关系表';

-- ----------------------------
-- Records of ums_role_permission_relation
-- ----------------------------

-- ----------------------------
-- Table structure for `ums_user`
-- ----------------------------
DROP TABLE IF EXISTS `ums_user`;
CREATE TABLE `ums_user` (
  `user_id` varchar(128) NOT NULL COMMENT '用户ID',
  `user_name` varchar(128) DEFAULT NULL COMMENT '用户姓名',
  `user_pwd` varchar(128) DEFAULT NULL COMMENT '用户密码',
  `user_phone` varchar(20) DEFAULT NULL COMMENT '用户手机号码',
  `user_email` varchar(30) DEFAULT NULL COMMENT '用户邮箱',
  `user_address` varchar(24) DEFAULT NULL COMMENT '用户地址',
  `user_status` varchar(24) DEFAULT NULL COMMENT '用户状态',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '最后一次修改时间',
  `create_by` varchar(128) DEFAULT NULL COMMENT '创建人',
  `update_by` varchar(128) DEFAULT NULL COMMENT '最后一次修改人',
  `is_deleted` varchar(24) DEFAULT NULL COMMENT '是否删除(0->有效，1->无效)',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户表';

-- ----------------------------
-- Records of ums_user
-- ----------------------------

-- ----------------------------
-- Table structure for `ums_user_login_log`
-- ----------------------------
DROP TABLE IF EXISTS `ums_user_login_log`;
CREATE TABLE `ums_user_login_log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'log编号',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户编号',
  `login_ip` varchar(64) DEFAULT NULL COMMENT '用户登录的Ip',
  `create_time` datetime DEFAULT NULL COMMENT '该条log的创建时间',
  `login_address` varchar(100) DEFAULT NULL COMMENT '用户登录地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='后台用户登录日志表';

-- ----------------------------
-- Records of ums_user_login_log
-- ----------------------------
