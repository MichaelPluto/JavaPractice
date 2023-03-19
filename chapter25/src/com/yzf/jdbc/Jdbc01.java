package com.yzf.jdbc;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * 第一个Jdbc程序,完成简单的操作
 */
public class Jdbc01 {
    public static void main(String[] args) throws SQLException {

        // 1.注册驱动
        Driver driver = new Driver(); //创建driver对象

        // 2.得到连接
        //(1) jdbc:mysql:// 规定好表示协议，通过 jdbc 的方式连接 mysql
        //(2) localhost 主机，可以是 ip 地址
        //(3) 3306 表示 mysql 监听的端口
        //(4) hsp_db02 连接到 mysql dbms 的哪个数据库
        //(5) mysql 的连接本质就是前面学过的 socket 连接
        String url = "jdbc:mysql://localhost:3306/yzf_db02";
        // 将用户名和密码放入到Properties 对象
        Properties properties = new Properties();
        // user 和 password 是规定好的key 不能变
        properties.setProperty("user","root");
        properties.setProperty("password","a9090980");
        Connection connect = driver.connect(url, properties);
        // 3.执行sql
        //String sql = "insert into actor values(null,'刘德华','男','1970-11-1','110')"; //添加
        //String sql = "update actor set name = '周星驰' where id = 1"; // 修改
        String sql = "delete from actor where id = 1"; //删除
        // statement 用于执行静态SQL语句并返回其生成的结果的对象
        Statement statement = connect.createStatement();
        int row = statement.executeUpdate(sql);// 如果是 dml语句，返回的就是影响行数
        System.out.println(row > 0 ? "成功" : "失败");
        // 4.关闭连接资源
        statement.close();
        connect.close();
    }
}
