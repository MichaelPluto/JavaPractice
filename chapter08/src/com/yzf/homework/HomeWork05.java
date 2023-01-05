package com.yzf.homework;

public class HomeWork05 {
    public static void main(String[] args) {
        Workers workers = new Workers("jack", 55, 50000);
        Peasant peasant = new Peasant("tom", 56, 80000);
        Waiter waiter = new Waiter("popy", 28, 45000);
        Teachers teachers = new Teachers("刘芮", 21, 100000, 100);
        Scientist scientist = new Scientist("杨质飞", 22, 100000, 50000);
        System.out.println("工人" + workers.getName() +" " + "年收入=" + workers.print());
        System.out.println("农民" + peasant.getName() +" " + "年收入=" + peasant.print());
        System.out.println("服务员"+ waiter.getName() +" " +"年收入=" + waiter.print());
        System.out.println("教师"+ teachers.getName() +" " + "年收入=" + teachers.print());
        System.out.println("科学家"+ scientist.getName() +" " +  "年收入=" + scientist.print());

    }
}
class Employees{
    private String name;
    private int age;
    private double sal;

    public Employees(String name, int age, double sal) {
        this.name = name;
        this.age = age;
        this.sal = sal;
    }
    public double  print(){
        return getSal();
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

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}
class Workers extends Employees{
    public Workers(String name, int age, double sal) {
        super(name, age, sal);
    }
}
class Peasant extends Employees{
    public Peasant(String name, int age, double sal) {
        super(name, age, sal);
    }
}
class Waiter extends Employees{
    public Waiter(String name, int age, double sal) {
        super(name, age, sal);
    }
}
class Teachers extends Employees{
    private double classDay;

    public Teachers(String name, int age, double sal, double classDay) {
        super(name, age, sal);
        this.classDay = classDay;
    }

    @Override
    public double  print() {
        return super.print()*365*getClassDay();
    }

    public double getClassDay() {
        return classDay;
    }

    public void setClassDay(double classDay) {
        this.classDay = classDay;
    }
}
class Scientist extends Employees{
    private double bonus;

    public Scientist(String name, int age, double sal, double bonus) {
        super(name, age, sal);
        this.bonus = bonus;
    }

    @Override
    public double print() {
        return super.print() + getBonus();
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}

