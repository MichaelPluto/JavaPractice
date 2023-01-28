package com.yzf.enum_;

public class Enumeration03 {
    public static void main(String[] args) {
        System.out.println(Season3.SPRING instanceof Enum);
    }
}
//使用enum关键字枚举
/*
1.使用enum关键字替代class
2.用对象名+构造器参数的方式代替创建对象的过程
    eg：SPRING("春天", "温暖")代替 ->
3.使用enum关键字需要将 定义常量对象 放在最前面
4.如果有多个常量对象，用 , 隔开
    public static final Season2 SPRING = new Season2("春天", "温暖");
5.如果使用无参构造器枚举对象，则小括号和实参列表都可以省略
 */
enum Season3 {
    SPRING("春天", "温暖"),SUMMER("夏天", "炎热"),
    AUTUMN("秋天", "凉爽"),WINTER("冬天", "寒冷")/*,
    WHAT*/;
    private String name;
    private String desc;//描述
    private Season3(){

    }
//    public static final Season2 SPRING = new Season2("春天", "温暖");
//    public static final Season2 SUMMER = new Season2("夏天", "炎热");
//    public static final Season2 AUTUMN = new Season2("秋天", "凉爽");
//    public static final Season2 WINTER = new Season2("冬天", "寒冷");
    private Season3(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season2{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
