package com.yzf.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapFor {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("邓超", "孙俪");
        map.put("王宝强", "马蓉");
        map.put("宋喆", "马蓉");
        map.put("刘令博", null);
        map.put(null, "刘亦菲");
        map.put("鹿晗", "关晓彤");
    //遍历方式
    //第一组:先取出所有的key，通过key取出value
        Set keySet = map.keySet();//取出所有key
    //1.增强for
        System.out.println("===第一种增强for===");
        for (Object key : keySet) {
            System.out.println(key + "-" + map.get(key));//通过key键取出value
        }
    //2.迭代器
        System.out.println("===第一种迭代器===");
        Iterator iterator1 = keySet.iterator();
        while (iterator1.hasNext()) {
            Object key =  iterator1.next();
            System.out.println(key + "-" + map.get(key));
        }
    //第二组: 直接取出value值
        System.out.println("===直接取出value 增强for");
        for (Object value : map.values()) {
            System.out.println(value);
        }
        System.out.println("===直接取出value 迭代器");
        Iterator iterator2 = map.values().iterator();
        while (iterator2.hasNext()) {
            Object value =  iterator2.next();
            System.out.println(value);
        }
    //第三组: 通过EntrySet 来获取 k-v
        Set entrySet = map.entrySet();
        System.out.println("===增强for===");
        for (Object keyvalue : entrySet) {
            //将entry 转成 Map.Entry
            Map.Entry m = (Map.Entry) keyvalue;
            System.out.println(m.getKey() + "-" + m.getValue());
        }
        System.out.println("===迭代器r===");
        Iterator iterator3 = entrySet.iterator();
        while (iterator3.hasNext()) {
            Object keyvalue =  iterator3.next();
               Map.Entry m = (Map.Entry) keyvalue;
            System.out.println(m.getKey() + "-" + m.getValue());
        }
    }
}
