package com.yzf.transformation;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter_ {
    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileWriter("d:\\f2.txt"));
        printWriter.print("你好，新宿");
        printWriter.close();
    }
}
