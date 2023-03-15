-- 默认下 只能看见默认数据库

-- 查找
SELECT * FROM news
-- 添加
INSERT INTO news
	VALUES(200,'上海新闻');
-- 修改
UPDATE news 
	SET content = '天津新闻'
	WHERE id = 200;
SELECT * FROM news

