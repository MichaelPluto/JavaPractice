package com.yzf.jdbc.myjdbc_;

public class TestJDBC {
    public static void main(String[] args) {
        JdbcInterface jdbcInterface = new MysqlJdbcImpl();
        jdbcInterface.getConnection();
        jdbcInterface.crud();
        jdbcInterface.close();
        System.out.println("========");
        JdbcInterface jdbcInterface1 = new OracleJdbcImpl();
        jdbcInterface1.getConnection();
        jdbcInterface1.crud();
        jdbcInterface1.close();
    }
}
