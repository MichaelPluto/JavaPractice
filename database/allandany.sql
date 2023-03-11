-- all 和 any的使用
-- 显示 工资 比 部门30 的所有员工的工资高的 员工姓名、工资号 和 部门号
SELECT ename,sal,deptno
	FROM emp
	WHERE sal >ALL(
		SELECT sal
		FROM emp
		WHERE deptno = 30
	)
SELECT ename,sal,deptno
	FROM emp
	WHERE sal >(
		SELECT MAX(sal)
		FROM emp
		WHERE deptno = 30
	)
-- 如果显示工资比部门30的其中一个员工的工资高的员工姓名 工资 和部门号
SELECT ename,sal,deptno
	FROM emp
	WHERE sal > ANY(
		SELECT sal
		FROM emp
		WHERE deptno = 30
	)
SELECT ename,sal,deptno
	FROM emp
	WHERE sal > (
		SELECT MIN(sal) 
		FROM emp
		WHERE deptno = 30 
	)
