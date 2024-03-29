-- 创建满汉楼数据库
CREATE DATABASE mhl
-- 创建 employee表 
#用户表
CREATE TABLE employee (
	id INT PRIMARY KEY AUTO_INCREMENT, #自增
	empId VARCHAR(50) UNIQUE NOT NULL DEFAULT '',#员工号
	pwd CHAR(32) NOT NULL DEFAULT '',#密码md5
	`name` VARCHAR(50) NOT NULL DEFAULT '',#姓名
	job VARCHAR(50) NOT NULL DEFAULT '' #岗位
)
DROP TABLE employee
INSERT INTO employee VALUES(NULL, '6668612', MD5('123456'), '张三丰', '经理');
INSERT INTO employee VALUES(NULL, '6668622', MD5('123456'),'小龙女', '服务员');
INSERT INTO employee VALUES(NULL, '6668633', MD5('123456'), '张无忌', '收银员');
INSERT INTO employee VALUES(NULL, '666', MD5('123456'), '老杨', '经理');

SELECT * FROM employee;


-- 创建diningTable 表
#餐桌表
CREATE TABLE diningTable (
	id INT PRIMARY KEY AUTO_INCREMENT, #自增, 表示餐桌编号
	state VARCHAR(20) NOT NULL DEFAULT '',#餐桌的状态
	orderName VARCHAR(50) NOT NULL DEFAULT '',#预订人的名字
	orderTel VARCHAR(20) NOT NULL DEFAULT ''
)CHARSET=utf8; 
DROP TABLE diningTable
INSERT INTO diningTable VALUES(NULL, '空','','');
INSERT INTO diningTable VALUES(NULL, '空','','');
INSERT INTO diningTable VALUES(NULL, '空','','');

SELECT * FROM diningTable;
DELETE FROM diningTable WHERE id = 1
SELECT id,state FROM diningTable
SELECT * FROM diningtable WHERE id = 1
UPDATE diningTable SET state = '空', orderName = '',orderTel = ''  WHERE id = 1
