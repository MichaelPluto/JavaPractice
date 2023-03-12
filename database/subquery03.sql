-- 查询每个部门工资高于本部门平均工资的人的资料
SELECT deptno,AVG(sal) AS avg_sal
	FROM emp
	GROUP BY deptno
SELECT ename,sal,temp.avg_sal,emp.deptno
	FROM emp,(
		SELECT deptno,AVG(sal) AS avg_sal
		FROM emp
		GROUP BY deptno
	) AS temp
	WHERE emp.sal > temp.avg_sal AND emp.deptno = temp.deptno

-- 查找每个部门工资最高的人的详细信息
SELECT deptno
	FROM emp
	GROUP BY deptno
SELECT deptno,MAX(sal)
	FROM emp 
	GROUP BY deptno
	
SELECT * 
	FROM emp,(
		SELECT deptno,MAX(sal) AS msal
		FROM emp 
		GROUP BY deptno	
	) temp
	WHERE emp.deptno == (temp.deptno) AND emp.sal = temp.msal

-- 查询每个部门的信息(包括: 部门名，编号，地址) 和人员数量
SELECT COUNT(*),deptno
	FROM emp
	GROUP BY deptno
-- 表名.* 表示将该表所有列都显示出来
-- 在多表查询中，当多个表的列不重复时，才可以直接写出列名

SELECT dname,loc,temp.*
	FROM dept,(
		SELECT deptno,COUNT(*) AS per_num
		FROM emp
		GROUP BY deptno	
	) temp
	WHERE dept.deptno = temp.deptno


SELECT emp.*,tb.c
	FROM emp,(
		SELECT dname,deptno,loc
		FROM dept
	) tp, (
		SELECT COUNT(*) AS per_num
		FROM emp
	) tb
	WHERE emp.deptno = tp.deptno