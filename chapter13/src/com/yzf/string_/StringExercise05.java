package com.yzf.string_;

public class StringExercise05 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "yzf";
        Person p2 = new Person();
        p2.name = "yzf";
        System.out.println(p1.name.equals(p2.name));//T
        System.out.println(p1.name == p2.name);//T
        System.out.println(p1.name == "yzf");//T
        System.out.println(p1 == p2);//F

        String s1 = new String("bcde");
        String s2 = new String("bcde");
        System.out.println(s1 == s2);//F
    }
}
class Person{
    public String name;
}
