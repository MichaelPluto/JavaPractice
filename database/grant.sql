-- 给用户权限的管理
-- 创建用户 zhifei 密码 123 从本地登录
CREATE USER 'zhifei'@'localhost' IDENTIFIED BY '123'\
-- 使用root 创建testdb 表 news
CREATE DATABASE testdb;
CREATE TABLE news(
	id INT,
	content VARCHAR(32)
);
-- 添加一条测试数据
INSERT INTO news VALUES(100,'北京新闻');
SELECT * FROM news
GRANT SELECT,INSERT
	ON testdb.news
	TO 'zhifei'@'localhost';
GRANT UPDATE , DROP
	ON testdb.news
	TO 'zhifei'@'localhost';
SET PASSWORD FOR 'zhifei'@'localhost' = PASSWORD('abc');
DROP USER 'zhifei'@'localhost';
-- 回收权限
REVOKE SELECT,INSERT,UPDATE,DELETE ON testdb.news FROM DROP USER 'zhifei'@'localhost';
REVOKE ALL ON testdb.news FROM DROP USER 'zhifei'@'localhost';