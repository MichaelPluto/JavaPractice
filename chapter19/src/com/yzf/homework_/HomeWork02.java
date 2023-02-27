package com.yzf.homework_;

import java.io.*;

public class HomeWork02 {
    public static void main(String[] args) throws IOException {
        String path = "d:\\story.txt";
        String line = "";
        BufferedReader buf = new BufferedReader(new InputStreamReader(new FileInputStream(path),"gbk"));
        int i = 1;
        while ((line = buf.readLine()) != null){
            System.out.println( i + " " +line);
            i++;
        }
        buf.close();
    }
}
