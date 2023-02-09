package com.yzf.arrays_;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysMethod01 {
    public static void main(String[] args) {
        //1.toString 遍历输出数组
        Integer[] integers = {1, 20, 90};
        System.out.println(Arrays.toString(integers));

        //2.sort方法使用
        Integer arr[] = {6, -1, 3, 4, -5};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        //3.定制排序
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
               return o1 - o2;
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
