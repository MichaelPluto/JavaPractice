package com.yzf.stringbuffer_;

public class StringAndStringBuffer {
    public static void main(String[] args) {
        //String转换成StringBuffer的方法
        //1.使用构造器 返回值才会转换,str不变
        String str = "hello";
        StringBuffer stringBuffer = new StringBuffer(str);
        //2.使用append
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1.append(str);

        //StringBuffer -> String
        //1.使用StringBuffer提供的 toSting方法
        StringBuffer stringBuffer2 = new StringBuffer("杨质飞");
        String s = stringBuffer2.toString();
        //2.使用构造器方法
        String s1 = new String(stringBuffer2);

    }
}
