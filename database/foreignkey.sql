-- 外键演示,引擎必须是 innodb 才支持外键

-- 先创建主表 my_class
CREATE TABLE my_class(
	id INT PRIMARY KEY,
	`name` VARCHAR(32) NOT NULL DEFAULT ''
)
-- 创建从表 my_stu
CREATE TABLE my_stu (
	id INT PRIMARY KEY,
	`name` VARCHAR(32) NOT NULL DEFAULT '',
	class_id INT,
	-- 下面指定外键关系
	FOREIGN KEY(class_id) REFERENCES my_class(id)
)

-- 测试数据
INSERT INTO my_class
	VALUES(100,'java'),(200,'web')
INSERT INTO my_class
	VALUES(300,'php')
SELECT * FROM my_class
INSERT INTO my_stu
	VALUES(1,'tom',100)
INSERT INTO my_stu
	VALUES(2,'jack',200)
INSERT INTO my_stu
	VALUES(4,'yzf',400) -- 这里会失败，因为300班级不存在
INSERT INTO my_stu
	VALUES(4,'yzf',NULL) -- 成功，前提是外键允许为null
SELECT * FROM my_stu

-- 一旦建立主外键的关系，数据就不能随意删除了
DELETE FROM my_class
	WHERE id = 100

