日期时间相关函数
-- CURRENT_DATE ( ) 当前日期
SELECT CURRENT_DATE() FROM DUAL
-- CURRENT_TIME ( )当前时间
SELECT CURRENT_TIME() FROM DUAL
-- CURRENT_TIMESTAMP ( ) 当前时间戳
SELECT CURRENT_TIMESTAMP() FROM DUAL

-- 创建测试表 信息表
CREATE TABLE mes(
	id INT,
	content VARCHAR(30),
	send_time DATETIME
)
INSERT INTO mes 
	VALUES(1,'北京新闻',CURRENT_TIMESTAMP())
INSERT INTO mes 
	VALUES(2,'上海新闻',NOW())
INSERT INTO mes 
	VALUES(3,'广州新闻',NOW())
-- 显示所有新闻信息，发布日期只显示 日期，不用显示时间
SELECT id,content,DATE(send_time) 
	FROM mes
-- 请查询在二十五分钟内发布的帖子
SELECT * FROM mes
	WHERE DATE_ADD(send_time,INTERVAL 25 MINUTE)>= NOW()
SELECT * FROM mes
	WHERE DATE_SUB(NOW(),INTERVAL 30 MINUTE) <= send_time
-- 请在mysql的sql语句中求出 2011-11-11 和 1990-1-1 相差多少天
SELECT DATEDIFF('2011-11-11','1990-1-1') FROM DUAL
-- 请用mysql的sql语句求出你活了多少天
SELECT DATEDIFF(NOW(),'2000-11-1')FROM DUAL
-- 如果你能活八十岁，求出你还能活多少天
SELECT DATEDIFF(DATE_ADD('2000-11-1',INTERVAL 80 YEAR),NOW()) FROM DUAL
SELECT * FROM mes

-- YEAR|MONTH|DAY| DATE(datetime)
SELECT YEAR(NOW()) FROM DUAL
SELECT MONTH(NOW()) FROM DUAL
SELECT DAY(NOW()) FROM DUAL
SELECT MONTH('2022-09-02') FROM DUAL

-- unix_timestamp() 返回的是 1970-1-1 00:00:00 到现在的秒数
SELECT UNIX_TIMESTAMP() FROM DUAL
-- from_unixtime() 可以把一个unix_timestamp秒数，转换成指定格式的日期
-- %Y-%m_%d 格式是规定好的，表示年月日
-- 在开发中可以存放一个整数，然后通过from_unixtime转换为时间显示
SELECT FROM_UNIXTIME(1678440359,'%Y-%m-%d') FROM DUAL
SELECT FROM_UNIXTIME(1678440359,'%Y-%m-%d %H:%i:%s') FROM DUAL