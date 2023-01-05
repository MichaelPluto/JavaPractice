package com.yzf.homework;

public class HomeWork04 {
    public static void main(String[] args) {
        Worker worker = new Worker("刘芮", 300, 28, 1.0);
        Manager manager = new Manager("杨质飞", 500, 20, 1.2);
        System.out.println("普通员工" + worker.getName() + "工资=" + worker.sal());
        System.out.println("部门经理" + manager.getName() + "工资=" + manager.sal());
    }
}
class Employee{
    private String name;
    private double singleSal;
    private int workDay;

    public Employee(String name, double singleSal, int workDay) {
        this.name = name;
        this.singleSal = singleSal;
        this.workDay = workDay;
    }
    public double sal(){
        return getSingleSal()*getWorkDay();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSingleSal() {
        return singleSal;
    }

    public void setSingleSal(double singleSal) {
        this.singleSal = singleSal;
    }

    public int getWorkDay() {
        return workDay;
    }

    public void setWorkDay(int workDay) {
        this.workDay = workDay;
    }
}
class Worker extends Employee{
    private double state;

    public Worker(String name, double singleSal, int workDay, double state) {
        super(name, singleSal, workDay);
        this.state = state;
    }

    @Override
    public double sal() {
        return super.sal()*getState();
    }

    public double getState() {
        return state;
    }

    public void setState(double state) {
        this.state = state;
    }
}
class Manager extends Employee {
    private double state;

    public Manager(String name, double singleSal, int workDay, double state) {
        super(name, singleSal, workDay);
        this.state = state;
    }

    @Override
    public double sal() {
        return super.sal()*getState() + 1000;
    }

    public double getState() {
        return state;
    }

    public void setState(double state) {
        this.state = state;
    }
}
