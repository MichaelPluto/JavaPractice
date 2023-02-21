package com.yzf.inputstream;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream_ {
    public static void main(String[] args) {

    }
    //要求: 使用FileInputStream 读取 hello.txt文件，并将文件内容显示到控制台
    //方式一: 一个一个字节读取
    @Test
    public void  readFile01(){
        String filePath = "d:\\hello.txt";
        int read = 0;
        FileInputStream fileInputStream = null;
        try {
            //创建FileInputStream 对象，用于读取文件
            fileInputStream = new FileInputStream(filePath);
            //从该输入流读取一个字节的数据，如果没有输入可用，此方法将阻止
            //返回-1，表示读取完毕
            while ((read = fileInputStream.read()) != -1){
                System.out.print((char)read);//转成char显示
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //最后必须退出IO流
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    //方式二 以字节数组形式读取
    @Test
    public void  readFile02(){
        java.lang.String filePath = "d:\\hello.txt";
        int read = 0;
        byte[] bytes = new byte[8];
        FileInputStream fileInputStream = null;
        try {
            //创建FileInputStream 对象，用于读取文件
            fileInputStream = new FileInputStream(filePath);
            //从该输入流读取最多byte.length字节的数据到字节数组，如果没有输入可用，此方法将阻止
            //返回-1，表示读取完毕
            //读取正常，返回实际读取的字节数
            while ((read = fileInputStream.read(bytes)) != -1){
                System.out.print(new String(bytes,0,read));//转成String类型输出
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //最后必须退出IO流
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
