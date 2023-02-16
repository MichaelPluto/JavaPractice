package com.yzf.homework_;

import java.util.HashMap;
import java.util.Set;

@SuppressWarnings({"all"})
public class HomeWork03 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("jack",650);
        map.put("tom",1200);
        map.put("smith",2900);
        System.out.println(map);
        //将jack工资改为2600
        map.put("jack",2600);
        //为所有员工工资加薪100
        Set set = map.keySet();//取出所有key
        for (Object key : set) {
            Integer v = (Integer) map.get(key);
            v = v + 100;
            map.put(key,v);
        }
        System.out.println(map);

        //遍历所有的员工
        for (Object key : set) {
            System.out.println(key + "-" + map.get(key));
        }
        System.out.println("======");
        for (Object key : set) {
            System.out.println(map.get(key));
        }
    }
}

