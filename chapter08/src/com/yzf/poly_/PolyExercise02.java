package com.yzf.poly_;

public class PolyExercise02 {
    public static void main(String[] args) {
        //属性看编译 方法看运行
        Sub s = new Sub();
        System.out.println(s.count);//20 s的编译类型是 Sub 所以直接在Sub里找count属性
        s.display();//20 s的运行类型是 Sub 所以直接在Sub里找方法 display()
        Base b = s;  // 等同于 Base b = new Sub() 向上转型
                    //
        System.out.println(b == s);//true b 与 s 此时指向同一个对象 Sub内存
        System.out.println(b.count);//10 b的编译类型是 Base 所以直接在 Base里找count属性
        b.display();//20 b的运行类型是 Sub 所以直接在Sub里找方法 display()
    }
}
