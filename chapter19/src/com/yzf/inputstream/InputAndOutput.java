package com.yzf.inputstream;

import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args) {
        //System in 编译类型 InputStream
        //System in 运行类型 BufferedInputStream
        // 表示的是标准输入 键盘
        System.out.println(System.in.getClass());

        //System.out 编译类型 PrintStream
        //System.out 运行类型 PrintStream
        // 表示的是标准输出 键盘
        System.out.println(System.out.getClass());
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("name= " + name);
    }
}
