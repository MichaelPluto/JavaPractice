CREATE DATABASE shop_db
-- goods表
CREATE TABLE goods(
	goods_id INT PRIMARY KEY,
	goods_name VARCHAR(32) NOT NULL DEFAULT '',
	unitprice DECIMAL(10,2) NOT NULL DEFAULT 0
	 CHECK (unitprice >= 1.0 AND unitprice <= 9999.99),
	category VARCHAR(32) NOT NULL DEFAULT '',
	provider VARCHAR(32) NOT NULL DEFAULT ''
)
DROP TABLE purchase
-- customer表
CREATE TABLE customer(
	customer_id CHAR(8) PRIMARY KEY,
	`name` VARCHAR(32) NOT NULL DEFAULT '',
	address VARCHAR(32) NOT NULL DEFAULT '',
	enmail VARCHAR(32) UNIQUE NOT NULL,
	sex ENUM('男','女') NOT NULL,
	card_id CHAR(18)
)
-- purchase表
CREATE TABLE purchase(
	order_id INT UNIQUE NOT NULL DEFAULT 0,
	customer_id CHAR(8) NOT NULL DEFAULT '',
	goods_id INT NOT NULL DEFAULT 0,
	num INT NOT NULL DEFAULT 0,
	FOREIGN KEY (customer_id) REFERENCES customer(customer_id),
	FOREIGN KEY (goods_id) REFERENCES goods(goods_id)
)
DESC goods
DESC customer
DESC purchase