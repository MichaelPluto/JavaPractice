-- 子查询的演示
-- 请思考：如何显示与 SMITH 同一部门的所有员工?
/*
1. 先查询到 SMITH 的部门号得到
2. 把上面的 select 语句当做一个子查询来使用
*/
SELECT deptno 
	FROM emp
	WHERE ename = 'SMITH' 
SELECT * 
	FROM emp
	WHERE deptno = 20
-- 下面的答案. SELECT *
SELECT * FROM emp
	WHERE deptno = (
	SELECT deptno 
	FROM emp
	WHERE ename = 'SMITH' 
	)
-- 课堂练习:如何查询和部门 10 的工作相同的雇员的
-- 名字、岗位、工资、部门号, 但是不含 10 号部门自己的雇员.
/*
1. 查询到 10 号部门有哪些工作
2. 把上面查询的结果当做子查询使用
*/
SELECT DISTINCT job 
	FROM emp
	WHERE deptno = 10
SELECT ename,job,sal,deptno
	FROM emp
	where job in(
	SELECT DISTINCT job 
	FROM emp	
	) and deptno != 10
	
