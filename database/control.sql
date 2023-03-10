-- 流程控制语句
# IF(exper1,exper2,exper3) 如果exper1 为 True，则返回 exper2 否则返回 exper3
SELECT IF(TRUE,'北京','上海') FROM DUAL
SELECT IF(FALSE,'北京','上海') FROM DUAL
# IFNULL(expr1,expr2) 如果 expr1 不为空 NULL,则返回 expr1,否则返回 expr2
SELECT IFNULL('上海','北京') FROM DUAL
SELECT IFNULL(NULL,'北京') FROM DUAL
# SELECT CASE WHEN expr1 THEN expr2 WHEN expr3 THEN expr4 ELSE expr5 END; [类似多重分支.]
# 如果 expr1 为 TRUE,则返回 expr2,如果 expr2 为 t, 返回 expr4, 否则返回 expr5
-- 1. 查询 emp 表, 如果 comm 是 null , 则显示 0.0
-- 判断是否为 null 要使用 is null, 判断不为空 使用 is not
SELECT * FROM emp
SELECT ename,IF(comm IS NULL,'0.0',comm) AS comm 
	FROM emp
-- 2. 如果 emp 表的 job 是 CLERK 则显示 职员， 如果是 MANAGER 则显示经理
-- 如果是 SALESMAN 则显示 销售人员，其它正常显示
SELECT ename,(SELECT CASE
	WHEN job = 'CLERK' THEN '职员'
	WHEN job = 'MANAGER' THEN '经理'
	WHEN job = 'SALESMAN' THEN '销售人员'
	ELSE job END) AS new_job,job AS old_job
	FROM emp