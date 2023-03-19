package com.yzf.jdbc.resultset_;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class ResultSet {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");

        Class.forName(driver);

        Connection connection = DriverManager.getConnection(url, user, password);

        Statement statement = connection.createStatement();
        String sql = "select id,name,sex,borndate from actor";
        //执行给定的sql语句，该语句返回单个 ResultSet对象
        java.sql.ResultSet resultSet = statement.executeQuery(sql);

        //使用while取出数据
        while (resultSet.next()){// next()让光标向下移动，如果没有更多行则返回false
            int id = resultSet.getInt(1);//取出该行的第1列
            String name = resultSet.getString(2);//取出该行的第2列
            String sex = resultSet.getString(3);//取出该行的第3列
            Date date = resultSet.getDate(4);//取出该行的第4列
            System.out.println(id + "\t" + name + "\t" + sex + "\t" + date);
        }

        //关闭连接
        resultSet.close();
        statement.close();
        connection.close();
    }
}
