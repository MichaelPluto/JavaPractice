package com.yzf.homework;

public class HomeWork13 {
    public static void main(String[] args) {
        Person2[] people = new Person2[4];
        people[0] = new Student1("jack", '男', 21, 15030119);
        people[1] = new Student1("Tom", '女', 22, 15030118);
        people[2] = new Teacher1("mars", '男', 45, 10);
        people[3] = new Teacher1("jack", '男', 30, 6);
            Person2 temp = null;
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = 0; j < people.length - i - 1; j++) {
                if(people[j].getAge() < people[j+1].getAge()){
                    temp = people[j+1];
                    people[j+1] = people[j];
                    people[j] = temp;
                }
            }
            }
        for (int j = 0; j < people.length; j++) {
            System.out.println(people[j].printlnfo());
            people[j].play();
            people[j].tool(people[j]);
        }
    }
}
class Person2{
    private String name;
    private char gender;
    private int age;
    public String printlnfo(){
            return "姓名=" + getName()+" "+"性别" + getGender()+" "+ "年龄" + getAge();
    }
    public void play(){
        System.out.println(getName());
    }
    public Person2(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
    public void tool(Person2 p){
        if(p instanceof Student1){
            Student1 s = (Student1) p;
            s.study();
        }else if (p instanceof  Teacher1){
            Teacher1 t = (Teacher1) p;
            t.teach();
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
class Student1 extends Person2{
    private int stu_id;

    public Student1(String name, char gender, int age, int stu_id) {
        super(name, gender, age);
        this.stu_id = stu_id;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public void study(){
        System.out.println("我承诺，我会好好学习");
    }
    public void play(){
        System.out.println(super.getName() + "爱玩足球");
    }

    @Override
    public String printlnfo() {
        return super.printlnfo() +" " + "学号=" +  getStu_id();
    }
}
class Teacher1 extends Person2{
    private int work_age;

    public Teacher1(String name, char gender, int age, int work_age) {
        super(name, gender, age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    public void teach(){
        System.out.println("我承诺，我会认真教学");
    }
    public void play(){
        System.out.println(super.getName() +"爱玩象棋");
    }

    @Override
    public String printlnfo() {
        return super.printlnfo()+" "+ " 教龄=" +getWork_age() ;
    }
}
