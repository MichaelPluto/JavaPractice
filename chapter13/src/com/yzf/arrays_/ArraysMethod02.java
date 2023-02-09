package com.yzf.arrays_;

import java.util.Arrays;
import java.util.List;

public class ArraysMethod02 {
    public static void main(String[] args) {
        //1. binarySearch 二分查找
        //要求: 数组是有序的
        //     数组中不存在查找元素则会返回-1；
        Integer[] arr = {1,5,6,8,11,20};
        int index = Arrays.binarySearch(arr,11);
        System.out.println(index);

        //2.copyOf 数组元素复制
        //从arr数组中，复制arr.length个元素到新数组中
        //如果拷贝长度大于旧数组长度则会在新数组后增加 null
        //如果拷贝长度 <0 会抛出异常
        Integer[] integers = Arrays.copyOf(arr, arr.length - 1);
        System.out.println(Arrays.toString(integers));

        //fill 数组元素填充
        //替换原来数组里所有的元素
        Integer[] num = {1,66,5};
        Arrays.fill(num,7);
        System.out.println("===数组填充后===");
        System.out.println(Arrays.toString(num));

        //equals 比较两个数组元素内容是否完全一致
        Integer[] arr2 = {1,5,6,8,11,20};
        System.out.println(Arrays.equals(arr,arr2));

        //asList 将一组值，转换成List
        List asList = Arrays.asList(2,3,4,5,6,1);
        System.out.println("asList  " + asList);
        System.out.println("asList的运行类型= " +asList.getClass());
    }
}
