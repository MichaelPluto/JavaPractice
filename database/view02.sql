
CREATE VIEW emp_view03
	AS 
	SELECT empno,ename,dname,grade 
	FROM emp,dept,salgrade
	WHERE emp.deptno = dept.deptno AND 
	(emp.sal BETWEEN losal AND hisal)
DROP VIEW emp_view03;
SELECT * FROM emp_view03;