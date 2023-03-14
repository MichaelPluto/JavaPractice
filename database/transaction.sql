-- 事务的演示
-- 1.创建一张测试表
CREATE TABLE t27(
	id INT,
	`name` VARCHAR(32)
)
-- 2.开始事务
START TRANSACTION
-- 3.设置保存点
SAVEPOINT a
-- 执行 dml操作
INSERT INTO t27 VALUES(100,'jack')
SELECT * FROM t27
SAVEPOINT b
-- 执行 dml操作
INSERT INTO t27 VALUES(200,'tom')
SELECT * FROM t27
-- 回退到 b
ROLLBACK TO b
SELECT * FROM t27
-- 继续回退到 a
ROLLBACK TO a
-- 如果这样写，则是直接回退到事务开始的时
ROLLBACK

--  提交事务 ，提交后所有的操作生效，不能回退
COMMIT 