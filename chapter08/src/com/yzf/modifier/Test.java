package com.yzf.modifier;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.m1();//m1 是在A类为 public 所以可以在不同类中访问
        a.m2();
        a.m3();
        //a.m4(); m4方法是private类型 所以不能在不同类中访问

    }
}
