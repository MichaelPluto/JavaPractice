package com.yzf.list;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三丰");
        list.add("马云");
        list.add("小李子");
        System.out.println(list);
        //  void add(int index, Object ele):在index位置插入元素
        list.add(1,"杨质飞");
        System.out.println(list);
    //  boolean addAll(int index, Collection eles):从 index 位置开始将 eles 中的所有元素添加进来
        List list2 = new ArrayList();
        list2.add("金庸");
        list.addAll(list2);
        System.out.println(list);
    //  Object get(int index): 获取指定index位置的元素
    //  int indexOf(Object obj):返回obj在集合中首次出现的位置
        list.add("杨质飞");
        System.out.println(list.indexOf("杨质飞"));
    //  int lastIndexOf(Object obj):返回obj在集合中末次出现的位置
        System.out.println(list.lastIndexOf("杨质飞"));
    //  Object remove(int index, Object obj): 移除指定index位置的元素，并返回此元素
        System.out.println(list.remove(0));
        System.out.println(list);
    //  Object set(int index, Object obj): 设定指定index位置的元素为ele，相当于是替换
        list.set(0, "刘芮");
        System.out.println(list);
    //  list subList(int fromIndex, int toIndex):反会从 fromIndex <= X < toIndex 位置的元素
        System.out.println(list.subList(0,3));
    }
}
