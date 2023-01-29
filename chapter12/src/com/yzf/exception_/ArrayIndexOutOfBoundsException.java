package com.yzf.exception_;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int arr[] = {1,2,4,6};
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
