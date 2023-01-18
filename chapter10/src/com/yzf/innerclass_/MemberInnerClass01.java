package com.yzf.innerclass_;

public class MemberInnerClass01 {
    public static void main(String[] args) {
        new Outer06().test();
    }
}
class Outer06 {
    private int n1 = 10;
    public String name;
    //成员内部类，相当于Outer06的一个成员
    class Inner01{
        public void say(){
            System.out.println("我是大帅哥？");
        }
    }

    public void test(){
        new Inner01().say();
    }
}
