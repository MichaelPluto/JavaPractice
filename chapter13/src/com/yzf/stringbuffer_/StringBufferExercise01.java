package com.yzf.stringbuffer_;

public class StringBufferExercise01 {
    public static void main(String[] args) {
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);//看源码
        System.out.println(sb.length());//4
        System.out.println(sb);
        StringBuffer sb1 = new StringBuffer(str);//str == null 空指针异常
        System.out.println(sb1);
    }
}
