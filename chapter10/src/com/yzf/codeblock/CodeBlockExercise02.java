package com.yzf.codeblock;

public class CodeBlockExercise02 {
    public static void main(String[] args) {
        Test test = new Test();
//        1.静态成员sam初始话
//        2.static块执行
//        3.sam1 成员初始话
//        4.Test默认构造函数被调用
    }
}
class Sample{
    Sample(String s){
        System.out.println(s);
    }
    Sample(){
        System.out.println("Sample默认构造函数被调用");
    }
}
class Test {
    Sample sam1 = new Sample("sam1 成员初始话");
    static Sample sam = new Sample("静态成员sam初始化");
    static {
        System.out.println("static块执行");
        if(sam == null)
            System.out.println("sam is null");
    }

    Test(){
        System.out.println("Test默认构造函数被调用");
    }
}
