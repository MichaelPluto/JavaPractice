CREATE TABLE menu (
	menuId INT PRIMARY KEY AUTO_INCREMENT, #自增主键，作为菜谱编号(唯一)
	menuName VARCHAR(50) NOT NULL DEFAULT '',#菜品名称
	menuClass VARCHAR(50) NOT NULL DEFAULT '', #菜品种类
	menuPrice DOUBLE NOT NULL DEFAULT 0#价格
)CHARSET=utf8; 
DROP TABLE menu
INSERT INTO menu VALUES(NULL, '八宝饭', '主食', 10);
INSERT INTO menu VALUES(NULL, '叉烧包', '主食', 20);
INSERT INTO menu VALUES(NULL, '宫保鸡丁', '热菜', 30);
INSERT INTO menu VALUES(NULL, '山药拨鱼', '凉菜', 14);
INSERT INTO menu VALUES(NULL, '银丝卷', '甜食', 9);
INSERT INTO menu VALUES(NULL, '水煮鱼', '热菜', 26);
INSERT INTO menu VALUES(NULL, '甲鱼汤', '汤类', 100);
INSERT INTO menu VALUES(NULL, '鸡蛋汤', '汤类', 16);

SELECT * FROM menu 
SELECT menuId FROM menu WHERE menuId = 1