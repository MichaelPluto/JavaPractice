package com.yzf.string_;

public class StringExercise04 {
    public static void main(String[] args) {
        String s1 = "yzf";
        String s2 = "java";
        String s3 = "java";
        String s4 = new String("java");
        System.out.println(s2 == s3);//T
        System.out.println(s2 == s4);//F
        System.out.println(s2.equals(s3));//T
        System.out.println(s1 == s2);//F
    }
}
