package com.yzf.homework;

public class HomeWork01 {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("jack", 25, "程序员");
        people[1] = new Person("tom", 54, "主管");
        people[2] = new Person("杨质飞", 23, "董事长");

        Person temp = null;//临时变量，用于交换
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = 0; j < people.length - i - 1; j++) {
                if(people[j].getAge() < people[j+1].getAge()){
                    temp =  people[j];
                    people[j] = people[j+1];
                    people[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
    }

}

class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
