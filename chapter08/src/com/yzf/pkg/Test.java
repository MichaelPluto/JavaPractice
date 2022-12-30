package com.yzf.pkg;

import com.yzf.modifier.A;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.n1);//不同包只能访问 public 不能访问 protected 默认 和private
        a.m1();//m1为public 所以可以访问
    }
}
