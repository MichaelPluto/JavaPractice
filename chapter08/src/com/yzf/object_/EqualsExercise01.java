package com.yzf.object_;

public class EqualsExercise01 {
    public static void main(String[] args) {
        Person person1 = new Person("jack", 22, '男');
        Person person2 = new Person("jack", 26, '男');
        System.out.println(person1.equals(person2));
    }
}
class Person{
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean equals(Object obj){// 将比较对象作为传参传入
        if(this == obj){//若是同一个对象，直接返回true
            return true;
        }
        if(obj instanceof  Person){//若是传入的对象为 Person类
            //向下转型，因为传入的是Object类，所以若判断传入对象为Person类的话
            //需要将Object向下转型为Person类，这样才能使用Person类的各个属性
            Person p = (Person)obj;
            //this 指person1 p 指传入的person2
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
        }
        return false;
    }
}
