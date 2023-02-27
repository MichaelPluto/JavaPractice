package com.yzf.properties_;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties03 {
    public static void main(String[] args) throws IOException {
        //使用Properties 创建 配置 修改 文件内容
        Properties properties = new Properties();
        //创建
        //如果该文件没有key就是创建
        // 如果有key 就是修改
        properties.setProperty("charset","utf8");
        properties.setProperty("user","杰克");
        properties.setProperty("pwd","001101");
        properties.setProperty("pwd", "123456");
        //将k-v储存文件中即可
        properties.store(new FileOutputStream("src\\mysql2.properties"),null);
        System.out.println("保存配置文件成功");
    }
}
