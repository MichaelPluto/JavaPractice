package com.yzf.homework;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class HomeWork01 {
    public static void main(String[] args) throws Exception {
        Class<?> pt = Class.forName("com.yzf.homework.PrivateTest");
        Object o = pt.newInstance();
        //得到私有属性name
        Field name = pt.getDeclaredField("name");
        //修改name属性值
        //爆破
        name.setAccessible(true);
        name.set(o,"卡卡罗特");
        Method getName = pt.getMethod("getName");
        System.out.println(getName.invoke(o));
    }
}
class PrivateTest {
    private String name = "hello kitty";

    public String getName() {
        return name;
    }

}