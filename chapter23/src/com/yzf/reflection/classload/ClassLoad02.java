package com.yzf.reflection.classload;

/**
 * JVM机控制阶段 人为不可控
 *说明一个类加载的链接阶段-准备
 */
public class ClassLoad02 {
    public static void main(String[] args) {

    }
}
class A {
    //在类的加载中 age是不会被影响，因为他不是静态成员，所以不会在类加载中初始化
    private int age = 12;
    // num 会在类加载时默认初始化为 num = 0; 而不是20
    private static int num = 20;
    // sal 会在类加载时默认初始化为 sal = 30; 因为final定义为常量
    private static final int sal = 30;
}
