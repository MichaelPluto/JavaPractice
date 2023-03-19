-- 演示sql注入
-- 创建一张测试表
CREATE TABLE admin (
	`name` VARCHAR(3) NOT NULL UNIQUE,
	pwd VARCHAR(32) NOT NULL DEFAULT ''
) CHARACTER SET utf8;

-- 添加数据
INSERT INTO admin VALUES('tom','123');

-- 查找
SELECT * FROM admin
	WHERE `name` = 'tom' AND pwd = '123';
	
-- sql 注入
-- 输入用户名为 1' or
-- 输入密码为 or '1' = '1
SELECT * FROM admin
	WHERE `name` = '1' OR' AND pwd = 'OR '1' = '1';
SELECT * FROM admin