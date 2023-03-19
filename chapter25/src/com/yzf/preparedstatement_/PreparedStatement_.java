package com.yzf.preparedstatement_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

@SuppressWarnings({"all"})
public class PreparedStatement_ {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        //让用户输入管理员名和密码
        System.out.print("请输入管理员的名字: "); //next(): 当接收到 空格或者 '就是表示结束
        String admin_name = scanner.nextLine(); // 老师说明，如果希望看到 SQL 注入，这里需要用 nextLine
        System.out.print("请输入管理员的密码: ");
        String admin_pwd = scanner.nextLine();
        //通过 Properties 对象获取配置文件的信息
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));
        //获取相关的值
        String user = properties.getProperty("user");

        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        //1. 注册驱动
        Class.forName(driver);//建议写上
        //2. 得到连接
        Connection connection = DriverManager.getConnection(url, user, password);
        //3. 得到 Statement
        //组织 SqL
        String sql = "select name , pwd from admin where name = ? and pwd = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        // 给 ？赋值
        preparedStatement.setString(1,admin_name);
        preparedStatement.setString(2,admin_pwd);
        //4. 执行select语句 使用 excuteQuery
        // 这里的executeQuery()里不用加sql，因为sql在之前的preparedStatement里处理过了
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) { //如果查询到一条记录，则说明该管理存在
            System.out.println("恭喜， 登录成功");
        } else {
            System.out.println("对不起，登录失败");
        }

        //关闭连接

        preparedStatement.close();
        connection.close();
    }
}
