-- mysql 用户的管理
-- 1.创建新的用户
CREATE USER 'yzf_edu'@'localhost' IDENTIFIED BY '123456'
SELECT * FROM 
	mysql.user
SELECT `host`,`user`,authentication_string
	FROM mysql.user

-- 2.删除用户
DROP USER 'yzf_edu'@'localhost'
-- 3.登录 'yzf_edu'@'localhost'

-- root修改 'yzf_edu'@'localhost'密码
SET PASSWORD FOR 'yzf_edu'@'localhost' = PASSWORD('123456')