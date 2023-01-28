package com.yzf.enum_;

public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season2.SPRING);
        System.out.println(Season2.SUMMER);
        System.out.println(Season2.AUTUMN);
        System.out.println(Season2.WINTER);
    }
}
//自定义枚举
class Season2 {
    private String name;
    private String desc;//描述
    /*
    1.构造器私有化
    2.删除setXxx方法，防止修改
    3.在类中创建固定的对象，static
    4.使用final方法进行优化
     */
    public static final Season2 SPRING = new Season2("春天", "温暖");
    public static final Season2 SUMMER = new Season2("夏天", "炎热");
    public static final Season2 AUTUMN = new Season2("秋天", "凉爽");
    public static final Season2 WINTER = new Season2("冬天", "寒冷");
    private Season2(String name, String desc) {
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
