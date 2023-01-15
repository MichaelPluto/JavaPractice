package com.yzf.abstract_;

public class AbstractDetail01 {
    //new A();//抽象类不能被实例化
    public static void main(String[] args) {

    }
}
abstract class A {
    //抽象类可以没有abstract方法
    //可以有普通的方法
    public void hi(){
        System.out.println("hi");
    }
}
//当一个类中存在抽象方法时，需要声明为abstract类
abstract class B {
    public abstract void hi();

}
//abstract 只能修饰类和方法，不能修饰属性和其他
class C {
    //public abstract int n1 = 2;
}


