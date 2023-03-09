-- select语句
CREATE TABLE student(
	id INT NOT NULL DEFAULT 1,
	`name` VARCHAR(20) NOT NULL DEFAULT '',
	chinese FLOAT NOT NULL DEFAULT 0.0,
	english FLOAT NOT NULL DEFAULT 0.0,
	math FLOAT NOT NULL DEFAULT 0.0
	)

INSERT INTO student(id,NAME,chinese,english,math) VALUES(1,'韩顺平',89,78,90);
INSERT INTO student(id,NAME,chinese,english,math) VALUES(2,'张飞',67,98,56);
INSERT INTO student(id,NAME,chinese,english,math) VALUES(3,'宋江',87,78,77);
INSERT INTO student(id,NAME,chinese,english,math) VALUES(4,'关羽',88,98,90);
INSERT INTO student(id,NAME,chinese,english,math) VALUES(5,'赵云',82,84,67);
INSERT INTO student(id,NAME,chinese,english,math) VALUES(6,'欧阳锋',55,85,45);
INSERT INTO student(id,NAME,chinese,english,math) VALUES(7,'黄蓉',75,65,30);
INSERT INTO student(id,NAME,chinese,english,math) VALUES(1,'韩信',99,47,85);
	
-- 查询表中所有学生的信息
SELECT * FROM student
-- 查询表中所有学生的姓名和对应的英语成绩
SELECT `name`,english FROM student
-- 过滤表中重复的数据 distinct
SELECT DISTINCT english FROM student
SELECT DISTINCT `name`,english FROM student