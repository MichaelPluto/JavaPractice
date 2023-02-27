package com.yzf.reder_;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_ {
    public static void main(String[] args) {

    }

    @Test
    //使用 FileReader读取 "d:\\story.txt"文件
    public void fileReader01() {
        String filePath = "d:\\\\story.txt";
        FileReader fileReader = null;//初始化对象
        int data = 0;
        try {
            //创建对象
            fileReader = new FileReader(filePath);
            //读取数据
            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void fileReader02() {
        String filePath = "d:\\\\story.txt";
        FileReader fileReader = null;
        int readlLen = 0;
        char[] date = new char[8];
        try {
            fileReader = new FileReader(filePath);
            while ((readlLen = fileReader.read(date)) != -1) {
                System.out.print(new String(date, 0, readlLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
