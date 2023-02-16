package com.yzf.generic_;

import java.util.ArrayList;
import java.util.Comparator;


public class GenericExercise02 {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("mac",2000, new MyDate(2002,11,5)));
        list.add(new Employee("mary",20000, new MyDate(1985,10,5)));
        list.add(new Employee("mac",25000, new MyDate(2002,11,1)));
        list.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee em1, Employee em2) {
                //compareTo 比较字符串大小
                int i = em1.getName().compareTo(em2.getName());
                if (i != 0){
                    return i;
                }
                return em1.getBirthday().compareTo(em2.getBirthday());
                //此时的 compareTo是MyDate里的方法

            }
        });
        System.out.println(list);
    }
}
class MyDate{
    private int year;
    private int month;
    private int day;
    public int compareTo(MyDate o){
        int i = year - o.getYear();
        if (i != 0){
            return i;
        }
            int i1 = month - o.getMonth();
            if (i1 != 0){ return i1;
        }
        int i2 = day - o.getDay();
            return i2;
    }
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
class Employee {
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}