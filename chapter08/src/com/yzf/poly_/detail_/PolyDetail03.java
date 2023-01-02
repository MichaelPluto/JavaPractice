package com.yzf.poly_.detail_;

public class PolyDetail03 {
    //instanceOf 比较操作符，用于判断对象的运行类型是否为 XX 类型或 XX 类型的子类型
    public static void main(String[] args) {
        BB bb = new AA();//运行类型为 AA
        System.out.println(bb instanceof AA );
        System.out.println(bb instanceof BB );// AA 是 BB 的子类

        Object obj = new Object();
        System.out.println(obj instanceof BB);//false 因为 obj运行类型为 Object 是所有类的父类
    }
}
class BB{

}
class AA extends BB{

}
