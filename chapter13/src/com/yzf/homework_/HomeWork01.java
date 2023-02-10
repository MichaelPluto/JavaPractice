package com.yzf.homework_;

public class HomeWork01 {
    public static void main(String[] args) {
       String str = "abcdef";
        System.out.println("===交换前===");
        System.out.println(str);
        System.out.println("===交换后===");
        //需要接收一个返回值
        try {
            String s = reverse(str, 1, 4);
            System.out.println(s);
        } catch (Exception e) {
            System.out.println("参数异常");
        }
    }
    public static String reverse(String str,int start,int end){
        //将字符串指定部分进行反转 "abcdef" - > "fedcba"
        //对输入的参数进行校验 -> 正难则反
        if (!(str != null && start > 0 && end > start && end < str.length())){
            throw new RuntimeException();
        }
        //将String转换成char[] 这样可以进行交换位置
        char[] chars = str.toCharArray();
        char temp = ' ';
        for (int i = start, j = end; i < j; i++, j--){
            temp = chars[j];
            chars[j] = chars[i];
            chars[i] = temp;
        }
        //因为返回值为String 所以需要将chars转换成String
       return new String(chars);
    }
}
