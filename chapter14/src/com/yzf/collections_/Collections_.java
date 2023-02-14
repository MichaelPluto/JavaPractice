package com.yzf.collections_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

@SuppressWarnings({"all"})
public class Collections_ {
    public static void main(String[] args) {
        //Collections 工具类的方法
        ArrayList list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("milan");
        list.add("jay");
        list.add("jay");
        ArrayList dest = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            dest.add(i);
        }
        System.out.println("list = " + list);
        System.out.println("dest = " + dest);
        // reverse(List) 反转List中所有的元素
        Collections.reverse(list);
        System.out.println("list = " + list);
        // shuffle(List) 对List集合元素进行随机排序
        Collections.shuffle(list);
        System.out.println("list = " + list);
        // sort(List) 对List内元素进行自然排序，也就是按照字符大小进行排序
        Collections.sort(list);
        System.out.println("list = " + list);
        // sort(List, Comparator) 对List内元素进行制定的排序
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
                //根据字符串长度进行排序
            }
        });
        System.out.println("list = " + list);
        //Object max(Collection) 根据元素的自然排序，返回给定集合中的最大元素值
        Collections.max(list);
        System.out.println("list = " + list);
        //Object max(Collection，Comparator) 根据 Comparator 指定的顺序，返回给定集合中最大元素
        Collections.max(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        //Object min(Collection，Comparator)
        //int frequncy(Collection,Comparator) 返回指定集合中指定元素出现的次数
        Collections.frequency(list,"jay");
        System.out.println("list = " + list);
        //void copy(List dest,List src): 将src中的内容复制到dest中
        Collections.copy(dest, list);
        System.out.println("dest = " + dest);
        //boolean replaceAll(List list, Object oldVal, Object newVal):使用新值替换List对象的所有旧值
    }
}
