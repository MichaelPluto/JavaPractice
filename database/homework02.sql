-- 1
SELECT dname FROM dept;
-- 2
SELECT ename,(sal+ IFNULL(comm,0))* 13 AS '年收入' -- IFNULL(comm,0)
		FROM emp;
-- 3
SELECT ename,sal
	FROM emp
	WHERE sal > 2850;
-- 4
SELECT ename,sal
	FROM emp
	WHERE sal NOT IN (1500,2850);
-- 5
SELECT ename,deptno
	FROM emp
	WHERE empno = 7566;
-- 6
SELECT ename,sal,deptno
	FROM emp
	WHERE deptno = 10 OR deptno = 30 AND sal > 1500;
-- 7
SELECT ename,job
	FROM emp
	WHERE mgr IS NULL;
-- 8
SELECT ename,job,hiredate
	FROM emp
	WHERE hiredate BETWEEN '1991-2-1' AND '1991-5-1'
	ORDER BY hiredate;
-- 9 
SELECT ename,sal,comm
	FROM emp
	ORDER BY sal DESC;
	
	