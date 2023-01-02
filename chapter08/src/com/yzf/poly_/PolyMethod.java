package com.yzf.poly_;

public class PolyMethod {
    public static void main(String[] args) {
        B b = new B();
        A a = new A();
       //方法重载体现多态
        System.out.println(a.sum(1,3));
        System.out.println(a.sum(5,6,8));

       //方法重写体现多态
       b.say();//B say() 方法被调用
       a.say();//A say() 方法被调用
    }
}
class B {
    public void say(){
        System.out.println("B say() 方法被调用");
    }
}
class A extends B{
    public  int sum(int n1, int n2){
        return n1 + n2;
    }
    public int sum(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }
    public void say(){
        System.out.println("A say() 方法被调用");
    }
}
