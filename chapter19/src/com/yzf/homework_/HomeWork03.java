package com.yzf.homework_;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Properties;

public class HomeWork03 {
    public static void main(String[] args) throws IOException {
        String filePath = "src\\dog.properties";
        Properties properties = new Properties();
        properties.load(new FileReader(filePath));
        String name = properties.get("name") + "";//Object -> String
        int age = Integer.parseInt(properties.get("age") + "");
        String  color = properties.get("color") + "";
        Dog dog = new Dog(name, age, color);
        System.out.println(dog);
        //序列化
        String path = "d:\\dog.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
        oos.writeObject(dog);
        oos.close();
    }
    //反序列化,编写一个方法反序列化dog
    @Test
    public void method() throws IOException, ClassNotFoundException {
        String path = "d:\\dog.dat";
        int line = 0;
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
        Dog dog = (Dog) ois.readObject();
        System.out.println("反序列化后");
        System.out.println(dog);
        ois.close();
    }
}
class Dog implements Serializable{
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}