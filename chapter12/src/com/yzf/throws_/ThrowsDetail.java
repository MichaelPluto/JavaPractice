package com.yzf.throws_;

import java.io.FileInputStream;
import java.nio.file.FileAlreadyExistsException;

public class ThrowsDetail {
    public static void main(String[] args) {
        //f2();
    }
    public static void f1(){
        /*
        1.编译异常，程序中必须处理
        2.对于运行异常，程序中没有处理则是默认用throws方法处理
         */
        int n1 = 10;
        int n2 = 0;
        int res = n1 / n2;
    }
    public static void f2() throws FileAlreadyExistsException{
        //f3();
        //f3()方法抛出的是一个编译异常，所以调用者f1()此时就必须去处理这个异常
    }
    public static void f3() throws FileAlreadyExistsException{
//        FileInputStream fis = new FileInputStream("d://aa.txt");
    }
    public static void f4(){
        f5();
        //此时不报错原因是，f5()抛出的是一个运行异常，系统默认会用throws方法处理掉

    }
    public static void f5() throws ArithmeticException{

    }
    class Father{
        public void method() throws RuntimeException{

        }
    }
    class Son extends Father{
        //3.子类重写父类方法，对抛出的异常规定：子类重写的方法所抛出的异常要么与父类一样
        //要么为其父类异常的子类
        @Override
        public void method() throws NullPointerException {

        }
    }

}
