package com.yzf.jdbc.datesource;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 演示C3P0使用
 */
public class C3P0 {

    @Test
    //方式1 : 相关参数，在程序中指定 user url password
    public void test01() throws Exception {

        //1.创建一个数据源对象
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        //2.通过配置文件mysql.properties 获取相关连接的信息
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));
        //读取相关的属性值
        String url = properties.getProperty("url");
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");

        //给数据源 comboPooledDataSource 设置相关参数
        //注意连接管理时有 comboPooledDataSource 来管理
        comboPooledDataSource.setDriverClass(driver);
        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setUser(user);
        comboPooledDataSource.setPassword(password);

        //设置初始化连接
        comboPooledDataSource.setInitialPoolSize(10);//一开始会给十个连接
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            //最大连接数
            comboPooledDataSource.setMaxPoolSize(50);// 最多只能有50个连接，超过50的连接会形成等待队列
            Connection connection = comboPooledDataSource.getConnection();// 这个方法就是从 DataSource 接口实现
            connection.close();
        }
        long end = System.currentTimeMillis();
        System.out.println("共计时间 "  + (end - start));
    }
    @Test
    public void test02() throws SQLException {

        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource("yzf");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            Connection connection = comboPooledDataSource.getConnection();
            //System.out.println("连接成功");
            connection.close();
        }
        long end = System.currentTimeMillis();
        System.out.println("共计时间 "  + (end - start));//1466
    }

}
