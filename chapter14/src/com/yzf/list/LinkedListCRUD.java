package com.yzf.list;

import java.util.Iterator;
import java.util.LinkedList;
@SuppressWarnings({"all"})
public class LinkedListCRUD {
    public static void main(String[] args) {
        @SuppressWarnings("all")
        LinkedList linkedList = new LinkedList();
        //add 增加,默认添加再尾部,debug源码
        linkedList.add(1);
        linkedList.add(7);
        linkedList.add(8);
        System.out.println(linkedList);
        System.out.println("=======");
        //remove 删除
        linkedList.remove();//默认删除第一个
        linkedList.remove(1);//指定删除第二个
        //linkedList.remove(Object o)//指定删除某个对象的那个节点
        System.out.println(linkedList);
        System.out.println("=======");
        //set 改
        linkedList.set(0,11);
        System.out.println(linkedList);
        System.out.println("=======");
        //get 查
        linkedList.get(0);
        System.out.println(linkedList);
        linkedList.add(2);
        linkedList.add(5);
        linkedList.add(6);
        System.out.println("=======");
        //可以用三种方式遍历
        //1.迭代器
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("next= " +next);
        }
        System.out.println("=======");
        //2.增强for循环
        for (Object o : linkedList) {
            System.out.println(o);
        }
        System.out.println("=======");
        //3.普通for循环
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
    }
}
