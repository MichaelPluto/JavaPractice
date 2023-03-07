package com.yzf.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 演示反射操作方法
 */
public class ReflectAccessMethod {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //1. 得到Boss对应的Class类
        Class<?> bossClass = Class.forName("com.yzf.reflection.Boss");
        //2. 创建对象
        Object o = bossClass.newInstance();
        //3. 调用公有方法
        Method hi = bossClass.getMethod("hi", String.class);
       hi.invoke(o,"杨质飞");
       //4. 调用 私有 静态方法
        Method say = bossClass.getDeclaredMethod("say", int.class, String.class, char.class);
        //爆破
        say.setAccessible(true);
        System.out.println(say.invoke(o,100,"老王",'男'));
        //因为say方法 是 static的 可以传入null
        System.out.println(say.invoke(null,20,"小杨",'女'));

        //5.在反射中，如果方法有返回值，同一返回Object
        Object invoke = say.invoke(null, 300, "ll", 'l');
        System.out.println(invoke.getClass());
    }
}
class Boss {
    public int age;
    private static String name;

    public Boss(){

    }

    private static String say(int n, String s, char c){ //静态方法
        return n + " " + s + " " + c;
    }

    public void hi(String s){
        System.out.println("hi " + s);
    }
}
