package com.yzf.generic_;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GenericExercise01 {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("jack",12));
        students.add(new Student("tom",21));
        for (Student student : students) {
            System.out.println(student.getName() + "-" + student.getAge());
        }
        System.out.println("===hashmap===");
        HashMap<String, Student> map = new HashMap<>();
        map.put("jack",new Student("jack",12));
        map.put("tom",new Student("tom",21));
        Set<Map.Entry<String, Student>> entries = map.entrySet();
        for (Map.Entry<String, Student> entry : entries) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}