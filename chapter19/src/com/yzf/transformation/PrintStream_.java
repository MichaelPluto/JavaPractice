package com.yzf.transformation;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStream_ {
    public static void main(String[] args) throws IOException {

        PrintStream out = System.out;
        //在默认情况下，PrintStream 输出数据的位置是 标准输出，即显示器
        out.print("jakc,hello");
        //因为print底层 使用的是write 所以我们可以直接调用write进行打印输出
        out.write("\n杨质飞，你好".getBytes());

        //可以修改打印流输出的位置/设备
        System.setOut(new PrintStream("d:\\fi.txt"));
        System.out.print("努力学日语到n2");
        out.close();
    }
}
