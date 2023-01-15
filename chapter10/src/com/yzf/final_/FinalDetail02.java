package com.yzf.final_;

public class FinalDetail02 {
    public static void main(String[] args) {
        System.out.println(Demo.n1);
    }
}
class Demo {
    //final and static 一起使用时候，不会使得类加载
    public final static int n1 = 100;
    static{
        System.out.println("杨质飞");//不会输出此语句
    }
}