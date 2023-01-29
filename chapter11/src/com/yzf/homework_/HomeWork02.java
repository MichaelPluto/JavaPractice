package com.yzf.homework_;

public class HomeWork02 {
    public static void main(String[] args) {
        System.out.println(Frock.getCurrentNum());
        System.out.println(Frock.getCurrentNum  ());
        Frock frock1 = new Frock();
        System.out.println(frock1.getSerialNumber());
        Frock frock2 = new Frock();
        System.out.println(frock2.getSerialNumber());
        Frock frock3 = new Frock();
        System.out.println(frock3.getSerialNumber());
    }
}
class Frock {
    private static int currentNum = 100000;

    public static int getCurrentNum(){
        return currentNum += 100;
    }
    private   int serialNumber;

    public  int getSerialNumber() {
        return serialNumber;
    }

    public Frock() {
        serialNumber = getCurrentNum();
    }
}
