package com.yzf.homework_;

public class HomeWork05 {
    public static void main(String[] args) {
        A a = new A();
        a.hi();
    }
}
class A {
    private String name = "jack";
    public void hi(){
        class B {
            private  final String name = "mary";
            public void show(){
                System.out.println(name);
                System.out.println(A.this.name);
            }
        }
        B b = new B();
        b.show();
    }

}
