-- 多表查询 where进行条件过滤
-- ?显示雇员名,雇员工资及所在部门的名字 【笛卡尔集】
/*
1. 雇员名,雇员工资 来自 emp 表
2. 部门的名字 来自 dept 表
3. 需求对 emp 和 dept 查询 ename,sal,dname,deptno
4. 当我们需要指定显示某个表的列是，需要 表.列表
*/
SELECT ename,sal,dname,emp.deptno
	FROM emp,dept
	WHERE emp.deptno = dept.deptno
-- 老韩小技巧：多表查询的条件不能少于 表的个数-1, 否则会出现笛卡尔集
-- ?如何显示部门号为 10 的部门名、员工名和工资
SELECT dname,ename,sal
	FROM emp,dept
	WHERE emp.deptno = dept.deptno AND emp.deptno = 10
-- ?显示各个员工的姓名，工资，及其工资的级别
SELECT ename,sal,grade
	FROM emp,salgrade
	#`where emp.sal >= losal and emp.sal <= hisal
	WHERE emp.sal BETWEEN losal AND hisal

-- 显示雇员名，雇员工资及所在部门的名字，并按部门降序排序
SELECT ename,sal,dname
	FROM emp,dept
	WHERE emp.deptno = dept.deptno
	ORDER BY emp.deptno DESC