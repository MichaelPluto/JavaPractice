package com.yzf.reflection;

import java.lang.reflect.Field;

/**
 * 演示反射操作属性
 */
public class ReflectAccessProperty {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {

        //1.得到Student类对应的 Class对象
        Class<?> stuClass = Class.forName("com.yzf.reflection.Student");
        //2.创建对象
        Object o = stuClass.newInstance();
        //3. 使用反射得到 age
        Field age = stuClass.getField("age");//只能获取公有属性
        System.out.println(age.get(o));
        //4. 使用反射改变age
        age.set(o,12);
        System.out.println(age.get(o));
        //5. 使用反射操作 name属性
        Field name = stuClass.getDeclaredField("name");//因为 name 是私有的
        //若想要获取 需要进行爆破
        name.setAccessible(true);
        System.out.println(name.get(o));
        //(1)
        name.set(o,"老杨");
        System.out.println(name.get(o));
        //(2) 不用爆破
        name.set(null,"老王");//只有成员为静态时，才可以填null
        System.out.println(name.get(null));



    }
}
class Student{
    public int age;
    private static String name;

    public Student(){

    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age + "name" + name +
                '}';
    }
}