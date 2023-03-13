-- unique 表示某字段是不可重复的
-- unique 使用细节
-- 1.如果没有指定 not null 则unique 字段可以有多个null
-- 2.如果一个字段 时 unique not null 使用效果类似 primary key
CREATE TABLE t21
	(id INT UNIQUE,
	 `name` VARCHAR(32) ,
	 email VARCHAR (32),
	 PRIMARY KEY (id,`name`)	
	)
INSERT INTO t21 VALUES -- id 重复
	(1,'jack','jack@.com'),
	(2,'tom','tom@.com'),
	(1,'yzf','yzf@.com');
	
INSERT INTO t21 VALUES -- 
	(NULL,'jack','jack@.com'),
	(NULL,'tom','tom@.com'),
	(NULL,'yzf','yzf@.com');