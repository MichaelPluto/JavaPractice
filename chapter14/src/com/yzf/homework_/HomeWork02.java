package com.yzf.homework_;

import java.util.ArrayList;
import java.util.Iterator;

@SuppressWarnings({"all"})
public class HomeWork02 {
    public static void main(String[] args) {
        Car car1 = new Car("宝马", 400000);
        Car car2 = new Car("宾利", 5000000);

        ArrayList list = new ArrayList();
        //添加单个元素
        list.add(car1);
        list.add(car2);
        System.out.println(list);
        //remove
        list.remove(car1);
        System.out.println(list);
        //查找元素是否存在
        System.out.println(list.contains(car1));//F
        //size 获取元素个数
        System.out.println(list.size());//1
        //isEmpty 判断是否为空
        System.out.println(list.isEmpty());//F
        //addAll 添加多个元素
        list.addAll(list);
        for (Object o : list) {
            System.out.println(o);
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
class Car{
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nCar{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
