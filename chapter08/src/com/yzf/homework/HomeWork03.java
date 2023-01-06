package com.yzf.homework;

public class HomeWork03 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("jack", 55, "教授", 20000);
        System.out.println(teacher.introduce());
        Teacher teacher1 = new Professor("tome", 45, "教授", 25000,1.3 );
        System.out.println(teacher1.introduce());
        Teacher teacher2 = new aprofessor("mary", 40, "副教授",15000, 1.2);
        System.out.println(teacher2.introduce());
        Teacher teacher3 = new lecturer("mike", 35, "讲师", 8000, 1.1);
        System.out.println(teacher3.introduce());
    }
}
class Teacher{
    private String name;
    private int age;
    private String post;
    private double salary;

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;


    }
    public String introduce(){
        return "姓名=" + getName() + " " + "年龄=" + getAge() + " " +
                "职位=" + getPost() +" " +  "基本工资="+ " " + getSalary();
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
class Professor extends Teacher{
    private double state ;

    public Professor(String name, int age, String post, double salary, double state) {
        super(name, age, post, salary);
        this.state = state;
    }

    public double getState() {
        return state;
    }

    public void setState(double state) {
        this.state = state;
    }

    @Override
    public String introduce() {
        return super.introduce() + " " + "工资级别=" + getState();
    }
}
class aprofessor extends Teacher{
    private double state ;

    public aprofessor(String name, int age, String post, double salary, double state) {
        super(name, age, post, salary);
        this.state = state;
    }

    public double getState() {
        return state;
    }

    public void setState(double state) {
        this.state = state;
    }

    @Override
    public String introduce() {
        return super.introduce() +" " +  "工资级别=" + getState();
    }
}
class lecturer extends Teacher{
    private double state;

    public lecturer(String name, int age, String post, double salary, double state) {
        super(name, age, post, salary);
        this.state = state;
    }

    public double getState() {
        return state;
    }

    public void setState(double state) {
        this.state = state;
    }

    @Override
    public String introduce() {
        return super.introduce() + " " +  "工资等级=" + getState();
    }
}
