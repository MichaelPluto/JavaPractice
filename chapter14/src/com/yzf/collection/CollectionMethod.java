package com.yzf.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionMethod {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();
        //add:添加单个元素
        list.add("jack");
        list.add("tom");
        list.add(10);//会自动转换成Integer类
        list.add(true);
        System.out.println("List=" + list);
        //remove:删除指定元素
        list.remove("jack");
        System.out.println("List=" + list);
        list.remove(0);//删除第一个元素
        System.out.println("List=" + list);
        //contains:查找元素是否存在
        System.out.println(list.contains("jack"));
        System.out.println(list.contains(true));
        //size:获取元素个数
        System.out.println(list.size());
        //isEmpty:判断是否为空
        System.out.println(list.isEmpty());
        //clear:清空
        list.clear();
        System.out.println(list.isEmpty());
        System.out.println(list);
        //addAll:添加多个元素，也可以添加其他集合
        ArrayList arrayList = new ArrayList();
        arrayList.add("红楼梦");
        arrayList.add("三国演义");
        list.addAll(arrayList);
        System.out.println("list= " + list);
        //containsAll:查找多个元素是否都存在
        System.out.println(list.contains(arrayList));
        list.add("聊斋");
        list.removeAll(arrayList);
        System.out.println("list=" + list );

    }
}
