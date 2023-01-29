package com.yzf.exception_;

public class NumberFormatException {
    public static void main(String[] args) {
        String name = "jack";
        //将String转换成int
        int num = Integer.parseInt(name);//抛出 umberFormatException异常
        System.out.println(num);
    }
}
