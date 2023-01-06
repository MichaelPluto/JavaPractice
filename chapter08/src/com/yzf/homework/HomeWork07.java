package com.yzf.homework;

public class HomeWork07 {
    public static void main(String[] args) {
        new Demo().test();
        new Demo("john").test();
    }
}
class Test {
    String name = "Rose";
    Test(){
        System.out.println("Test");
    }
    Test(String name){
        this.name = name; //属性没有动态绑定机制 此刻将 Rose 改为 john
    }
}
class Demo extends Test {
    String name = "Jack";
    Demo(){
        super();//会执行父类的无参构造器  （1）输出Test
        System.out.println("Demo"); // （2）Demo

    }
    Demo(String s){
        super(s);// 会找父类的有参构造器
    }
    public void test(){
        System.out.println(super.name);// 输出父类的name（3）Rose          （5）输出 john
        System.out.println(this.name);// 输出本类的name （4）Jack          （6）输出 Jack
    }
}
