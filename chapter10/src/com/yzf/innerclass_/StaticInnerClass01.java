package com.yzf.innerclass_;

public class StaticInnerClass01 {
    public static void main(String[] args) {
        Outer08 outer08 = new Outer08();
//        outer08.hi();
        //外部其他类访问静态内部类规则和成员内部类一样
        //法一

        Outer08.Inner08 inner08 = new Outer08.Inner08();
        inner08.say();
        //法二
        //创建一个新方法返回 Inner08对象
        outer08.hi();
    }
}
class Outer08{
    private int n1 = 11;
    private static String name = "jack";
    //2.可以添加修饰符，因为相当于外部类的成员
    public static class Inner08{//静态内部类
        //1.可以直接访问外部类所有的静态成员，但不能访问非静态的
        public void say(){
            //System.out.println(n1); 不能访问
            System.out.println(name);
        }
    }
    //3.作用域为整个类
    public void hi(){
        new Inner08().say();
    }
}