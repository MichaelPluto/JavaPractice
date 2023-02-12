package com.yzf.set_;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@SuppressWarnings({"all"})
public class HashSetExercise {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(new Employee("jack",22));
        set.add(new Employee("tom",21));
        set.add(new Employee("jack",22));
        set.add(new Employee("jack",21));
        System.out.println(set);
    }
}
class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" + "name=" + name  + " age=" + age + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}