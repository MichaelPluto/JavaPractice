package com.yzf.jdbc.myjdbc_;

/**
 * 模拟Jdbc接口
 */
public interface JdbcInterface {
    //得到数据库连接
    public Object getConnection();
    //crud
    public void crud();
    //关闭连接
    public void close();
}
