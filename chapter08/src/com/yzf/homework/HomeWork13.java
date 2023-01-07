package com.yzf.homework;

public class HomeWork13 {
    public static void main(String[] args) {

        Person2[] people = new Person2[4];
        people[0] = new Student1("jack", '男', 21, 15030119);
        people[1] = new Student1("Tom", '女', 22, 15030118);
        people[2] = new Teacher1("mars", '男', 45, 10);
        people[3] = new Teacher1("jack", '男', 30, 6);
        HomeWork13 homeWork13 = new HomeWork13();
         homeWork13.bubbleSort(people);
         //输出排序后的数组
        System.out.println("---年龄排序后的数组---");
        for (int j = 0; j < people.length; j++) {
            people[j].printlnfo();
            homeWork13.tool(people[j]);
            System.out.println("--------------------------");
        }
    }
        public void bubbleSort(Person2[] people){
            Person2 temp = null;
            for (int i = 0; i < people.length - 1; i++) {
                for (int j = 0; j < people.length - i - 1; j++) {
                    if(people[j].getAge() < people[j+1].getAge()){
                        temp = people[j];
                        people[j] = people[j+1];
                        people[j+1] = temp;
                    }
                }
            }
        }
            public void tool(Person2 p){
                if(p instanceof Student1){
                    ((Student1) p).study();
                }else if (p instanceof  Teacher1){
                    ((Teacher1) p).teach();
                }
            }
}
class Person2{
    private String name;
    private char gender;
    private int age;
    public String basicInfo(){
        return "姓名:" + " " + getName()+"\n"+"性别:"+" " + getGender()+"\n"+ "年龄:" + " " + getAge() + "\n";
    }
    public void printlnfo(){
        System.out.println(basicInfo());

    }
    public String play(){
        return getName() + "爱玩";
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
        System.out.println(getName() + "承诺，我会好好学习");
    }
    public String play(){
        return super.play() + "足球";

    }

    @Override
    public void printlnfo() {
        System.out.println("学生的信息：");
        System.out.println(super.basicInfo()  + "学号：" +" " + stu_id);
        System.out.println(play());
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
        System.out.println(getName() + "承诺，我会认真教学");
    }
    public String play(){
        return super.play() + "象棋";
    }

    @Override
    public void printlnfo() {
        System.out.println("老师的信息：");
        System.out.println(super.basicInfo() + "教龄:" + " " + work_age);
        System.out.println(play());
    }
}
