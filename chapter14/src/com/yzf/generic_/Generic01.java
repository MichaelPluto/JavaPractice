package com.yzf.generic_;

import java.util.ArrayList;

public class Generic01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Dog("jack", 12));
        list.add(new Dog("tom", 22));
        for (Object o : list) {
            Dog o1 = (Dog) o;
            System.out.println(o1.getName() +"-"+ o1.getAge());
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