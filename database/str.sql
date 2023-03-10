-- 演示字符串相关函数的使用

-- CHARSET(str) 返回字串字符集
SELECT CHARSET(ename) FROM emp
-- CONCAT (string2 [,... ]) 连接字串, 将多个列拼接成一列
SELECT * FROM emp
SELECT CONCAT(ename,'的工作是',job)AS '工作' FROM emp
-- INSTR (string ,substring ) 返回 substring 在 string 中出现的位置,没有返回 0
-- dual 亚元表, 系统表 可以作为测试表使用
SELECT INSTR('yangzhifei','fei') FROM DUAL

-- UCASE (string2 ) 转换成大写
SELECT UCASE(ename) FROM emp
-- LCASE (string2 ) 转换成小写
SELECT LCASE(ename) FROM emp
-- LEFT (string2 ,length )从 string2 中的左边起取 length 个字符
SELECT LEFT(ename,3) FROM emp
-- RIGHT (string2 ,length ) 从 string2 中的右边起取 length 个字符
SELECT RIGHT(ename,3) FROM emp
-- LENGTH (string )string 长度[按照字节]
SELECT LENGTH(ename) FROM emp
-- REPLACE (str ,search_str ,replace_str )
-- 在 str 中用 replace_str 替换 search_str
-- 如果是 manager 就替换成 经理
SELECT ename, REPLACE(job,'MANAGER','经理') AS new_job FROM emp

-- STRCMP (string1 ,string2 ) 逐字符比较两字串大小
SELECT STRCMP('abc','cbb') FROM DUAL
-- SUBSTRING (str , position [,length ])
SELECT SUBSTRING(ename,1,2) FROM emp -- 从第一个位置往后区两个字符 
-- 从 str 的 position 开始【从 1 开始计算】,取 length 个字符
-- 从 ename 列的第一个位置开始取出 2 个字符
 -- LTRIM (string2 ) RTRIM (string2 ) TRIM(string)
-- 去除前端空格或后端空格



SELECT CONCAT(LCASE(LEFT(ename,1)), SUBSTRING(ename,2))
	FROM emp
 