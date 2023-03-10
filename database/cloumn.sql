ALTER TABLE emp 
	ADD image VARCHAR(32) NOT NULL DEFAULT ''
	AFTER RESUME
DESC employee -- 显示表结构，可以查看表的所有列
-- 修改job列，使其长度为60
ALTER TABLE emp
	MODIFY job VARCHAR(60) NOT NULL DEFAULT ''
-- 删除sex列
ALTER TABLE emp
	DROP sex
-- 表名改为employee
RENAME TABLE emp TO employee
-- 修改表的字符集为utf8
ALTER TABLE employee
	CHARSET utf8
-- 列名 name 修改为 user_name
ALTER TABLE employee CHANGE COLUMN `name` username VARCHAR(20) NOT NULL DEFAULT ''
DESC employee
INSERT INTO employee 
	VALUES(12,'老韩','1980-12-3','2002-10-1 19:02',
	'高级构架师','60000','是一个技术大牛','')
SELECT * FROM employee
INSERT INTO employee 
	VALUES(1,'胡小楠','1999-10-14','2023-10-1 6:46',
	'电焊工','6000','追求灵魂的螺丝工','')