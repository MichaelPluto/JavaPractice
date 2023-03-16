SELECT * 
	FROM emp
	WHERE deptno = 30;
	
SELECT ename,empno,deptno
	FROM emp
	WHERE job = 'CLERK';
	
SELECT * 
	FROM emp
	WHERE comm > sal;
	
SELECT * 
	FROM emp
	WHERE IFNULL(comm,0) > (sal*0.6); -- 佣金可能为null
	
SELECT * 
	FROM emp
	WHERE (deptno = 10 AND job = 'MANAGER') OR (deptno = 20 AND job = 'CLERK');

SELECT * 
	FROM emp
	WHERE (deptno = 10 AND job = 'MANAGER') 
		OR (deptno = 20 AND job = 'CLERK')
		OR (job != 'MANAGER' AND job != 'CLERK' AND sal >= 2000);
		
SELECT ename,job
	FROM emp
	WHERE comm IS NOT NULL;
	
SELECT * 
	FROM emp
	WHERE comm IS NULL OR IFNULL(comm,0) < 100;

SELECT * 
	FROM emp
	WHERE LAST_DAY(hiredate) - 2 = hiredate;
	
SELECT * 
	FROM emp
	WHERE DATE_ADD(hiredate, INTERVAL 12 YEAR) < NOW();
	
	
SELECT CONCAT(LCASE(SUBSTRING(ename,1,1)),SUBSTRING(ename,2))
	FROM emp;
SELECT * 
	FROM emp
	WHERE LENGTH(ename) = 5;
-- 13	
SELECT ename
	FROM emp
	WHERE  ename NOT LIKE '%R%';
SELECT SUBSTRING(ename,1,3)
	FROM emp
SELECT REPLACE(ename,'A','a')
	FROM emp
SELECT ename,hiredate
	FROM emp
	WHERE DATE_ADD(hiredate,INTERVAL 10 YEAR) <= NOW();
SELECT * 
	FROM emp
	ORDER BY ename;
SELECT ename,hiredate
	FROM emp
	ORDER BY hiredate ;
SELECT ename,job,sal
	FROM emp
	ORDER BY job DESC, sal
SELECT ename,CONCAT(YEAR(hiredate),'-',MONTH(hiredate))
	FROM emp
	ORDER BY MONTH(hiredate),YEAR(hiredate)
SELECT FLOOR(sal / 30),sal / 30
	FROM emp
SELECT * 
	FROM emp
	WHERE MONTH(hiredate) = 2;
SELECT ename,DATEDIFF(NOW(), hiredate)
	FROM emp;
SELECT ename
	FROM emp
	WHERE INSTR(ename,'A') = 0
SELECT ename,
	DATEDIFF(NOW(),hiredate) AS `day`,
	FLOOR(DATEDIFF(NOW(),hiredate) / 30) AS `month`,
	FLOOR(DATEDIFF(NOW(),hiredate) / 365) AS `year`
	FROM emp