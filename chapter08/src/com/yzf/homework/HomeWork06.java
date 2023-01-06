package com.yzf.homework;

public class HomeWork06 {
    public static void main(String[] args) {
        Father father = new Father();
        Son son = new Son();
        father.f1();
        son.g2();

    }
}
class Grand {
    String name = "AA";
    private int age = 100;
    public void g1(){

    }
}
class Father extends Grand{
    String id ="001";
    private double score;
    public void f1(){
        //super 可以访问那些成员(属性和方法)
        System.out.println(super.name);//AA
        super.g1();
        //this 可以访问那些成员
        System.out.println(this.id);//001
        System.out.println(this.score);
        System.out.println(this.name);//AA
        this.g1();

    }
}
class Son extends Father{
    String name = "BB";
    public void g1(){

    }
    private void show(){
        //super 可以访问哪些成员
        System.out.println(super.id);
        System.out.println(super.name);//AA
        super.g1();//Grand类
        super.f1();//Father类
        //this 可以访问哪些成员
        System.out.println(this.name);//BB
        System.out.println(this.id);//001
        this.g1();
        this.f1();//Father类
    }
    public void g2(){
        show();
    }
}
