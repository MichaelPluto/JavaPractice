package com.yzf.encap;

import java.util.Scanner;

public class Encapsulation01 {
    //请大家看一个小程序(com.hspedu.encap: Encapsulation01.java),
    // 不能随便查看人的年龄,工资等隐私，并对设置的年龄进行合理的验证。年龄合理就设置，否则给默认
    //年龄, 必须在 1-120, 年龄， 工资不能直接查看 ， name 的长度在 2-6 字符 之间
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("杨质飞");
        person.setAge(22);
        person.setSal(15000);
        //System.out.println(person.info());
        Person 杨质飞 = new Person("杨质飞", 22, 15000);
        System.out.println(杨质飞.info());
        System.out.println("=========杨质飞的信息如上=========");


        //person.age = 3000 private 不能直接赋值修改
        //person.sal = 30000 同理

    }
}
class Person{
    public String name;
    private int age;
    private double sal;

    public Person() {
    }

    public Person(String name, int age, double sal) {
//        this.name = name;
//        this.age = age;
//        this.sal = sal;
        this.setName(name);
        this.setAge(age);
        this.setSal(sal);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        }else {
            System.out.println("输入的名字范围有误，将给予一个默认名字  刘芮");
            this.name = "刘芮";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 2 && age <= 120){
        this.age = age;
        }else{
            System.out.println("输入的年龄区间范围有误，将给予一个默认年龄 3");
            this.age = 3;
        }
    }

    public double getSal() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("输入密码");
        int i = myScanner.nextInt();
        if(i == 123456){
            System.out.println("密码正确");
        return sal;
        }else {
            System.out.println("输入密码有误");
            return -1;
        }
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public String  info(){
        return "名字=" + getName() + " " + "年龄=" + getAge()+ " " + "薪水=" + getSal();
    }
}

