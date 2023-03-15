
SELECT ename,sal*12 Annual Salary FROM emo; -- 错误
SELECT ename,sal,comm FROM emp WHERE comm IS NOT NULL; -- 正确
SELECT ename,sal,salary FROM emp ORDER BY 3; -- 错误