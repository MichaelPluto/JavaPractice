SELECT COUNT(*) AS c ,deptno
	FROM emp
	GROUP BY deptno
	HAVING c > 0;
SELECT *
	FROM emp
	WHERE sal > (
		SELECT sal
		FROM emp
		WHERE ename = 'SMITH'
	);
	
SELECT *
	FROM emp worker, emp boss
	WHERE worker.hiredate > boss.hiredate AND boss.empno = worker.mgr;
	
SELECT dname, emp.*
	FROM dept LEFT JOIN emp ON dept.deptno = emp.deptno

SELECT ename,dname
	FROM emp,dept
	WHERE job = 'CLERK' AND emp.deptno = dept.deptno;
	
SELECT MIN(sal)AS min_sal,job
	FROM emp
	GROUP BY job
	HAVING min_sal > 1500

SELECT ename,dname
	FROM emp,dept
	WHERE emp.deptno = dept.deptno AND dname = 'SALES'

SELECT *
	FROM emp
	WHERE sal > (
	SELECT AVG(sal) AS avg_sal
	FROM emp)

SELECT * 
	FROM emp
	WHERE job = (
		SELECT job
		FROM emp
		WHERE ename = 'SCOTT'
	)
	
SELECT * 
	FROM emp
	WHERE sal > (
		SELECT MAX(sal) AS max_sal
		FROM emp
		WHERE deptno = 30
	)

SELECT COUNT(*), AVG(sal), 
	FORMAT(AVG(DATEDIFF(NOW(),hiredate) / 365),2)
	FROM emp
	GROUP BY deptno

SELECT ename,dname,sal
	FROM emp,dept
	WHERE emp.deptno = dept.deptno;
	
SELECT dept.*, c AS '部门人数'
	FROM dept,(
		SELECT COUNT(*) AS c, deptno
		FROM emp
		GROUP BY deptno
	) temp
	WHERE dept.deptno = temp.deptno
	
SELECT MIN(sal) AS min_sal,job
	FROM emp
	GROUP BY job
	
SELECT MIN(sal),job
	FROM emp
	WHERE job = 'MANAGER'
	
SELECT ename,(sal + IFNULL(comm,0)) * 12 AS year_sal
	FROM emp
	ORDER BY year_sal 