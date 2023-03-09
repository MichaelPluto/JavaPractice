CREATE TABLE goods(
	id INT,
	good_name VARCHAR(10),
	price DOUBLE NOT NULL DEFAULT 100
)
INSERT INTO goods (id,good_name,price)
	VALUES(2,'杨质飞','15000.0')
SELECT * FROM goods
INSERT INTO goods(id,good_name,price)
	VALUES(3,'iPhone13','8500')
	
CREATE TABLE goods2(
	id INT,
	good_name VARCHAR(10),
	price DOUBLE NOT NULL DEFAULT 100)