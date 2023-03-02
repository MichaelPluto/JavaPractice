package com.yzf.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP03Server {
    public static void main(String[] args) throws IOException {
        //1.监听9999端口
        ServerSocket serverSocket = new ServerSocket(9999);
        //2.客户端链接到服务端发送，hello,serve,服务端接收后 返回 hello,client 再退出
        System.out.println("已监听9999,等待链接");
        Socket socket1 = serverSocket.accept();
        InputStream inputStream = socket1.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);
        System.out.println("已接收");
        OutputStream outputStream = socket1.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello,client");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        System.out.println("发送完毕");
        bufferedWriter.close();
        bufferedReader.close();
        socket1.close();
        serverSocket.close();
    }
}
