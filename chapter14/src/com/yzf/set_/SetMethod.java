package com.yzf.set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@SuppressWarnings({"all"})
public class SetMethod {
    public static void main(String[] args) {
        Set set = new HashSet();
        //add 增加 ，且不能存放相同元素
        set.add("john");
        set.add("lucy");
        set.add("john");
        set.add("jack");
        set.add(null);
        //Set接口可以添加null，但只能放一个null
        set.add(null);
        System.out.println(set);//输出的顺序与存储的顺序不同
        // 输出顺序固定不变
        System.out.println("======");
        for (int i = 0; i < 5; i++) {
            System.out.println(set);
        }
        //遍历有两种方式 迭代器和增强for
        //1.迭代器
        Iterator iterator = set.iterator();
        System.out.println("===迭代器遍历===");
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        //2.增强for
        System.out.println("===增强for遍历===");
        for (Object o : set) {
            System.out.println(o);
        }

        // remove 删除
        set.remove(null);
        System.out.println(set);
    }
}
