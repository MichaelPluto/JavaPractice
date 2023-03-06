package com.yzf.reflection.question;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

public class Reflection01 {
    public static void main(String[] args) throws Exception{
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\re.properties"));
        String classfullpath = properties.getProperty("classfullpath");
        String methodName = properties.getProperty("method");
        Class<?> cls = Class.forName(classfullpath);
        //(2) 通过cls 得到你加载的类 com.yzf.Cay 的对象实例
        Object o = cls.newInstance();
        System.out.println(o.getClass());//运行类型
        //(3) 通过cls 得到 你加载的类 的 methodName "hi"方法对象
        // 即在反射中，可以把方法视为对象(万物皆对象)
        Method method1 = cls.getMethod(methodName);
        // 通过method1 调用方法: 即通过方法对象来实现调用方法
        System.out.println("===================");
        method1.invoke(o);// 传统方法-> 对象.方法()  反射机制-> 方法.invoke(对象)

        //java.lang.reflect.Filed 代表类的成员变量，File对象表示某个类的成员变量
        //得到name字段
        Field name = cls.getField("name");//不能访问私有的成员变量
        System.out.println(name.get(o));

        //java.lang.reflect.Constructor 代表类的构造方法，Constructor对象表示构造器
        Constructor constructor = cls.getConstructor();//()中可以指定构造器参数，此时是获取无参构造器
        System.out.println(constructor);

        Constructor constructor1 = cls.getConstructor(String.class);
        System.out.println(constructor1);
    }
}
