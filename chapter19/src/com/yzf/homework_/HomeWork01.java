package com.yzf.homework_;

import java.io.*;

public class HomeWork01 {
    public static void main(String[] args) throws IOException {
        String path = "d:\\mytemp";
        File file = new File(path);
        //判断
        if (!file.exists()){
            if (file.mkdirs()){
                System.out.println("创建成功");
            }else {
                System.out.println("创建失败");
            }
        }
        //在"d:\\mytemp" 下创建文件 hello.txt
        String filePath = "d:\\mytemp\\hello.txt";
        File file1 = new File(filePath);
        //判断
        if (!file1.exists()){
            if (file1.createNewFile()){
                System.out.println("创建hello.txt");
                BufferedWriter buf = new BufferedWriter(new FileWriter(filePath));
                buf.write("hello,world");
                buf.close();
            }else {
                System.out.println("创建失败");
            }
        }else {
            System.out.println("已存在");
        }
    }

}
