package com.yzf.abstract_;

public class Abstract01 {
    public static void main(String[] args) {

    }
}
abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    //抽象方法即是没有方法体的方法
    //当一个类中存在抽象方法时，需要声明为abstract类
    //一般来说，抽象类会被继承，由其子类来实现抽象方法
    //也可以这样理解。抽象类就是给子类提供重写方法的一个类
    public abstract void eat();
}
