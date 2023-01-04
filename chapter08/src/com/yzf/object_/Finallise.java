package com.yzf.object_;

public class Finallise {
    public static void main(String[] args) {
        Car bnw = new Car("bnw");
        System.gc();
        System.out.println("程序结束了");
    }





}
class Car{
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("====");
    }
}
