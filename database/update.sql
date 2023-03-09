-- 将所有员工的薪水改为5000
UPDATE employee 
	SET Salary = 5000
-- 将姓名为胡小楠的员工薪水改为3000
UPDATE employee
	SET Salary = 3000 
	WHERE username = '胡小楠'
-- 将杨质飞的薪水在原有基础上增加1000
UPDATE employee
	SET Salary = Salary + 1000 
	 WHERE username = '杨质飞'
INSERT INTO employee
	VALUES(2,'刘芮','2001-08-06','2024-10-2 16:20','英语外贸经理',8000,
	'大美女','')
UPDATE employee
	SET Salary = Salary + 2000, job = '捶背的'
	WHERE username = '刘芮'
	
SELECT * FROM employee