package com.yzf.map;

import java.util.Properties;

public class Properties_ {
    public static void main(String[] args) {
        Properties p = new Properties();
        //1.Properties 继承 hashtable
        //2.可以通过 k-v 存放数据， k-v都不能为null
        //add 增
//        p.put(null, "abc");//异常
//        p.put("abc", null);//异常
        p.put("jack", 100);//ok
        p.put("mary", 100);//ok
        p.put("mary", 80);//替换

        //remove 删
        p.remove("jack");
        System.out.println(p);

        //改 set
        p.put("mary", "约翰");

        //查 get
        p.get("约翰");
        p.getProperty("约翰");
        System.out.println(p);
    }
}
