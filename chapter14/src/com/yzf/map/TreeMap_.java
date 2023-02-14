package com.yzf.map;

import java.util.Comparator;
import java.util.TreeMap;
@SuppressWarnings({"all"})
public class TreeMap_ {
    public static void main(String[] args) {
        //TreeSet 和 TreeMap 基本相同
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //return ((String) o1).compareTo((String) o2);//按字符大小排序
                return ((String) o1).length() - ((String) o2).length();//按照字符串长度进行排序
                //此时rose加不进来，因为他的长度与jack一样，在底层源码会直接退出加入的步骤直接返回
                //但因为长度相同，value的值会被替换
            }
        });

        treeMap.put("jack","杰克");
        treeMap.put("rose","露丝");
        treeMap.put("jay","周杰伦");
        treeMap.put("lj","垃圾");
        System.out.println(treeMap);
    }
}
