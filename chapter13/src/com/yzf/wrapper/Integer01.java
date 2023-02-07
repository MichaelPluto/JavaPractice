package com.yzf.wrapper;

public class Integer01 {
    public static void main(String[] args) {
        //手动装箱
        int i = 10;
        Integer integer1 = new Integer(i);
        Integer integer = Integer.valueOf(i);
        //手动拆箱
        int i1 = integer.intValue();
        //自动装箱
        int i2 = 20;
        Integer integer2 = i2;
        //自动拆箱
        int n3 = integer2;
        //其他同理比如 double
        double n1 = 100;
        Double double1 = n1;
        double n2 = double1;
        //
        long k1 = 500;
        Long long1 = k1;
        long k2 = long1;
    }
}
