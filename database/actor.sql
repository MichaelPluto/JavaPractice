-- 创建测试表 演员表
CREATE TABLE actor (
	id INT PRIMARY KEY AUTO_INCREMENT,
	NAME VARCHAR(32) NOT NULL DEFAULT '',
	sex CHAR(1) NOT NULL DEFAULT '女',
	borndate DATETIME,
	phone VARCHAR(12)
);

SELECT * FROM actor;