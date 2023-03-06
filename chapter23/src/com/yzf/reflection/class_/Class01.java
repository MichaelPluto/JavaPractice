package com.yzf.reflection.class_;

import com.sun.xml.internal.ws.org.objectweb.asm.ClassAdapter;

public class Class01 {
    public static void main(String[] args) throws ClassNotFoundException {
        //1.Class也是类，继承Object
        //2.Class类对象不是new出来的 是系统创建的
        Class<?> cls1 = Class.forName("com.yzf.Cay");
        System.out.println(cls1.hashCode());
        System.out.println(cls1.hashCode());

        Class<?> cls2 = Class.forName("com.yzf.Dog");
        System.out.println(cls2.hashCode());
    }
}
