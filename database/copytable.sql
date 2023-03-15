-- 表的复制
CREATE TABLE my_tab01
	(id INT,
	 `name` VARCHAR(32),
	 sal DOUBLE,
	 job VARCHAR(32),
	 deptno INT		
		)
DESC my_tab01
INSERT INTO my_tab01
	(id,`name`,sal,job,deptno)
	SELECT empno,ename,sal,job,deptno 
	FROM emp
SELECT * FROM my_tab01
-- 自我复制
INSERT INTO my_tab01
	SELECT * FROM my_tab01
	
-- 如何删除一张表重复记录
/*
1.先创建一张表 my_tab02
2.让 my_tab02 有重复的记录
*/
CREATE TABLE my_tab02 LIKE emp
DESC my_tab02
INSERT INTO my_tab02
	SELECT * FROM emp
SELECT * FROM my_tab02

INSERT INTO my_tab02 -- 自我复制
	select * from my_tab02
/*
3.去重
   先创建一张临时表 my_tmp ，该表结构和my_tab02一样
   把my_tab02 的记录通过 distinct关键字处理后 复制到 my_tmp中
   删除my_tab02中的内容
   把 my_tmp中的内容复制到 my_tab02中
   删除 my_tmp表
*/
create table my_tmp like my_tab02

insert into my_tmp
	select distinct * from my_tab02
delete from my_tab02	
insert into my_tab02
	select * from my_tmp
drop table my_tmp
select * from my_tab02
SELECT * FROM my_tmp
-- 还可以直接将 原来的my_tab02 drop掉，把my_tmp 改名成 my_tab02

drop table my_tab02
rename table my_tmp to my_tab02
SELECT * FROM my_tab02