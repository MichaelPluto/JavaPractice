package com.yzf.jdbc;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class exercise {
    @Test
    public void exercise01() throws IOException, ClassNotFoundException, SQLException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        Class.forName(driver);

        Connection connection = DriverManager.getConnection(url, user, password);

//      String sql = "insert into actor values(null,'刘德华','男','1970-11-1','110')," +
//                        "(null,'周星驰','男','1972-11-1','120')," +
//                        "(null,'周润发','男','1971-10-9','119')";
       String sql = "delete from actor where id = 3";
        Statement statement = connection.createStatement();
        int row = statement.executeUpdate(sql);
        System.out.println(row > 0 ? "成功" : "失败");
        statement.close();
        connection.close();

    }
}
