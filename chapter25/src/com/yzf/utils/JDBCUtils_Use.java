package com.yzf.utils;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 该类演示如何使用JDBCUtils工具类
 */
public class JDBCUtils_Use {
    @Test
    public void select(){
        //1. 得到连接
        Connection connection = null;

        //2.组织一个sql
        String sql = "select * from actor";
        //3.创建prepareStatement对象
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = JDBCUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString(2);
                String borndate = resultSet.getString(3);
                String phone = resultSet.getString(4);
                System.out.println(id + "\t" + name + "\t" + borndate + "\t" + phone);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            JDBCUtils.close(resultSet,preparedStatement,connection);
        }
    }

    @Test
    public void testDML(){

        //1. 得到连接
        Connection connection = null;

        //2.组织一个sql
        String sql = "update actor set name = ? where id = ?";
        //3.创建prepareStatement对象
        PreparedStatement preparedStatement = null;
        try {
            connection = JDBCUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
        //4.设置改变的值
            preparedStatement.setString(1,"周星驰");
            preparedStatement.setInt(2,4);
            int row = preparedStatement.executeUpdate();
            System.out.println(row > 0 ? "成功" : "失败" );
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            JDBCUtils.close(null,preparedStatement,connection);
        }
    }
}
