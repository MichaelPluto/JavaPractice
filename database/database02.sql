#演示删除和查询数据库
#查看当前数据库服务器中所有的数据库
SHOW DATABASES
#查看前面创建yzf_db01数据库的定义信息
SHOW CREATE DATABASE `yzf_db01`
#在创建数据库 表的时候，为了规避关键字，可以使用反引号解决
#删除前面创建yzf_db01数据库
DROP DATABASE yzf_db01