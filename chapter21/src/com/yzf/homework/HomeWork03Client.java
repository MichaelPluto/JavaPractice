package com.yzf.homework;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class HomeWork03Client {
    public static void main(String[] args) throws Exception {
        //创建Socket对象，对本地ip 和 9999端口监听
        Socket socket = new Socket(InetAddress.getByName("192.168.3.12"), 9999);

        //向服务端发送数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入音乐名");
        String key = scanner.next();
        //获取和Socket关联的输出流
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(key.getBytes());
        socket.shutdownOutput();

        //

        //接收服务端传来的文件 并保存在 "d:\\hahaha.mp3"中
        String newPath = "d:\\hahaha.mp3";
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        //将传来的数据储存在数组中
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        //保存到磁盘中
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newPath));
        bos.write(bytes);
        //关闭流
        bos.close();
        bis.close();
        outputStream.close();
        socket.close();
    }
}
