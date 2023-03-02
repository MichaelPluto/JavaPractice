package com.yzf.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketTCP01Client {
    public static void main(String[] args) throws IOException {
        //1.链接服务端(ip,端口)
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        //2.生成Socket,通过Socket.OutputStream()
        OutputStream outputStream = socket.getOutputStream();
        //3.发送hello,server
        outputStream.write("hello,server".getBytes());
        //4.关闭流对象，和Socket 必须关闭
        outputStream.close();
        socket.close();
        System.out.println("发送完毕");
    }
}
