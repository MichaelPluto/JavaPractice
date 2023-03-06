package com.yzf.reflection.class_;

import com.yzf.Car;

/**
 * 演示得到Class对象的各种方式 -> 六种
 */
public class GetClass {
    public static void main(String[] args) throws ClassNotFoundException {

        //1. Class.forName
        String fullPath = "com.yzf.Car";//通过读取配置文件获取
        Class cls1 = Class.forName(fullPath);
        System.out.println(cls1); // class com.yzf.Car

        //2.类.class获取
        Class<Car> cls2 = Car.class;
        System.out.println(cls2);

        //3.对象.getClass() 获取
        Car car = new Car();
        Class<? extends Car> cls3 = car.getClass();
        System.out.println(cls3);

        //4.通过加载器获取
        ClassLoader classLoader = car.getClass().getClassLoader();
        Class<?> cls4 = classLoader.loadClass(fullPath);
        System.out.println(cls4);
        // cls1, cls2, cls3, cls4 其实是同一个对象
        System.out.println(cls1.hashCode());
        System.out.println(cls2.hashCode());
        System.out.println(cls3.hashCode());
        System.out.println(cls4.hashCode());
        //5.基本数据类型.class
        Class<Integer> cls5 = int.class;
        Class<Double> doubleClass = double.class;
        System.out.println(cls5);

        //包装类.TYPE
        Class<Integer> cl6 = Integer.TYPE;
        Class<Double> type1 = Double.TYPE;
        System.out.println(cl6);
    }
}
