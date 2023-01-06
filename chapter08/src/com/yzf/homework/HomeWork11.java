package com.yzf.homework;

public class HomeWork11 {
    public static void main(String[] args) {
        //向上转型
        Person1 p1 = new Student();
        p1.eat();
        p1.run();
        //向下转型
        Student p2 = (Student) p1;
        p2.run();
        p2.eat();
        p2.study();
    }
}
class Person1{
    public void run(){
        System.out.println("person run");
    }
    public void eat(){
        System.out.println("person eat");
    }
}
class Student extends Person1{
    @Override
    public void run() {
        System.out.println("student run");
    }
    public void study(){
        System.out.println("student study");
    }
}