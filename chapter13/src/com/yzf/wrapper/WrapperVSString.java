package com.yzf.wrapper;

public class WrapperVSString {
    public static void main(String[] args) {
        Integer i = 10;//自动装箱
        //int -> String
        //方法1
        String str1 = i + "";
        //方法2
        String str2 = i.toString();
        //方法3
        String str3 = String.valueOf(i);
        //String -> 包装类(Integer)
        String str4 = "1234";
        Integer i1 = Integer.parseInt(str4);//自动装箱
        Integer i2 = new Integer(str4);//构造器
        System.out.println(str4);
        System.out.println("ok~~");
    }
}
