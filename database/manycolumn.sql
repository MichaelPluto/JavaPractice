-- 多列子查询

-- 请思考如何查询与 ALLEN 的部门和岗位完全相同的所有雇员(并且不含 allen 本人)
-- (字段 1， 字段 2 ...) = (select 字段 1，字段 2 from 。。。。)

-- 1.得到smith的部门和岗位
SELECT deptno,job
	FROM emp
	WHERE ename = 'ALLEN'
-- 2.把上面的查询当作子查询来使用，并且使用多列子查询的语法进行匹配
SELECT * 
	FROM emp
	WHERE (deptno,job) = (
		SELECT deptno,job
		FROM emp
		WHERE ename = 'ALLEN'
	) AND ename != 'ALLEN'
	
-- 查询 和宋江数学，英语 语文成绩完全相同的学生 student表
SELECT `name`,math,english,chinese
	FROM student
	WHERE `name` = '宋江'
 