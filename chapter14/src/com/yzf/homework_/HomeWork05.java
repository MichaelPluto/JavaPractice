package com.yzf.homework_;

import java.util.TreeSet;

public class HomeWork05 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(new Person1());
        //会抛出异常
        /*
        因为 TreeSet()构造器没有传入Comparator接口的匿名内部类
        所以内部有会尝试把传入的对象转换成Comparable接口，但Person并没有实现这个接口
        所以会抛出异常
         */
    }
}
class Person1{
}