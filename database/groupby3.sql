-- 请统计各个部门group by 的平均工资 avg，并且是大于1000的 having
-- 并按照平均工资从高到底排序 order by ，取出前两行记录 limit
SELECT deptno,AVG(sal)AS avg_sal
	FROM emp
	GROUP BY deptno
	HAVING avg_sal > 1000
	ORDER BY avg_sal DESC
	LIMIT 0,2
	