package com.yzf.map;

import java.util.Hashtable;
@SuppressWarnings({"all"})
public class HashTable_ {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        //hashtable的 键和值 都不能为null
        //hashtable 使用方法基本上和HashMap一样
        //hashtable线程是安全的， hashmap线程是不安全的

        hashtable.put("john", 100);//ok
//        hashtable.put(null, 100);//异常 NullPointerException
//        hashtable.put("john", null);//NullPointerException
        hashtable.put("lucy", 100);//ok
        hashtable.put("lic", 100);//ok
        hashtable.put("lic", 80);//替换
        System.out.println(hashtable);

        //Hashtable底层
        //1.底层数组初始化大小为 11
        //2.临界值为 threshold = 8 = 11 * 0.75；
        //3.扩容有自己的扩容机制
        //4.执行 方法 addEntry(hash,key,value,index); 添加K-V 封装到Entry
        //当 if(count >= threshold) 满足时就进行扩容
        // 按照 int newCapacity = (oldCapacity << 1) + 1; 的大小进行扩容
    }
}
