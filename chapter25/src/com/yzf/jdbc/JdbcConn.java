package com.yzf.jdbc;

import com.mysql.jdbc.Driver;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * java 连接 mysql的五种方式
 */
public class JdbcConn {
    @Test
    public void connect01() throws SQLException {
        Driver driver = new Driver(); //创建driver对象
        String url = "jdbc:mysql://localhost:3306/yzf_db02";
        // 将用户名和密码放入到Properties 对象
        Properties properties = new Properties();
        // user 和 password 是规定好的key 不能变
        properties.setProperty("user","root");
        properties.setProperty("password","a9090980");
        Connection connect = driver.connect(url, properties);
        System.out.println(connect);
    }
    @Test
    public void connect02() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        //使用反射加载 Driver类，动态加载更加灵活，减少依赖性
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver) aClass.newInstance();

        String url = "jdbc:mysql://localhost:3306/yzf_db02";
        // 将用户名和密码放入到Properties 对象
        Properties properties = new Properties();
        // user 和 password 是规定好的key 不能变
        properties.setProperty("user","root");
        properties.setProperty("password","a9090980");
        Connection connect = driver.connect(url, properties);
        System.out.println(connect);
    }

    @Test
    public void connect03() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        //用DriverManager 替换 Driver
        // 用 DriverManager统一管理
        //使用反射加载Driver
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver) aClass.newInstance();

        //创建 url 和 user password
        String url = "jdbc:mysql://localhost:3306/yzf_db02";
        String user = "root";
        String password = "a9090980";

        DriverManager.registerDriver(driver);

        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);
    }

    @Test
    public void connect04() throws ClassNotFoundException, SQLException {
        //使用Class.forName 自动完成注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        //创建url user password
        //创建 url 和 user password
        String url = "jdbc:mysql://localhost:3306/yzf_db02";
        String user = "root";
        String password = "a9090980";
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);
    }

    @Test
    public void connect05() throws IOException, SQLException, ClassNotFoundException {
        //在方式4的基础上增加配置文件，让连接mysql更灵活
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");

        Class.forName(driver);

        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);
    }
}
