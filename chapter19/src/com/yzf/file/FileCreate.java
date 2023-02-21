package com.yzf.file;


import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {

    }

    @Test
    //方式1  new File(String pathname) 根据路径构建一个file对象
    public void creat01() {
        String pathname = "d:\\news1.txt";
        File file1 = new File(pathname);
        try {
            file1.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    //方式二 new File(File parent,String child) 根据父目录文件 + 子路径构建
    public void creat02() {
        File parent = new File("d:\\");
        String child = "news2.txt";
        File file2 = new File(parent, child);
        try {
            file2.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    //方式三 new File(String parent,String child) 根据父目录 + 子路径构建
    public void creat03() {
        String parent = "d:\\";
        String child = "news3.txt";
        File file3 = new File(parent, child);
        try {
            file3.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
