package com.yzf.generic_;

import java.util.ArrayList;

public class Generic02 {
    public static void main(String[] args) {
        ArrayList<Dog2> list = new ArrayList();
        list.add(new Dog2("jack", 12));
        list.add(new Dog2("tom", 22));
        //如果此时不小新输入一个Cat类,就会报错，可以使用泛型来规避这类问题
        //list.add(new Cat());
    }
}
class Dog2 {
    private String name;
    private int age;

    public Dog2(String name, int age) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Cat{}

