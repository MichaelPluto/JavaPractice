package com.yzf.extend_;

public class ExtendDetail {
    public static void main(String[] args) {
        System.out.println("=====第一个对象=====");
        Sub sub = new Sub();
        System.out.println("=====第二个对象=====");
        Sub sub1 = new Sub("jack");
        //sub.sayOk();
        System.out.println("=====第三个对象=====");
        Sub sub2 = new Sub("king",65);
        System.out.println("=====第四个对象=====");
        Sub sub3 = new Sub("刘芮" ,26);


    }
}
