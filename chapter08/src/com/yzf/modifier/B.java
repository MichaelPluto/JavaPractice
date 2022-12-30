package com.yzf.modifier;

public class B {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("n1=" + a.n1 + " " + "n2=" + a.n2+ " "+ "n3=" + a.n3);
        //同包不同类可以访问 public protected 默认 但不能访问private(n4)

    }
}
