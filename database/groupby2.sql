-- 增强group by的使用
-- 显示每种岗位的雇员总数、平均工资
SELECT COUNT(*),AVG(sal),job
	FROM emp
	GROUP BY job
-- 显示雇员总数以及获得补助的雇员数
-- 获得不住的雇员数 就是 comm列为 非null，就是count(列)，如果该列的值为null
-- 就不会统计
SELECT COUNT(*),COUNT(comm)
	FROM emp
-- 显示雇员总数以及没有获得补助的雇员数
SELECT COUNT(*),COUNT(IF(comm IS NULL,1,NULL))
	FROM emp
SELECT COUNT(*),COUNT(*) - COUNT(comm)
	FROM emp
-- 显示管理者的总人数
SELECT COUNT(DISTINCT mgr)
	FROM emp
	
-- 显示雇员工资的最大差额
SELECT MAX(sal) - MIN(sal)
	FROM emp