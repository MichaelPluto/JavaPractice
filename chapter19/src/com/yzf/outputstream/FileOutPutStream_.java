package com.yzf.outputstream;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStream_ {
    public static void main(String[] args) {

    }
    //要求，使用FileOutPutStream 在 a.txt文件，写入 "hello,world"
    //如果文件不存在，会自动创建文件
    @Test
    public void FilePut(){
        String filePath = "d:\\a.txt";
        FileOutputStream fileOutputStream = null;
        try {
            //1.new FileOutputStream(filePath)创建方式，写入内容时会覆盖原来的内容
            //2.new FileOutputStream(filePath,true)创建方式，时会将内容拼接起来，原理是append
            //每执行一次，输入文件的内容都会被拼接起来
            fileOutputStream = new FileOutputStream(filePath,true);
            //方式一，一个一个字节输入 wirte(int b)
            //fileOutputStream.write('H');

            //方式二，写入字符串 wirte(byte[])
            String str = "hello,world";
            //fileOutputStream.write(str.getBytes());//str.getBytes()
            //方法三，可以指定根据offset指定输入的值
            fileOutputStream.write(str.getBytes(),0,3);//会输入前三个值
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
