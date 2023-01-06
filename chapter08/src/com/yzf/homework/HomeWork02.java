package com.yzf.homework;

public class HomeWork02 {
    public static void main(String[] args) {
                                    //    本类   同包    子类   不同包
        System.out.println("public 权限    可以   可以    可以    可以");
        System.out.println("protected 权限 可以   可以    可以    不可以");
        System.out.println("默认 权限       可以   可以   不可以   不可以");
        System.out.println("private 权限   可以   不可以  不可以   不可以");
    }
}
