package com.yzf.jdbc.datesource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class DBUtils_USE {
    //演示 apache-dbutils + druid 完成 返回的结果时多行记录 返回的时 对象集合
    @Test
    public void testQueryMany() throws SQLException {

        //1.得到连接
        Connection connection = JDBCUtilsByDruid.getConnection();

        //2.使用 DBUtils 类和接口，先引入DBUtils相关的jar 加入到本Project
        //3. 创建 QueryRunner
        QueryRunner queryRunner = new QueryRunner();
        String sql = "select * from actor where id >= ?";
        //4.执行相关的方法，返回ArrayList 结果集
        /*
          (1)query 方法就是执行sql语句 得到resultset ---封装到--> ArrayList集合中
          (2) 返回集合
          (3) connection:连接
          (4) sql: 执行sql语句
          (5) new BeanListHandler<>(Actor.class) : 将resultset -> Actor对象-> 封装到ArrayList集合中
                   底层使用反射机制获取Actor类的属性，然后再进行封装
          (6) 底层得到 resultset，会在query 关闭，也会关闭 PreparedStatement
         */
        //查询多条记录->返回多条对象->用 BeanListHandler
        List<Actor> list =
                queryRunner.query(connection, sql, new BeanListHandler<>(Actor.class), 1);

        for (Actor actor : list) {
            System.out.println(actor);//输出集合信息
        }

        //释放连接资源
        JDBCUtilsByDruid.close(null, null, connection);
    }


    //演示 apache-dbutils + druid 完成 返回的结果时单行记录(单个对象)
    @Test
    public void testQuerySingle() throws SQLException {
        Connection connection = JDBCUtilsByDruid.getConnection();
        QueryRunner queryRunner = new QueryRunner();
        String sql = "select * from actor where id = ?";

        Actor query = queryRunner.query(connection, sql, new BeanHandler<>(Actor.class), 4);
        System.out.println(query);

        JDBCUtilsByDruid.close(null, null, connection);
    }

    //演示 apache-dbutils + druid 完成 返回的结果时单行单列- 返回的时Object
    @Test
    public void testScalar() throws SQLException {

        Connection connection = JDBCUtilsByDruid.getConnection();

        QueryRunner queryRunner = new QueryRunner();
        String sql = "select name from actor where id = ?";

        Object obj = queryRunner.query(connection, sql, new ScalarHandler(), 4);
        System.out.println(obj);

        JDBCUtilsByDruid.close(null, null, connection);
    }

    //演示 apache-dbutils + druid 完成 dml操作
    @Test
    public void testDML() throws SQLException {
        Connection connection = JDBCUtilsByDruid.getConnection();

        QueryRunner queryRunner = new QueryRunner();
        String sql = "delete from actor where id = ?";
        /*
         (1) 执行dml操作 是 queryRunner.update 增删改
         (2) 返回的值是受影响的行数
         */
        //int affectedRow = queryRunner.update(connection, sql, "林青霞", "女", "1995-9-10", "122");
        int affectedRow = queryRunner.update(connection, sql, 4);
        System.out.println(affectedRow > 0 ? "执行成功" : "执行没有影响到表");


        JDBCUtilsByDruid.close(null, null, connection);
    }
}
