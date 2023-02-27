package com.yzf.writer_;

import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_ {
    public static void main(String[] args) {

    }
    @Test
    public void fileWriter(){
        String filePath = "d:\\note.txt";
        FileWriter fileWriter = null;//初始化对象
        char[] chars = {'我','是','你','的'};
        try {
            fileWriter = new FileWriter(filePath);
            //1.write(int) 写入单个字符
            fileWriter.write("杨");
            //2.write(char[]) 写入指定数组
            fileWriter.write(chars);
            //3.write(char[],off,len) 写入指定数组的指定部分
            fileWriter.write(chars,0,3);
            //4.write(string) 写入整个字符串
            fileWriter.write("哈哈哈哈哈哈疯狂");
            //5.write(string,off,len) 写入字符串的指定部分
            fileWriter.write("上海北京澳门香港",0,5);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
