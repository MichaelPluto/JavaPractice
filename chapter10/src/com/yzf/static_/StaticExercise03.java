package com.yzf.static_;

class Person { //StaticExercise03.java 2min 看
    private int id;
    private static int total = 0;
    public static void setTotalPerson(int total){
// this.total = total;//错误，因为在 static 方法中，不可以使用 this 关键字
        Person.total = total;
    }
    public Person() {//构造器
        total++;
        id = total;
    }
    public static void hi(){
        System.out.println("total=" + total);
    }
}
public class StaticExercise03 {
    public static void main(String[] args) {
        Person.setTotalPerson(3);
        new Person(); //最后 total 的值就是 4
        Person.hi();
    }
}