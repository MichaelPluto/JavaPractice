package com.yzf.list;

import java.util.ArrayList;
import java.util.List;

public class List_ {
    public static void main(String[] args) {
        @SuppressWarnings("all")
        //1.List集合类中元素有序(添加和输出顺序一直)，且可重复
        List list = new ArrayList();
        list.add("jack");
        list.add("mary");
        list.add("tom");
        list.add("jimi");
        list.add("jimi");
        System.out.println(list);
        //2.List集合中每个元素都有其对应的顺序索引，即支持索引
        System.out.println(list.get(0));//jack
    }
}
