package com.yzf.preparedstatement_;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
@SuppressWarnings({"all"})
public class exercise {
    public static void main(String[] args) throws Exception {
//        Scanner scanner = new Scanner(System.in);
//        //让用户输入管理员名和密码
//        System.out.print("请输入管理员的名字: "); //next(): 当接收到 空格或者 '就是表示结束
//        String admin_name = scanner.nextLine(); // 老师说明，如果希望看到 SQL 注入，这里需要用 nextLine
//        String admin_pwd = scanner.nextLine();
        //获取配置信息
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));
        //获取相关的值
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        //得到连接
        Connection connection = DriverManager.getConnection(url,user,password);

        //sql语句
        //String sql = "insert into admin values(?,?)"; 添加
        //String sql = "update admin set name = ? where name = 'tom'"; 修改
        //String sql = "delete from admin where name = ?"; 删除
        String sql = "select * from admin";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //设置 ？值
//        preparedStatement.setString(1,admin_name);
//        preparedStatement.setString(2,admin_pwd);
//        int row = preparedStatement.executeUpdate();
//        System.out.println(row > 0 ? "成功" : "失败");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            String name = resultSet.getString(1);
            String pwd = resultSet.getString(2);
            System.out.println(name + "\t" + pwd + "\t");
        }
        preparedStatement.close();
        connection.close();

    }
}
