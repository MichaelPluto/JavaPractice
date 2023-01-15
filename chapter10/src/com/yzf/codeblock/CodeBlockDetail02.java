package com.yzf.codeblock;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
        B b = new B();

    }
}
class A {
    //静态
    public static int age = getAge();

    static {
        System.out.println("A类的静态代码块被执行");//2.
    }

    public static int getAge(){
        System.out.println("getAge方法被执行");//1.
        return 100;
    }
    //普通
    public int price = get2Price();

    {
        System.out.println("A类的普通代码块被执行");//4
    }

    public int get2Price(){
        System.out.println("get2Price方法被执行");//3
        return 200;
    }
}
class B extends A{
    static{
        System.out.println("B类的静态代码块被调用");
    }
    {
        System.out.println("B类的普通代码块被调用");
    }
}
