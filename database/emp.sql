#创建一个员工表emp，选用适当的数据类型
CREATE TABLE emp(
	id TINYINT,
	`name` VARCHAR(32),
	`sex` CHAR(1),
	`birthday` DATE,
	`entry_data` DATETIME,
	`job` VARCHAR(32),
	`Salary` DOUBLE,
	`resume` TEXT)CHARSET utf8 COLLATE utf8_bin ENGINE INNODB;
#添加
INSERT INTO emp 
	VALUES(11,'杨质飞','男','2000-11-1','2023-11-1 10:20',
	'软件开发工程师','15000.0','是一个上进乐观努力的人');
	
SELECT * FROM emp
INSERT INTO employee 
	VALUES(12,'老韩','1980-12-3', '2002-10-1 19:02',
	'高级构架师','60000','是一个技术大牛')