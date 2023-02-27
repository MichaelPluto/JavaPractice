package com.yzf.properties_;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Properties02 {
        //专门用英语读写配置文件的集合类
        /**
         * 配置文件格式
         * 键=值
         * 键=值 中间没有空格，值也不用引号引用
         */
        /**
         * Properties 常用方法
         * load：加载配置文件的键值对到Properties对象
         * list：将数据显示到指定设备
         * getProperty(key)：根据键获取值
         * setProperty(key,value)：设置键值对到Properties对象
         */
        public static void main(String[] args) throws IOException {
            //1. 创建Properties对象
            Properties properties = new Properties();
            //2. 加载指定配置文件
            properties.load(new FileReader("src\\mysql.properties"));
            //3. 把k-v显示到控制台
            properties.list(System.out);
            //4. 根据key值 获取对应的值
            String user = properties.getProperty("user");
            String pwd = properties.getProperty("pwd");
            System.out.println("用户是 " + user + " " + "密码是 " + pwd);

        }
}
