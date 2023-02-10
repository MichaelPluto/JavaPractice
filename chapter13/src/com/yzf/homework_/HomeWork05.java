package com.yzf.homework_;

public class HomeWork05 {
    public static void main(String[] args) {
        String s1 = "yzf";
        Animal a = new Animal(s1);
        Animal b = new Animal(s1);
        System.out.println(a == b);//F
        System.out.println(a.equals(b));//F 此时没有对equals进行重写 所以比较的是对象是否相等
        System.out.println(a.name == b.name);//T
        String s4 = new String("yzf");
        String s5 = "yzf";

        System.out.println(s1 == s4);//F
        System.out.println(s4 == s5);//F

        String t1 = "hello" + s1;
        String t2 = "helloyzf";
        System.out.println(t1.intern() == t2);//F
    }
}
class Animal{
    String name;

    public Animal(String name) {
        this.name = name;
    }
}
