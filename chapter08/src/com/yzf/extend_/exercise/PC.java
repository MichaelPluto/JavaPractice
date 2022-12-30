package com.yzf.extend_.exercise;

public class PC extends Computer{
    //    编写 PC 子类，继承 Computer 类，添加特有属性【品牌 brand】
    private String brand;

    public PC(String CPU, String memory, String harddisk, String brand) {
        super(CPU, memory, harddisk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void info1(){
        System.out.println("CPU=" + getCPU()+ " " + "memory=" + getMemory()+ " " + "harddisk=" + getHarddisk()+" " + "barnd=" + getBrand());
    }
}
