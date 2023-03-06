package com.yzf.reflection.question;

import com.yzf.Cay;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 测试反射调用的性能，和优化方案
 */
public class Reflection02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        m1();
        m2();
        m3();
    }
    //传统方法调用hi
    public static void m1(){
        Cay cay = new Cay();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            cay.hi();
        }
        long end = System.currentTimeMillis();
        System.out.println("m1方法所耗时间= " + (end - start));
    }

    //反射机制调用hi
    public static void m2() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<?> cls = Class.forName("com.yzf.Cay");
        Object o = cls.newInstance();
        Method hi = cls.getMethod("hi");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("m2方法所耗时间= " + (end - start));
    }
    //反射调用优化 + 关闭访问检查
    public static void m3() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<?> cls = Class.forName("com.yzf.Cay");
        Object o = cls.newInstance();
        Method hi = cls.getMethod("hi");
        hi.setAccessible(true);//在反射调用方法时，取消访问检查
        long start = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("m2方法所耗时间= " + (end - start));
    }
}
