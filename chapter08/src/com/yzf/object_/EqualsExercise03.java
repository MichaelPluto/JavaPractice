package com.yzf.object_;

public class EqualsExercise03 {
    public static void main(String[] args) {
        int it = 65;
        float fl = 65.0f;
        System.out.println("65与65.0f是否相等" + (it == fl));//t
        char ch1 ='A'; char ch2 = 12;
        System.out.println("65和'A'是否相等" + (it == ch1));//t
        System.out.println("12和ch2是否相等" + (12 == ch2));//t

        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("str1 str2是否相等？" + (str1 == str2));//f
        System.out.println("str1 是否 equals str2" + (str1.equals(str2)));//t
    }
}
