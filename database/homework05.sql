


CREATE TABLE `DEPARTMENT`(
	departmentid VARCHAR(32) PRIMARY KEY,
	deptname VARCHAR(32) UNIQUE NOT NULL
)
CREATE TABLE `CLASS`(
	classid INT PRIMARY KEY,
	`subject` VARCHAR(32) NOT NULL DEFAULT '',
	`deptname` VARCHAR(32), -- 外键字段
	enrolltime INT NOT NULL DEFAULT 2000,
	num INT NOT NULL DEFAULT 0,
	FOREIGN KEY (deptname) REFERENCES DEPARTMENT(deptname)
)

CREATE TABLE `STUDENT`(
	studentid INT PRIMARY KEY,
	`name` VARCHAR(32)NOT NULL DEFAULT '',
	`age` INT NOT NULL DEFAULT 0,
	classid INT, -- 外键
	FOREIGN KEY (classid) REFERENCES CLASS(classid)
)

INSERT INTO DEPARTMENT VALUES
		(001,'数学'),
		(002,'计算机'),
		(003,'化学'),
		(004,'中文'),
		(005,'经济')
insert into CLASS values
		(101,'软件','计算机','1995',20),
		(102,'微电子','计算机','1996',30),
		(103,'无机化学','化学','1995',29),
		(104,'高分子化学','化学','1996',25),
		(105,'统计数学','数学','1995',20),
		(106,'现代语言','中文','1996',20),
		(107,'国际贸易','经济','1997',30),
		(108,'国际金融','经济','1996',14)
INSERT INTO STUDENT VALUES
		(8101,'张三',18,101),
		(8102,'钱四',16,121),
		(8103,'王玲',17,131),
		(8105,'李飞',19,102),
		(8109,'赵四',18,141),
		(8110,'李可',20,142),
		(8201,'张飞',18,111),
		(8302,'周瑜',16,112),
		(8203,'王亮',17,111),
		(8305,'董庆',19,102),
		(8409,'赵龙',18,112),
		(8510,'李丽',20,142)
		
select * 
	from STUDENT
	where `name` like '%李%'
select count(*) as nums,deptname
	from CLASS
	group by deptname 
	having nums > 1

select temp.*,department.departmentid
	from department,(
		SELECT SUM(num) AS nums,deptname
		FROM CLASS
		GROUP BY deptname
		HAVING nums >= 30
	) temp
	where department.deptname = temp.deptname
	
