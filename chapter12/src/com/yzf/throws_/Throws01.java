package com.yzf.throws_;

import java.io.FileInputStream;

public class Throws01 {
    public static void main(String[] args) {

    }
    public void f1() throws Exception{
        /*
        1.异常为FileNotFoundException 编译异常
        2.可以使用 try-catch-finally
        3.可以使用throws，抛出异常让调用f1方法的调用者处理
        4.throws后面的异常类型可以是方法中产生的异常类型，也可以是它的父类
        5.throws 关键字后也可以是异常列表，即可以抛出多个异常
         */
        FileInputStream fis = new FileInputStream("d://aa.txt");
    }
}
