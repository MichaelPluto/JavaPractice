package com.yzf.static_;

public class StaticMethod {
    public static void main(String[] args) {
        Stu stu1 = new Stu("mary");
        Stu.addPay(200);
        Stu stu2 = new Stu("jack");
        Stu.addPay(300);
        Stu.showPay();
    }
}
class Stu {
    private String name;
    public static double fee = 0;

    public Stu(String name) {
        this.name = name;
    }

    public static void addPay(double fee){
        Stu.fee += fee;
    }
    public static void showPay(){
        System.out.println("输出" + fee);
    }
}
