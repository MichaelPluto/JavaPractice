package com.yzf.pkg;

import java.util.Arrays;

//import java.util.Scanner 表示只会引入java.util包下的scanner
//import Java.util.* 表示将java.util包下的所有类都导入
public class import01 {
    public static void main(String[] args) {
        //使用系统提供Arrays完成数组排序
        int []arr = {8, -5, 6, 9};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");

        }
    }
}
