-- 表外连接
CREATE TABLE stu(
	id INT,
	`name` VARCHAR(32)
)
INSERT INTO stu VALUES(1,'jack'),(2,'tom'),(3,'kity'),(4,'nono')
CREATE TABLE exam(
	id INT,
	`grade` INT
)
INSERT INTO exam VALUES(1,56),(2,76),(3,8)

-- 使用左连接 显示所有人的成绩，如果没有成绩也要显示该人的姓名和id
SELECT `name`,stu.id,grade
	FROM stu LEFT JOIN exam
	ON exam.id = stu.id
-- 使用右连接 显示所有成绩，如果没有名字匹配 显示空
SELECT `name`,stu.id,grade
	FROM exam RIGHT JOIN stu
	ON stu.id = exam.id

SELECT dname,ename,job
	FROM dept LEFT JOIN emp
	ON dept.deptno = emp.deptno
	
SELECT dname,ename,job
	FROM emp RIGHT JOIN dept
	ON dept.deptno = emp.deptno