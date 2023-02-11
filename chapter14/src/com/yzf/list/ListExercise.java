package com.yzf.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExercise {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 11; i++) {
            list.add("hello" + i);
        }
        System.out.println(list);
        //在2号位上察隅一个元素 杨质飞是大帅哥
        list.add(1, "杨质飞是大帅哥");
        //获得第5个元素
        System.out.println(list.get(4));
        //删除第6个元素
        list.remove(5);
        System.out.println(list);
        //修改第7个元素
        list.set(6,"happy");
        System.out.println(list);
        //使用迭代器遍历集合
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }
}
