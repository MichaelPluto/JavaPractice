package com.yzf.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Collection_ {
    @SuppressWarnings("all")
    public static void main(String[] args){
        //Collection
        //1.集合主要是两组(单列和双列 集合)
        //2.Collection 有两个重要的子接口 List Set ，他们实现子类都是单列集合
        //3.Map 接口实现子类 是双列集合，存放的是 K-V

        //Map

        //单列集合
        ArrayList arrayList = new ArrayList();
        arrayList.add("jack");
        arrayList.add("tom");
        //双列集合
        Map hashMap = new HashMap();
        hashMap.put("NO1","北京");
        hashMap.put("NO2","上海");
    }
}
