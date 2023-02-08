package com.yzf.string_;

public class StringExercise03 {
    public static void main(String[] args) {
        String a = "yzf";
        String b = new String("yzf");
        System.out.println(a.equals(b));//T
        System.out.println(a == b);//F
        System.out.println(a == b.intern());
        System.out.println(b == b.intern());
    }
}
