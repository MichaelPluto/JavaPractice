package com.yzf.set_;

import java.util.HashSet;
import java.util.Set;
@SuppressWarnings({"all"})
public class HashSet01 {
    public static void main(String[] args) {
        Set set = new HashSet();
        //1.在执行add方法后会返回一个boolean值
        //2.如果成功返回true 反之
        System.out.println(set.add("john"));//T
        System.out.println(set.add("lucy"));//T
        System.out.println(set.add("john"));//F
        System.out.println(set.add("jack"));//T
        System.out.println(set.add("Rose"));//T

        set.remove("john");
        System.out.println("set= " + set);

        set = new HashSet();
        set.add("lucy");//T
        set.add("lucy");//F
        set.add(new Dog("tom"));//T
        set.add(new Dog("tom"));//T
        System.out.println("set= " + set);

        //经典面试题
        set.add(new String("yzf"));//T
        set.add(new String("yzf"));//F 加入不了 ，具体分析源码
        System.out.println("set= " + set);
    }
}
class Dog{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + "}";
    }
}