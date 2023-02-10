package com.yzf.homework_;

public class HomeWork04 {
    public static void main(String[] args) {
        judge("HHHkIjkx12478");
    }

    public static void judge(String str){
        if (str != null){
        f1(str);
        f2(str);
        f3(str);
        }
    }



    public static void f1(String str){
        int count1 = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z'){
                count1++;
            }
        }
        System.out.println("有 " + count1+ "个大写字母");
    }
    public static void f2(String str){
        int count2 = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z'){
                count2++;
            }
        }
        System.out.println("有 " + count2 + "个小写字母");
    }
    public static void f3(String str){
        int count3 = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] > '0' && chars[i] < '9'){
                count3++;
            }
        }
        System.out.println("有" + count3 + "个数字");
    }
}
