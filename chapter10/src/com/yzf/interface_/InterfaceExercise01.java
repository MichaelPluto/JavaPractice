package com.yzf.interface_;

public class InterfaceExercise01 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.a);//a为 public
        System.out.println(A.a);//a为 static
        System.out.println(B.a);// B实现了A， 能够使用A接口内的属性
    }
}
interface A {
    int a = 23;
}
class B implements A {
}

