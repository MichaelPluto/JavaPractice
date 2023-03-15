-- 合并查询

SELECT ename,sal,job FROM emp WHERE sal > 2500 -- 5条
SELECT ename,sal,job FROM emp WHERE job = 'MANAGER' -- 3条

-- union all 就是将两个查询结构合并，不会去重
SELECT ename,sal,job FROM emp WHERE sal > 2500 -- 5条
UNION ALL
SELECT ename,sal,job FROM emp WHERE job = 'MANAGER' -- 3条

-- union 就是将两个查询结构合并，会去重
SELECT ename,sal,job FROM emp WHERE sal > 2500 -- 5条76546
UNION 
SELECT ename,sal,job FROM emp WHERE job = 'MANAGER' -- 3条
