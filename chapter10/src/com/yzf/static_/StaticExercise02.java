package com.yzf.static_;

public class StaticExercise02 {
    public static void main(String[] args) {
        System.out.println("Number of total is" + Person01.getTotalPerson());
        Person01 person01 = new Person01();
        System.out.println("Number of total is" + Person01.getTotalPerson());
    }
}
class Person01 {
    private int id;
    private static int total = 0;
    public static int getTotalPerson(){
        //id++; 错误，注销
        return total;
    }
    public Person01(){//构造器
        total++;
        id = total;
    }
}