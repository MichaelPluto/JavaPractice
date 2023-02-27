package com.yzf.bufferreader_;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "d:\\story2.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath,true));
        /**
         * 默认为覆盖模式
         * 若想要以追加的模式输出，包装流的构造器并不提供追加方法
         * 所以需要再节点流使用追加方法，在节点流的构造器中加入 true即可
         */
        bufferedWriter.write("hello1，杨质飞");
        bufferedWriter.newLine();//换行
        bufferedWriter.write("hello2，杨质飞");
        bufferedWriter.newLine();//换行
        bufferedWriter.write("hello3，杨质飞");
        bufferedWriter.newLine();//换行
        bufferedWriter.write("hello4，杨质飞");
        bufferedWriter.newLine();//换行
        bufferedWriter.close();
    }
}
