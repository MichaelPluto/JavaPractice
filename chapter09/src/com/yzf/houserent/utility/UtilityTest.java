package com.yzf.houserent.utility;

public class UtilityTest {
    public static void main(String[] args) {
        //要求输入一个字符串，最大长度为3
//        System.out.println("输入一个字符串");
//        String s = Utility.readString(3);
//        System.out.println("s=" + s);
        //输入一个长度不超过10的字符串，若不输入直接回车将返回一个默认值defaultValue
        System.out.println("输入一个字符串");
        String s1 = Utility.readString(10, "杨质飞是大帅哥");
        System.out.println("s1=" + s1);
    }
}
