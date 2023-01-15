package com.yzf.single_;
/*
    演示懒汉式单例模式
 */
public class SingleTon02 {
    public static void main(String[] args) {
        //System.out.println(Cat.n1);
        Cat instance = Cat.getInstance();
        System.out.println(instance);
        Cat instance1 = Cat.getInstance();
        System.out.println(instance1);
        System.out.println(instance == instance1);
    }
}
class Cat {
    private  String name;
    public static int n1 = 999;
    private Cat(String name) {
        this.name = name;
        System.out.println("构造器被调用");
    }

    private static Cat cat;//懒汉式，先声明

    public static Cat getInstance(){
        if(cat == null){
            cat = new Cat("刘芮");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
