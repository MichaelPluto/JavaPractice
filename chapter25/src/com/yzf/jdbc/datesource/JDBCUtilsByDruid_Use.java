package com.yzf.jdbc.datesource;

import org.junit.jupiter.api.Test;

import java.sql.*;
import java.util.ArrayList;

public class JDBCUtilsByDruid_Use {
    @Test
    public void select(){
        System.out.println("使用Druid方法");
        //1. 得到连接
        Connection connection = null;

        //2.组织一个sql
        String sql = "select * from actor";
        //3.创建prepareStatement对象
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = JDBCUtilsByDruid.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String sex = resultSet.getString("sex");
                String borndate = resultSet.getString("borndate");
                String phone = resultSet.getString("phone");
                System.out.println(id + "\t"  + name + "\t" + sex + "\t" + borndate + "\t" + phone);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            JDBCUtilsByDruid.close(resultSet,preparedStatement,connection);
        }
    }
    //土办法封装到Arraylist
    @Test
    public void selectToArrayList() {
        System.out.println("使用Druid方法");
        //1. 得到连接
        Connection connection = null;

        //2.组织一个sql
        String sql = "select * from actor";
        //3.创建prepareStatement对象
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        ArrayList<Actor> list = new ArrayList<>();
        try {
            connection = JDBCUtilsByDruid.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String sex = resultSet.getString("sex");
                Date borndate = resultSet.getDate("borndate");
                String phone = resultSet.getString("phone");
                list.add(new Actor(id,name,sex,borndate,phone));//
            }
            //System.out.println(list);
            for (Actor actor : list) {
                System.out.println(actor.getId() + " " + actor.getName());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            JDBCUtilsByDruid.close(resultSet, preparedStatement, connection);
        }
    }
}
