package com.yzf.codeblock;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class CodeBlockDetail03 {
    public static void main(String[] args) {
        BBB bbb = new BBB();
    }
}
class AAA{
    public AAA(){
        System.out.println("AAA()构造器被调用");//4
    }
    {
        System.out.println("AAA代码块被调用");//3
    }
    static {
        System.out.println("AAA静态代码块被调用");//1
    }

}
class BBB extends AAA{
    public BBB(){
        System.out.println("BBB()构造器被调用");//6
    }
    {
        System.out.println("BBB代码块被调用");//5
    }
    static {
        System.out.println("BBB静态代码块被调用");//2
    }
}
class CCC {
    private int n1 = 100;
    private static int n2 = 200;

    private void hi1(){
        System.out.println("...");
    }
    private static void hi2(){
        System.out.println(",,,");
    }
    static {
        //System.out.println(n1);//错误
        System.out.println(n2);
        //hi1();//错误
        hi2();
    }
    {
        System.out.println(n1);
        System.out.println(n2);
        hi1();
        hi2();
    }
}