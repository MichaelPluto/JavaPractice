package com.yzf.extend_.exercise;

public class NotePad extends Computer{
    //    编写 NotePad 子类，继承 Computer 类，添加特有属性【color】
    char color = '黑';

    public NotePad(String CPU, String memory, String harddisk, char color) {
        super(CPU, memory, harddisk);
        this.color = color;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public void infor2(){
        System.out.println("CPU=" + getCPU()+ " " + "memory=" + getMemory()+ " " + "harddisk=" + getHarddisk()+" " + "color=" + getColor());
    }
}
