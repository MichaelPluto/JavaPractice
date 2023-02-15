package com.yzf.generic_;

import java.util.ArrayList;

public class Generic01Improve {
    public static void main(String[] args) {
        ArrayList<Dog1> list = new ArrayList<>();
        list.add(new Dog1("jack", 12));
        list.add(new Dog1("tom", 22));
        for (Dog1 dog1 : list) {
            System.out.println(dog1.getName() + "-" + dog1.getAge());
        }
    }
}
class Dog1 {
    private String name;
    private int age;

    public Dog1(String name, int age) {
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