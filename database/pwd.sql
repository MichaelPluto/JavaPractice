-- 演示加密函数和系统函数

-- user() 查询用户
-- 可以查看登录到mysql的有哪些用户，以及登录的ip
SELECT USER() FROM DUAL
-- database() 查询当前使用数据库名称
SELECT DATABASE() FROM DUAL
-- MD5(str)  加密函数
-- 为字符串算出一个 MD5 32的字符串，常用为用户密码的加密
-- root 密码是 a9090980 -> 加密MD5 -> 在数据库中存放的是加密后的密码
SELECT MD5('a9090980') FROM DUAL
SELECT LENGTH(MD5('a9090980')) FROM DUAL
-- 演示用户表，存放密码时候
CREATE TABLE `users`(
	id INT,
	`name` VARCHAR(32) NOT NULL DEFAULT '',
	pwd CHAR(32) NOT NULL DEFAULT ''
)
INSERT INTO `users` 
	VALUES(1,'杨质飞',MD5('a9090980'))
SELECT * FROM `users`
SELECT * FROM `users`
	WHERE `name` = '杨质飞' AND pwd = MD5('a9090980')
-- PASSWORD(str) 加密函数 mysql数据库密码就是默认 password加密
SELECT PASSWORD('a9090980') FROM DUAL
-- select * from mysql.user \G 从原文密码str计算并返回密码字符串
-- 通常用于对于mysql数据库的用户密码加密
-- mysql.user 表示数据库表
SELECT * FROM mysql.user