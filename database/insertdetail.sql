#列可以插入空置，前提是该字段允许为空 
SELECT * FROM goods
INSERT INTO goods 
	VALUES(40,'vivo手机',NULL)
#可以以 values(),(),()形式添加多条记录
INSERT INTO goods
	VALUES(41,'华为手机',5000),(42,'三星手机',5650)
#默认值的使用，当不给某个字段值时，如果有默认值就会添加默认值
-- 否则会报错 
-- 如果某个列没有指定not null 那么当添加数据时，没有给定值，就会给默认值
-- 如果希望指定某个列的默认值，可以在创建表时指定
INSERT INTO goods2(id,good_name)
	VALUES(42,'锤子手机')
CREATE TABLE goods2(
	id INT,
	good_name VARCHAR(10),
	price DOUBLE NOT NULL DEFAULT 100
)
DESC goods2