package com.yzf.debug_;

public class DebugExercise {
    public static void main(String[] args) {
        Person person = new Person("jack", 22);
        System.out.println(person);

    }
}
class Person{
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
