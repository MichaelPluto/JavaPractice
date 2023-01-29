package com.yzf.homework_;

public class HomeWork04 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new Cal() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        }, 8,9);
        cellphone.testWork(new Cal() {
            @Override
            public double work(double n1, double n2) {
                return n1 * n2;
            }
        },13,16);
    }
}
interface Cal {
    public double work(double n1, double n2);
}
class Cellphone {
    public void testWork(Cal cal, double n1,double n2){
        double result = cal.work(n1, n2);
        System.out.println(result);
    }
}