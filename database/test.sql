CREATE TABLE Accountt(
	id INT PRIMARY KEY AUTO_INCREMENT,
	`name` VARCHAR(32) NOT NULL DEFAULT '',
	balance DOUBLE NOT NULL DEFAULT 0
)CHARACTER SET utf8;

INSERT INTO accountt VALUES(NULL,'马云',3000);
INSERT INTO accountt VALUES(NULL,'马化腾',10000);
SELECT * FROM accountt

-- 创建测试表
CREATE TABLE admin2
(id INT PRIMARY KEY AUTO_INCREMENT,
username VARCHAR(32) NOT NULL,
`password` VARCHAR(32) NOT NULL
);
DROP TABLE admin2
SELECT COUNT(*) FROM admin2;