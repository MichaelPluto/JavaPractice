package com.yzf.string_;

public class StringExercise07 {
    public static void main(String[] args) {
        String a = "hello" + "abc";
        //创建了一个对象
        //编译器会做一个优化，判断创建的常量池对象是否有引用指向
        //String a = "hello" + "abc" => String a = "helloabc"
    }
}
