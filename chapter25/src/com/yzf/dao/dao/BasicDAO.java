package com.yzf.dao.dao;

import com.yzf.dao.utils.JDBCUtilsByDruid;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * 开发BasicDAO类 是其他DAO的父类
 */
public class BasicDAO<T> {

    private QueryRunner qr = new QueryRunner();

    //开发通用的 dml方法 针对任意表
    public int update(String sql, Object... parameters){

        Connection connection = null;

        try {
            connection = JDBCUtilsByDruid.getConnection();
            int update = qr.update(connection, sql, parameters);
            return update;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JDBCUtilsByDruid.close(null,null,connection);
        }
    }

    //开发通用的 select方法(多行) 针对任意表

    public List<T> queryMulti(String sql,Class<T> clazz,Object... parameters){

        Connection connection = null;

        try {
            connection = JDBCUtilsByDruid.getConnection();
            return qr.query(connection, sql, new BeanListHandler<T>(clazz), parameters);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsByDruid.close(null,null,connection);
        }
    }

    //开发通用的 select方法(单行) 针对任意表

    public T querySingle(String sql, Class<T> clazz, Object... parameters){
        Connection connection = null;

        try {
            connection = JDBCUtilsByDruid.getConnection();
           return qr.query(connection,sql,new BeanHandler<T>(clazz),parameters);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsByDruid.close(null,null,connection);
        }
    }

    //开发通用的 select方法(单行单列) 针对任意表

    public Object queryScalar(String sql, Object... parameters){

        Connection connection = null;

        try {
            connection = JDBCUtilsByDruid.getConnection();
            return qr.query(connection,sql,new ScalarHandler(),parameters);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtilsByDruid.close(null,null,connection);
        }
    }
}
