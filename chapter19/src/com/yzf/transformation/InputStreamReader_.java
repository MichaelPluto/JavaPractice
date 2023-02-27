package com.yzf.transformation;

import java.io.*;

public class InputStreamReader_ {
    public static void main(String[] args) throws IOException {
        String path = "d:\\a.txt";
        BufferedReader buf = new BufferedReader(new InputStreamReader(new FileInputStream(path), "gbk"));
        String s = buf.readLine();
        System.out.println("读取到的信息为= " + s);
        buf.close();
    }
}
