package com.yzf.debug_;

import java.util.Arrays;

public class Debug03 {
    public static void main(String[] args) {
        int arr [] = {1, 58,-6,42,11};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
