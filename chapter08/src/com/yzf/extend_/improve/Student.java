package com.yzf.extend_.improve;

public class Student {
    //共同的属性
    public String name;
    public int age;
    private double score;
    //共同的方法
    public void setScore(double score) {
        this.score = score;
    }
    public void showInfo(){
        System.out.println("学生名"+ " " + name+ " " + "年龄" +" " + age + " " +  "成绩" + " " + score);
    }
}
