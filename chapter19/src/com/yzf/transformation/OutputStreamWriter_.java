package com.yzf.transformation;

import java.io.*;

public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        String path = "d:\\yzf.txt";
        String charSet = "gbk";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(path),charSet);
        osw.write("hello,杨质飞");
        osw.close();
        System.out.println("保存完毕");
    }
}
