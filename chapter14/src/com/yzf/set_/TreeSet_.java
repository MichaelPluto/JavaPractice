package com.yzf.set_;

import java.util.Comparator;
import java.util.TreeSet;
@SuppressWarnings({"all"})
public class TreeSet_ {
    public static void main(String[] args) {

        //1. 当我们使用无参构造器，创建 TreeSet 时，仍然是无序的
        //2. 老师希望添加的元素，按照字符串大小来排序
        //3. 使用 TreeSet 提供的一个构造器，可以传入一个比较器(匿名内部类)
        TreeSet set = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //return ((String) o1).compareTo((String) o2);//按照字符大小排序
                return ((String) o1).length() - ((String) o2).length();//按照字符串长度进行排序
            }
        });
        set.add("jack");
        set.add("ig");
        set.add("fpx");
        set.add("j");
        System.out.println(set);
    }
}
