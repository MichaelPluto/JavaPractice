package com.yzf.reflection.class_;

import com.yzf.Car;

import java.lang.reflect.Field;

/**
 * 演示Class类的常用方法
 */
public class Class02 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {

        String classAllPath = "com.yzf.Car";
        //1.获取到Car类对应的Class对象
        //<?>表示不确定Java类型
        Class<?> cls = Class.forName(classAllPath);
        //2.输出cls
        System.out.println(cls);//显示cls对象，是哪个类的Class对象 com.yzf.Car
        System.out.println(cls.getClass());//输出cls运行类型 java.lang.Class
        //3.得到包名
        System.out.println(cls.getPackage());//包名
        //4.得到全类名
        System.out.println(cls.getName());//全部类名
        //5.通过cls 创建对象实例
        Car car = (Car) cls.newInstance();
        System.out.println(car);//car.toString()
        //6.通过反射获取属性 brand
        //前提属性是为 public修饰范围
        Field brand1 = cls.getField("brand");
        System.out.println(brand1.get(car));// 保时捷
        //7.通过反射设置属性 brand
        brand1.set(car,"路虎");
        System.out.println(brand1.get(car));// 路虎
        //8.得到所有属性
        Field[] fields = cls.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());//名称
        }
    }
}
