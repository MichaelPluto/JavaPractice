package com.yzf.object_;

public class Equals01 {
    public static void main(String[] args) {
        Integer integer1 = new Integer(1000);
        Integer integer2 = new Integer(1000);
        System.out.println(integer1 == integer2);//false
        System.out.println(integer1.equals(integer2));//true

        String str1 = new String("yzf");
        String str2 = new String("yzf");
        System.out.println(str1 == str2); //false
        System.out.println(str1.equals(str2));// true

    }
}
class B{}
class A extends B{}

