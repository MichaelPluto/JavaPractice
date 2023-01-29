package com.yzf.exception_;

public class ClassCastException {
    public static void main(String[] args) {
        A b = new B();
        B b1 = (B)b;
        C b2 = (C) b;
    }
}
class A{}
class B extends A{}
class C extends A{}