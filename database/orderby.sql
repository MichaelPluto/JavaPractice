-- order by 子句
-- 对数学成绩排序后输出（升序）
SELECT * FROM student
	ORDER BY math
-- 对总分按从高到底顺序输出
SELECT `name`,(math + english + chinese)AS 'total_score' FROM student 
	ORDER BY total_score DESC
-- 对姓李的学生成绩排序输出（升序）
SELECT `name`,(math + english + chinese)AS 'total_score' FROM student
	WHERE `name` LIKE '韩%'
	ORDER BY total_score
