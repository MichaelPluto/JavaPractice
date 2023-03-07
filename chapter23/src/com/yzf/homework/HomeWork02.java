package com.yzf.homework;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class HomeWork02 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<?> fileClass = Class.forName("java.io.File");
        Constructor<?>[] declaredConstructors = fileClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        //指定得到 public java.io.File(java.lang.String)
        Constructor<?> declaredConstructor = fileClass.getDeclaredConstructor(String.class);
        String filePath = "d:\\myNew.txt";
        Object file = declaredConstructor.newInstance(filePath);//创建File对象
        //得到 creatNewFile方法对象
        Method createNewFile = fileClass.getMethod("createNewFile");
        createNewFile.invoke(file);
        //file的运行类型就是File
        System.out.println(file.getClass());
        System.out.println("文件创建成功");

    }
}
