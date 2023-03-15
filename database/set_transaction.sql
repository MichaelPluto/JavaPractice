-- 演示mysql的事务隔离级别

-- 1.开了两个mysql的控制台
-- 2.查看当前mysql的隔离级别
SELECT @@tx_isolation;
/*+-----------------+
| @@tx_isolation  |
+-----------------+
| REPEATABLE-READ |
+-----------------+
1 row in set (0.03 sec)*/
-- 3.把其中一个控制台的隔离级别设置为 Read uncommitted
SET SESSION TRANSACTION ISOLATION LEVEL READ UNCOMMITTED
-- 4.创建表
CREATE TABLE `account`(
	id INT,
	`name` VARCHAR(32),
	money INT
)
-- 脏读 A添加了数据 但未提交，B能查到A的数据
-- 不可重复读 A修改了数据 并提交，B未提交却能查到A修改后的数据
-- 欢度  A添加了数据并提交，B未提交却能查到A新添加后的数据

-- 查看当前会话隔离级别
SELECT @@tx_isolation
-- 查看当前系统隔离级别
SELECT @@global.tx_isolation
-- 设置当前会话隔离级别
SET SESSION TRANSACTION ISOLATION LEVEL READ UNCOMMITTED
-- 这是系统当前隔离级别
SET GLOBAL TRANSACTION ISOLATION LEVEL READ UNCOMMITTED

--