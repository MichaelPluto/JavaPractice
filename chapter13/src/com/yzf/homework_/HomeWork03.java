package com.yzf.homework_;

public class HomeWork03 {
    /*
    编写方法:完成输出格式要求的字符串
        编写java程序，输入形式为: Yang zhi Fei的人们 以 Fei,Yang.Z的形式打印出来
        其中 .Z时中间单词的大写首字母
    思路分析
    1.对输入的字符串进行分割 split(" ") 以空格分割
    2.对得到的String[]数组 进行格式化 String.format()
    3.对输入的字符串进行校验即可

     */
    public static void main(String[] args) {
        String name = "Yang zhi Fei";
            Print(name);
    }
    public static void Print(String name){
        //校验
        if (name == null){
            System.out.println("名字不能为空");
            return;
        }
        String[] split = name.split(" ");
        if (split.length != 3){
            System.out.println("格式错误");
            return;
        }
        String format = String.format("%s,%s.%c", split[2], split[0], split[1].toUpperCase().charAt(0));
        System.out.println(format);
    }
}
