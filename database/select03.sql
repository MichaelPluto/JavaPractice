-- 使用where子句 进行过滤查询
SELECT * FROM student
-- 查询姓名为赵云的学生成绩
SELECT `name` ,chinese,english,math FROM student
	WHERE `name` = '赵云'
-- 查询英语成绩大于90分的同学
SELECT `name` FROM student
	WHERE english > 90
-- 查询总分大于200分的所有同学
SELECT * FROM student
	WHERE (english + chinese + math) > 200
-- 查询math大于60 并且(and) id 大于90的学生成绩
SELECT * FROM student
	WHERE math > 60 AND id > 90
-- 查询英语成绩大于语文成绩的同学
SELECT * FROM student
	WHERE english > chinese
-- 查询总分大于200分 并且 数学成绩小于语文成绩的姓韩的同学
-- 韩%表示 名字以韩开头的就会被查询
SELECT * FROM student
	WHERE (english + chinese + math) > 200
	AND math > chinese
	AND `name` LIKE '韩%'
-- 查询英语分数在 80-90之间的同学
SELECT * FROM student
	WHERE english BETWEEN 80 AND 90
-- 查询数学分数在 89 90 91的同学
SELECT * FROM student
	WHERE math IN(89,90,91)
-- 查询所有姓李的学生成绩
select * from student
	where `name` like '李%'
-- 查询数学分 > 80 语文 > 80 的同学
select * from student
	where math > 80 and chinese > 80
-- 查询语文分数在 70-80 之间的同学
select * from student
	where chinese between 70 and 80 -- between and 是闭区间
-- 查询总分为 189 190 191 的同学
select * from student
	where (english + chinese + math)in (189,190,191)
-- 查询所有姓李或者姓宋的学生成绩
SELECT * FROM student
	where `name` like '李%' or `name` like '宋%'
-- 查询数学比语文多30分的同学	
SELECT * FROM student
	where chinese = (math - 1)