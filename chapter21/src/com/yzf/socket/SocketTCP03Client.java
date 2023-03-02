package com.yzf.socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class SocketTCP03Client {
    public static void main(String[] args) throws IOException {
        Socket socket1 = new Socket(InetAddress.getLocalHost(), 8888);
        OutputStream outputStream = socket1.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello,server");
        bufferedWriter.newLine();// 插入一个换行符，表示写入内容结束，服务端必须用readLine 读才行
        bufferedWriter.flush();// 使用字符流则需要手动刷新
        System.out.println("已发送");
        socket1.shutdownOutput();

        InputStream inputStream = socket1.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);
        System.out.println("已接收完毕");
        bufferedReader.close();
        bufferedWriter.close();
        socket1.close();

        //关闭其他资源
    }
}
