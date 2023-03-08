#演示整型
#tinyint 有符号 -128~127 无符号 0-255
#需要指定 unsigned来确定是否有符号
CREATE TABLE t3 (
	id TINYINT);
CREATE TABLE t4 (
	id TINYINT UNSIGNED);
INSERT INTO t3 VALUES(127)
INSERT INTO t4 VALUES(256)		