package com.yzf.transformation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CodeQuestion {
    public static void main(String[] args) throws IOException {
        //读取 d:\\a.txt 文件到程序
        String path = "d:\\\\a.txt";
        BufferedReader buf = new BufferedReader(new FileReader(path));
        String s = buf.readLine();
        System.out.println("读取到的内容为= " + s);
        buf.close();
    }
}
