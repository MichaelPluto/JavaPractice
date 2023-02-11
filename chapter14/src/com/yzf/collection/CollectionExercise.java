package com.yzf.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionExercise {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Dog("刘芮", 21));
        col.add(new Dog("jack", 5));
        col.add(new Dog("mary", 18));
        //迭代器方法遍历
        Iterator iterator = col.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("小狗的信息为 " + next);
        }
        System.out.println("===================");
        //增强for循环
        for (Object dog : col) {
            System.out.println("小狗的信息为 " + dog);
        }
    }
}
class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}