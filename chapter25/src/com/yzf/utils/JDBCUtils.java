package com.yzf.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JDBCUtils {
    //定义相关的属性(4个) 因为只需要一份，因此设置为静态属性
     private static String user;
     private static String password;
     private static String url;
     private static String driver;

     //在static代码块去初始化
    static {
         try {
             Properties properties = new Properties();
             properties.load(new FileInputStream("src\\mysql.properties"));
             //获取相应的属性
             user = properties.getProperty("user");
             password = properties.getProperty("password");
             url = properties.getProperty("url");
             driver = properties.getProperty("driver");

         } catch (IOException e) {
             //在实际开发中，我们可以这样处理
             //1.将编译异常转成运行异常
             //2。调用者可以选择捕获该异常，也可以选择默认处理该异常，比较方便
             throw new RuntimeException(e);
         }
     }

     //连接数据库 返回Connection
    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //关闭资源
    /*
        1.ResultSet 结果集
        2.Statement 或 PrepareStatement
        3.Connection
     */
    public static void close(ResultSet set, Statement statement, Connection connection){
        try {
            if (set != null){
                set.close();
            }
            if (statement != null){
                statement.close();
            }
            if (connection != null){
                statement.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
