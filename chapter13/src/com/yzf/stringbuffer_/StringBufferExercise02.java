package com.yzf.stringbuffer_;

public class StringBufferExercise02 {
    public static void main(String[] args) {
//        输入商品名称和商品价格，要求打印效果示例, 使用前面学习的方法完成：
//        商品名 商品价格
//        手机 123,564.59 //比如 价格 3,456,789.88
//        要求：价格的小数点前面每三位用逗号隔开, 在输出。
        String str = "889123564.59";
        //将String转换成 StringBuffer 来使用其方法
        StringBuffer sb = new StringBuffer(str);
        //先找到小数点的位置，用lastIndexOf
        //int i = sb.lastIndexOf(".");
//        sb.insert(i-3,",");
//        System.out.println(sb);
        for (int i = sb.lastIndexOf(".") - 3; i > 0; i -= 3) {
            // 1.先在 i = sb.lastIndexOf(".") - 3（小数点往前三个）的位置添加 ","
            // 2.判断 i > 0 ? 若 > 0 则 i = i -3;
            sb = sb.insert(i, ",");
        }
        System.out.println(sb);
    }
}
