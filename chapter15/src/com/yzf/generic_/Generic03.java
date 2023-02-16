package com.yzf.generic_;

public class Generic03 {
    public static void main(String[] args) {
        Person<String> person = new Person<String>("杨质飞");
        Person<Integer> person1 = new Person<>(1);
        person.show();//运行类型为 String
        person1.show();//运行类型为 Integer

    }
}
class Person<E>{
    E s;//E 表示 s的数据类型，该数据类型定义在Person对象的时候指定
        //即在编译期间，就确定E时什么类型

    public Person(E s) {//E 也可以时参数类型
        this.s = s;
    }

    public E f(){// 返回类型也可以用E
        return s;
    }

    public void show(){
        System.out.println(s.getClass());//不同类型调用的 e的运行类型不同
    }
}
