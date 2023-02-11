package com.yzf.list;

import java.util.*;

public class ListFor {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add("1");
        list.add("2");
        list.add("3");

        //1.迭代器循环
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        System.out.println("========");
        //2.增强for
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println("=========");
        //3.普通for
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
