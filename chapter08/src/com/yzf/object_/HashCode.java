package com.yzf.object_;

public class HashCode {
    public static void main(String[] args) {
        AA aa1 = new AA();
        AA aa2 = new AA();
        AA aa3 = aa1;

        System.out.println("aa1的hashcode=" + aa1.hashCode());
        System.out.println("aa2的hashcode=" + aa2.hashCode());
        System.out.println("aa3的hashcode=" + aa3.hashCode());
    }
}
class AA{}