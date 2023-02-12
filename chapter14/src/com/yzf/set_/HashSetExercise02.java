package com.yzf.set_;

import java.util.HashSet;
import java.util.Objects;
@SuppressWarnings({"all"})
public class HashSetExercise02 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(new MyDate("jack",25000,2000,11,1));
        set.add(new MyDate("jack",5000,2002,11,1));
        set.add(new MyDate("jack",25000,2000,11,1));
        set.add(new MyDate("tom",2000,1999,12,15));
        System.out.println(set);
    }
}
class Employee1{
    private String name;
    private double sal;

    public Employee1(String name, double sal) {
        this.name = name;
        this.sal = sal;
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

    @Override
    public String toString() {
        return "name=" + name + " " +  "sal=" + sal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee1 employee1 = (Employee1) o;
        return Objects.equals(name, employee1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
class MyDate extends Employee1{
    private int year;
    private int month;
    private int day;

    public MyDate(String name, double sal, int year, int month, int day) {
        super(name, sal);
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year &&
                month == myDate.month &&
                day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), year, month, day);
    }

    @Override
    public String toString() {
        return "MyDate{" + "name=" + getName() + ", salary=" + getSal() + ", year=" + year + ", month=" + month + ", day=" + day + '}';
    }
}


