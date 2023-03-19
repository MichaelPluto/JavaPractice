package com.yzf.jdbc.myjdbc_;

public class MysqlJdbcImpl implements JdbcInterface{
    @Override
    public Object getConnection() {
        System.out.println("得到mysql 的连接");
        return null;
    }

    @Override
    public void crud() {
        System.out.println("完成crud操作");
    }

    @Override
    public void close() {
        System.out.println("关闭mysql连接");
    }
}
