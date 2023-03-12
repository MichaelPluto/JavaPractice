-- 查询 每个部门 工资 高于 本部门 平均工资 的人的资料
SELECT deptno,AVG(sal)  -- 每个部门的平均工资
	FROM emp
	GROUP BY deptno
SELECT ename,sal,avg_sal,emp.deptno
	FROM emp,(
		SELECT deptno,AVG(sal) AS avg_sal 
		FROM emp
		GROUP BY deptno
	) temp
	WHERE emp.deptno = temp.deptno AND sal > avg_sal
	
-- 查找每个部门工资最高的人的详细信息
SELECT deptno,MAX(sal)
	FROM emp
	GROUP BY deptno

SELECT ename,job,sal,comm,emp.deptno
	FROM emp,(
		SELECT deptno,MAX(sal) AS max_sal
		FROM emp
		GROUP BY deptno
	) temp
	WHERE emp.deptno = temp.deptno AND sal = max_sal
	
	

-- 查询每个部门的信息(包括: 部门名，编号，地址) 和人员数量

SELECT COUNT(*),deptno
	FROM emp
	GROUP BY deptno

SELECT dname,dept.deptno,loc,per_num
	FROM dept,(
		SELECT COUNT(*) AS per_num ,deptno
		FROM emp
		GROUP BY deptno
	) temp
	WHERE dept.deptno = temp.deptno


