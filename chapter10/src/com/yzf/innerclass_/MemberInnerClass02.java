package com.yzf.innerclass_;

public class MemberInnerClass02 {
    public static void main(String[] args) {
        Outer07 outer07 = new Outer07();
        //外部其他类访问成员内部类 有两种方式
    //第一种
        Outer07.Inner07 inner07 = outer07.new Inner07();
                inner07.hi();
    //第二种，在外部类写一个方法返回Inner07对象
        outer07.get().hi();
    }
}
class Outer07 {
    private int n1 = 10;
    private String name = "jack";
    //外部类访问成员内部类->创建对象，再访问
    public void test(){
        Inner07 inner07 = new Inner07();
        inner07.hi();
    }
    //作用域 为整个类体
    //可以添加修饰符，因为相当于外部类的成员
    public class Inner07 {
        //内部访问外部类属性 ->直接访问
        public void hi(){
            System.out.println(n1 + " " +name);
        }
    }
    public Inner07 get(){
        Inner07 inner07 = new Inner07();
        return inner07;
    }
}