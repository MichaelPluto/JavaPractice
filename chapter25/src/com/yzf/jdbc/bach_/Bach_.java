package com.yzf.jdbc.bach_;

import com.yzf.utils.JDBCUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Bach_ {

    @Test
    public void noBachAdd() throws Exception {
        //获取连接
        Connection connection = JDBCUtils.getConnection();
        String sql = "insert into admin2 values(null,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        long start = System.currentTimeMillis();//开始时间
        for (int i = 0; i < 5000; i++) {
            preparedStatement.setString(1,"tom" + i);
            preparedStatement.setString(2,"123");
            preparedStatement.executeUpdate();
        }
        long end = System.currentTimeMillis();//结束时间
        System.out.println("共计时间= " + (end - start));
        //关闭连接
        JDBCUtils.close(null,preparedStatement,connection);
    }

    @Test
    public void BachAdd() throws Exception {
        //获取连接
        Connection connection = JDBCUtils.getConnection();
        connection.setAutoCommit(false);
        String sql = "insert into admin2 values(null,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        long start = System.currentTimeMillis();//开始时间
        for (int i = 0; i < 5000; i++) {
            preparedStatement.setString(1,"tom" + i);
            preparedStatement.setString(2,"123");
           //将sql语句加入到批处理包中
            preparedStatement.addBatch();
            //当有1000条记录时，再批处理
            if ((i + 1) % 1000 == 0){// 满1000条sql
                preparedStatement.executeBatch();
                //再清空
                preparedStatement.clearBatch();
            }
        }
        connection.commit();
        long end = System.currentTimeMillis();//结束时间
        System.out.println("共计时间= " + (end - start));
        //关闭连接
        JDBCUtils.close(null,preparedStatement,connection);
    }
}
