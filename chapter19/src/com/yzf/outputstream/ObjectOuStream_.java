package com.yzf.outputstream;

import com.yzf.inputstream.Dog;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOuStream_ {
    public static void main(String[] args) throws Exception{
        //序列化后，保存的文件格式不是文本，而是按照他的格式来保存的
        String path = "d:\\data.dat";
        ObjectOutputStream oop = new ObjectOutputStream(new FileOutputStream(path));
        //序列化数据 到 "d:\\data.dat"
        oop.writeInt(100); // int -> Integer ->实现了Serializable
        oop.writeDouble(90.2);
        oop.writeChar('a');
        oop.writeUTF("hahaha");//传入字符串
        oop.writeObject(new Dog("jack",10));//保存一个对象

        //关闭流
        oop.close();
    }
}
