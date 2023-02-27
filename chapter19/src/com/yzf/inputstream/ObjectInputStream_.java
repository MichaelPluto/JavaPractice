package com.yzf.inputstream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStream_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path = "d:\\data.dat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
        //读取
        //反序列话的顺序必须和序列化的顺序一致
        System.out.println(ois.readInt());
        System.out.println(ois.readDouble());
        System.out.println(ois.readChar());
        System.out.println(ois.readUTF());
        Object o = ois.readObject();
        System.out.println("运行类型= "+ o.getClass());
        System.out.println("dog信息= " + o);
        //关闭流
        ois.close();
    }
}
