package com.yzf.object_;

public class ToString {
    public static void main(String[] args) {
        Monster monster = new Monster("黑心大王", "巡山", 1000);
        System.out.println(monster.toString());

    }
}
class Monster {
    private String name;
    private String job;
    private double sal;

    public Monster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        //toString 被重写前会将对象的hashcode转换为十六进制
        //toString 被重写后会输出相应的属性
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                '}';
    }
}
