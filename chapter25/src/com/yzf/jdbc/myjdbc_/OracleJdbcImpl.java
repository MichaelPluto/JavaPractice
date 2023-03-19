package com.yzf.jdbc.myjdbc_;

public class OracleJdbcImpl implements JdbcInterface{
    @Override
    public Object getConnection() {
        System.out.println("得到Oracle数据库连接");
        return null;
    }

    @Override
    public void crud() {
        System.out.println("进行crud操作");
    }

    @Override
    public void close() {
        System.out.println("关闭Oracle数据库连接");
    }
}
