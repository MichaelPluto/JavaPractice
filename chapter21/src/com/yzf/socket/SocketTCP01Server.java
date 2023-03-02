package com.yzf.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP01Server {
    public static void main(String[] args) throws IOException {
        //1.编写一个服务端
        //2.服务端在9999端口监听
        ServerSocket serverSocket = new ServerSocket(9999);
        //3.当没有客户端链接9999端口时，程序会阻塞，等待链接
        System.out.println("已监听,等待链接");
        Socket socket = serverSocket.accept();
        //4.通过Socket.getInputStream()读取客户端写入到数据通道的数据
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readlen = 0;
        while ((readlen = inputStream.read(buf)) != -1){
            System.out.println(new String(buf,0,readlen));
        }
        //5.关闭相应的流 和 socket
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
