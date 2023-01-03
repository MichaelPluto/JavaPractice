package com.yzf.poly_.polyparameter_;

public class Ordinary extends Employee {
    public Ordinary(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();//员工没有奖金所以直接使用父类的getAnnual方法
    }

    public void work(){
        System.out.println("员工" + getName() + "正在工作");
    }
}

