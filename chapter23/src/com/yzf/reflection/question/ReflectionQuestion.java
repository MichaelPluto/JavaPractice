package com.yzf.reflection.question;

import com.yzf.Cay;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectionQuestion {
    public static void main(String[] args) throws Exception{

        //根据配置文件 re.properties 指定信息，创建Cat对象并调用放啊hi

        //传统的方法 new 对象 -> 调用方法
        Cay cay = new Cay();
        cay.hi();

        //1.使用Properties类 可以直接读写配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\re.properties"));
        String classfullpath = properties.getProperty("classfullpath");
        String methodName = properties.getProperty("method");
        System.out.println("classfullpath= " + classfullpath);
        System.out.println("method= " + methodName);
        //2.创建对象，传统的方法 行不通

        //3.使用反射机制解决
        //(1) 加载类,返回class类型的对象cls
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
    }
}
