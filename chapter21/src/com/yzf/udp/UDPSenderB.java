package com.yzf.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPSenderB {
    public static void main(String[] args) throws IOException {

        //创建一个DatagramSocket对象，准备在9998端口 接收数据
        DatagramSocket socket = new DatagramSocket(9998);

        //准备发送数据 hello,明天吃火锅
        byte[] bytes = "hello,明天吃火锅".getBytes();

        //将数据包装在 DatagramPacket中
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length,
                InetAddress.getByName("192.168.3.12"),9999);

        //发送数据
        socket.send(packet);
        System.out.println("发送完毕");

        //接收A 发送的信息
        byte[] buf = new byte[1024];
        DatagramPacket packet1 = new DatagramPacket(buf, buf.length);
        socket.receive(packet1);
        //拆包
        int length = packet1.getLength();
        byte[] data = packet1.getData();
        String s = new String(data, 0, length);
        System.out.println(s);
        System.out.println("已收到");

        //关闭资源
        socket.close();
    }
}
