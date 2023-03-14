-- 演示自增长的使用
-- 创建表
CREATE TABLE t24(
	id INT PRIMARY KEY AUTO_INCREMENT,
	email VARCHAR(32) NOT NULL DEFAULT '',
	`name` VARCHAR(32) NOT NULL DEFAULT ''
)
DESC t24
INSERT INTO t24 VALUES(NULL,'yzf@.com','yzf')
INSERT INTO t24 VALUES(NULL,'hsp@.com','hsp')
INSERT INTO t24 VALUES(NULL,'jakc@.com','jack')

INSERT INTO t24 (email,`name`) VALUES('mary@.com','mary') -- 因为是自增长，所以这条语句正确
SELECT * FROM t24
-- 修改默认的自增长开始值
ALTER TABLE t25 AUTO_INCREMENT = 10 -- 这样自增长就会从10开始
CREATE TABLE t25(
	id INT PRIMARY KEY AUTO_INCREMENT,
	email VARCHAR(32) NOT NULL DEFAULT '',
	`name` VARCHAR(32) NOT NULL DEFAULT ''
)
INSERT INTO t25 VALUES(NULL,'yzf@.com','yzf')
INSERT INTO t25 VALUES(NULL,'hsp@.com','hsp')
INSERT INTO t25 VALUES(NULL,'jakc@.com','jack')
DROP TABLE t25

-- 如果添加数据时给自增长字段指定有值，则会从该值开始自增长
INSERT INTO t25 VALUES(100,'kiki@.com','kiki')
INSERT INTO t25 VALUES(NULL ,'tom@.com','tom')
SELECT * FROM t25