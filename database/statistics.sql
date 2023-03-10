-- 演示mysql统计函数的使用
-- 演示count函数使用
-- 统计一个班共有多少学生
SELECT COUNT(*) FROM student
-- 统计数学成绩大于90的学生个数
SELECT COUNT(*) FROM student
	WHERE math > 90
-- 统计总分大于250的人数的个数
SELECT COUNT(*) FROM student
	WHERE (math + chinese + english)> 250
-- count(*) 和 count(列)的区别
-- count(*) 统计满足条件的所有记录数，不排除null
-- count(列) 统计满足条件的某一列的个数，会排除null
CREATE TABLE t15(
	`name` VARCHAR(20)
)
INSERT INTO t15 VALUES('tom')
INSERT INTO t15 VALUES('jack')
INSERT INTO t15 VALUES('mary')
INSERT INTO t15 VALUES(NULL)
SELECT * FROM t15
SELECT COUNT(*) FROM t15 -- 返回4
SELECT COUNT(`name`) FROM t15 -- 返回3
-- 演示sum函数的使用 (仅对数值起作用) (多列求和 ',' 不能少)
-- 统计一个班级数学总成绩
SELECT SUM(math) FROM student
-- 统计一个班级 语文 英语 数学 各科总成绩
SELECT SUM(chinese),SUM(english),SUM(math) FROM student
-- 统计一个班级 语文 英语 数学的成绩总和
SELECT SUM(chinese + math + english) FROM student
-- 统计一个班级语文成绩平均分
SELECT SUM(chinese) / COUNT(*) FROM student
-- 演示avg的使用
-- 求一个班级数学平均分
SELECT AVG(math) FROM student
-- 求一个班级总分平均分
SELECT AVG(chinese + math + english) FROM student
-- 演示 max/min使用 
-- 求班级最高分和最低分(数值范围在统计中特别有用)
SELECT MAX(chinese + math + english),
	MIN(chinese + math + english) 
	FROM student
-- 求出班级数学最高分和最低分
SELECT MAX(math),MIN(math) FROM student