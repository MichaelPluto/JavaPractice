package com.yzf.jdbc.datesource;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.jupiter.api.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.util.Properties;

/**
 * 演示druid使用
 */

public class Druid_ {
    @Test
    public void testDruid() throws Exception {
        //1.引入jar包
        //2.加入 配置文件 ，将该文件放入src目录
        //3.创建Properties对象 读取配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\druid.properties"));

        //4.创建一个指定参数的数据库连接池 Druid连接池
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {

            Connection connection = dataSource.getConnection();
            //System.out.println("连接成功");
            connection.close();
        }
        long end = System.currentTimeMillis();
        System.out.println("共计时间 "  + (end - start));//376
    }
}