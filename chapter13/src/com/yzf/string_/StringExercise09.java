package com.yzf.string_;

public class StringExercise09 {
    public static void main(String[] args) {
        String s1 = "yzf";//指向池中 yzf
        String s2 = "java";//指向池中 java
        String s5 = "yzfjava";//指向池中的 yzfjava
        String s6 = (s1 + s2).intern();//指向池中的 yzfjava
        System.out.println(s5 == s6);
        System.out.println(s5.equals(s6));
    }
}
