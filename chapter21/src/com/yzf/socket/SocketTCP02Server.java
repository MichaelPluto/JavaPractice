package com.yzf.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP02Server {
    public static void main(String[] args) throws IOException {
        //1.监听9999端口
        ServerSocket serverSocket = new ServerSocket(9999);
        //2.客户端链接到服务端发送，hello,serve,服务端接收后 返回 hello,client 再退出
        System.out.println("已监听9999,等待链接");
        Socket socket1 = serverSocket.accept();
        InputStream inputStream = socket1.getInputStream();
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf, 0, readLen));
        }
        System.out.println("已接收");
        OutputStream outputStream = socket1.getOutputStream();
        outputStream.write("hello,client".getBytes());

        socket1.shutdownOutput();

        System.out.println("发送完毕");
        outputStream.close();
        inputStream.close();
        socket1.close();
        serverSocket.close();
    }
}
