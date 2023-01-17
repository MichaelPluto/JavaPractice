package com.yzf.interface_;

public interface Interface01 {
    public void hi();
    //jdk7.0前接口里的方法都是抽象方法

    //jdk8.0后可以有
    //1.抽象方法
    public abstract void cry();
    //2.默认实现方法
    default public void say(){
        System.out.println("傻逼");
    }
    //3.静态方法
    public static void work(){

    }
}
