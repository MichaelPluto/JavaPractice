package com.yzf.homework_;

public class HomeWork04 {
    public static void main(String[] args) {
        /*
        试分析HashSet和TreeSet分别如何实现去重的
        (1) HashSet的去重机制：hashCode() + equals(),底层先通过存入对象，进行运算得到一个hash值
            ，通过hash值得到相应的索引，如果发现table索引所在位置没有数据，就直接存放
              如果有数据，就进行equals比较(遍历比较)，如果比较后不相同就加入，相同就不加入
        (2) TreeSet的去重机制：如果你传入一个Comparator 匿名对象，就使用实现的compare去重，
        如果返回为0，就认定为相同元素，就不添加
            如果没有传入一个Comparator匿名对象，则以你添加的对象所实现的Comparable接口的compareTo去重
         */
    }
}
