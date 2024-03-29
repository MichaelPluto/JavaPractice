package com.yzf.abstract_;

class Manager extends Employee {
    private double bonus;

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("经理" + getName() + " " +
                "id=" + getId() + " " + "薪水=" +
                (getSalary() + bonus) + "工作中");
    }
}
class CommonEmployee extends Employee {
    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("普通员工" + getName() + " " +
                "id=" + getId() + " " + "薪水=" +
                getSalary() + "工作中");
    }
}
