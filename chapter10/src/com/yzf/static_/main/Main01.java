package com.yzf.static_.main;

public class Main01 {
    private static String name = "杨质飞大帅哥";
    private int age = 22;
    private static void hi(){
        System.out.println("hi方法");
    }
    private void cry(){
        System.out.println("cry方法");
    }
    public static void main(String[] args) {
        System.out.println("name=" + name);
        //静态方法只能访问静态属性
        //System.out.println("age=" + age);
        hi();
        //静态方法只能访问静态的方法
        //cry();
        //若要访问普通的成员 则需要实例化对象
        System.out.println(new Main01().age);
        new Main01().cry();
    }
}
