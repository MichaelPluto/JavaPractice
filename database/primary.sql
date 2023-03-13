-- 主键使用

-- id name email
CREATE TABLE t17
	(id INT,
	 `name` VARCHAR(32),
	 email VARCHAR (32)	
	)
INSERT INTO t17 VALUES
	(1,'jack','jack@.com'),
	(2,'tom','tom@.com'),
	(1,'yzf','yzf@.com')
SELECT * FROM t17

CREATE TABLE t18
	(id INT PRIMARY KEY,
	 `name` VARCHAR(32),
	 email VARCHAR (32)	
	)
INSERT INTO t18 VALUES  -- 不行，因为主键不能重复
	(1,'jack','jack@.com'),
	(2,'tom','tom@.com'),
	(1,'yzf','yzf@.com')
	
-- 主键使用的细节
-- primary key 不能重复而且不能为null
INSERT INTO t17 VALUES
	(NULL,'jack','jack@.com'),
-- 一张表最多只能有一个主键
CREATE TABLE t19
	(id INT PRIMARY KEY,
	 `name` VARCHAR(32) PRIMARY KEY,
	 email VARCHAR (32)	
	)
-- 直接在字段后指定 ： 字段名 + primary key
CREATE TABLE t19
	(id INT,
	 `name` VARCHAR(32) ,
	 email VARCHAR (32),
	 PRIMARY KEY (id)	
	)
-- 在表定义最后写 primary key(列名)，可以写复合主键
CREATE TABLE t20
	(id INT,
	 `name` VARCHAR(32) ,
	 email VARCHAR (32),
	 PRIMARY KEY (id,`name`)	
	)
-- 使用desc 可以看到主键情况
DESC t19
DESC t20	