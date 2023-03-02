package com.yzf.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketTCP02Client {
    public static void main(String[] args) throws IOException {
        Socket socket1 = new Socket(InetAddress.getLocalHost(), 9999);
        OutputStream outputStream = socket1.getOutputStream();
        outputStream.write("hello,server".getBytes());
        System.out.println("已发送");
        socket1.shutdownOutput();
        InputStream inputStream = socket1.getInputStream();
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf, 0, readLen));
        }
        System.out.println("已接收完毕");
        inputStream.close();
        outputStream.close();
        socket1.close();
    }
}
