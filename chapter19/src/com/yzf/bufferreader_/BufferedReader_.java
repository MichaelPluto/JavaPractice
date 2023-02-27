package com.yzf.bufferreader_;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedReader_ {
    public static void main(String[] args) throws Exception {
        String filePath = "d:\\story.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String line = "";
        while ((line = bufferedReader.readLine()) != null){//readline 按行读取
            System.out.println(line);
        }
        bufferedReader.close();//只用关闭外层流即可
    }
}
