package com.yzf.generic_;

import java.util.ArrayList;

public class GenericDetail {
    public static void main(String[] args) {
        //1.给泛型指向数据类型时，要求时引用类型，不能时基本数据类型
        ArrayList<Integer> list = new ArrayList<>();
        //ArrayList<int> list2 = new ArrayList<>(); 错误
        //2.因为E 指定了 A 类型，构造器传入了new()
        // 在给泛型指定具体类型后，可以传入该类型或者其子类型！！
        Pig<A> pig = new Pig<A>(new A());//指定了 E的泛型为 A类
            pig.f();//运行类型为A
        Pig<A> bPig = new Pig<A>(new B());// B为A子类，可以传入
            pig.f();//运行类型为B


        //3.泛型的使用类型
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<>();
        //推荐使用下面这种用法
        //如果时这样写，则默认泛型类型为Object
        ArrayList list3 = new ArrayList<>();
        //等价于  ArrayList<Object> list3 = new ArrayList<Object>();

    }
}
class A{}
class B extends A{}
class Pig<E>{
    E e;

    public Pig(E e) {
        this.e = e;
    }
     public void f(){
         System.out.println(e.getClass());
     }
}
