-- 视图的使用
-- 创建一个试图emp_view01 只能查询emp表的 empno,ename,job,deptno 信息
CREATE VIEW emp_view01
	AS 
	SELECT empno,ename,job,deptno FROM emp;
DESC emp_view01;
SELECT * FROM emp;
SELECT * FROM emp_view01;

-- 查看创建试图的指令
SHOW CREATE VIEW emp_view01;
-- 删除试图
DROP VIEW emp_view01;

-- 修改视图也会影响到基表,反之亦然
UPDATE emp_view01 
	SET job = 'MANAGER'
	WHERE empno = 7369	
SELECT * FROM emp;

-- 视图中可以再使用视图,比如从emp_view01中选出 empno和ename做出新视图
-- 新视图变化也会影响基表
DESC emp_view01
CREATE VIEW emp_view02
	AS
	SELECT empno,ename FROM emp_view01
SELECT * FROM emp_view02;


