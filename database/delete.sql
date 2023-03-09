-- delete语句演示
SELECT * FROM employee
-- 删除表中名为 刘芮的记录
DELETE FROM employee
	WHERE username = '刘芮'
-- 删除表中所有的记录
DELETE FROM employee
ALTER TABLE employee
	DROP job