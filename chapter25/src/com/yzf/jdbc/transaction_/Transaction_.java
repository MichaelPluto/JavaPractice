package com.yzf.jdbc.transaction_;

import com.yzf.utils.JDBCUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transaction_ {
    @Test
    public void noTransaction(){
        //1. 得到连接
        Connection connection = null;

        //2.组织一个sql
        String sql = "update accountt set balance = balance - 100 where id = 1";
        String sql1 = "update accountt set balance = balance + 100 where id = 2?";
        //3.创建prepareStatement对象
        PreparedStatement preparedStatement = null;
        try {
            connection = JDBCUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            int row = preparedStatement.executeUpdate();
            System.out.println(row > 0 ? "成功" : "失败" );

            int i = 1/0;//抛出异常

            Connection connection1 = JDBCUtils.getConnection();
            PreparedStatement preparedStatement1 = connection1.prepareStatement(sql1);
            int row1 = preparedStatement1.executeUpdate();
            System.out.println(row1 > 0 ? "成功" : "失败" );
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            JDBCUtils.close(null,preparedStatement,connection);
        }
    }

    @Test
    public void useTransaction() {
        //1. 得到连接
        Connection connection = null;

        //2.组织一个sql
        String sql = "update accountt set balance = balance - 100 where id = 1";
        String sql1 = "update accountt set balance = balance + 100 where id = 2";
        //3.创建prepareStatement对象
        PreparedStatement preparedStatement = null;
        try {
            connection = JDBCUtils.getConnection();
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement(sql);
            int row = preparedStatement.executeUpdate();
            System.out.println(row > 0 ? "成功" : "失败");

            //int i = 1 / 0;//抛出异常

            preparedStatement = connection.prepareStatement(sql1);
            int row1 = preparedStatement.executeUpdate();
            System.out.println(row1 > 0 ? "成功" : "失败");

            connection.commit();
        } catch (SQLException e) {
            System.out.println("回滚");
            try {
                connection.rollback();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            //关闭资源
            JDBCUtils.close(null, preparedStatement, connection);
        }
    }
}
