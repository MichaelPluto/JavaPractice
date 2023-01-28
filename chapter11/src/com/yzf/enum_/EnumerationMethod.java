package com.yzf.enum_;

public class EnumerationMethod {
    //enum常用的方法
    public static void main(String[] args) {
        Season3 autumn = Season3.AUTUMN;
        //1.name方法，返回但当前对象名
        System.out.println(autumn.name());//AUTUMN
        //2.ordinal:放回当前对象的位置号，（对象号是默认从0开始）
        System.out.println(autumn.ordinal());//春夏秋冬 秋在第三位所以位置号为2
        //3.values: 返回当前枚举类中所有的常量
        Season3[] values = Season3.values();
        for (Season3 season3 : values){
            System.out.println(season3);
        }
        System.out.println("==============");
        //4.valueOf: 将字符串转变换成枚举对象，要求字符串必须为已有的常量名
        Season3 spring = Season3.valueOf("SPRING");
        System.out.println(spring);
        System.out.println("===============");
        //5.compare To: 比较两个枚举常量的编号，输出结果为第一个编号减去第二个编号的值
        System.out.println(Season3.WINTER.compareTo(Season3.SPRING));
    }
}
