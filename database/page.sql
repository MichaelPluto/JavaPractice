-- 分页查询
-- 按雇员的empno号升序取出，每页显示3条记录，请分别显示第一页 第二页 第三页

-- 第一页
SELECT * FROM emp
	ORDER BY empno
	LIMIT 0,3
-- 第二页
SELECT * FROM emp
	ORDER BY empno
	LIMIT 3,3
-- 第三页
SELECT * FROM emp
	ORDER BY empno
	LIMIT 6,3
-- 推导一个公式
SELECT * FROM emp
	ORDER BY empno
	LIMIT 每页显示记录数 * (第几页 - 1), 每页显示记录数

-- 按雇员的empno号降序取出，每页显示5条记录，请分别显示第三页 第五页
SELECT * FROM emp
	ORDER BY empno DESC
	LIMIT 10,5
-- 