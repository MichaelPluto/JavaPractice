package com.yzf.map;

import java.util.HashMap;
import java.util.Set;

@SuppressWarnings({"all"})
public class MapMethod {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        //put 添加
        map.put("邓超", new Book("来", 100));//OK
        map.put("邓超", "孙俪");//替换-> 一会分析源码
        map.put("王宝强", "马蓉");//OK
        map.put("宋喆", "马蓉");//OK
        map.put("刘令博", null);//OK
        map.put(null, "刘亦菲");//OK
        map.put("鹿晗", "关晓彤");//OK

        //remove 根据键删除映射关系
        map.remove("null");
        System.out.println(map);
        //get 根据键值获取值
        System.out.println(map.get("鹿晗"));
        //size 获取元素个数
        System.out.println(map.size());
        //isEmpty 办单个数是否为0
        System.out.println(map.isEmpty());
        //clear 清除所有元素
        //map.clear();
        //containsKey 查找键是否存在
        System.out.println(map.containsKey("邓超"));//T
    }
}
class Book{
    private String name;
    private int num;

    public Book(String name, int num) {
        this.name = name;
        this.num = num;
    }
}