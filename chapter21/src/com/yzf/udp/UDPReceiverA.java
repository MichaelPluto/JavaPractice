package com.yzf.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPReceiverA {
    public static void main(String[] args) throws IOException {

        //创建一个 DatagramSocket对象，准备在端口9999 接收数据
        DatagramSocket socket = new DatagramSocket(9999);

        //将需要接收的数据封装到 DatagramPacket ,先创建一个空数组，接收数据
        byte[] buf = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);
        // 调用 接收方法
        // 如果没有收到信息，则会一直阻塞在此
        System.out.println("接收端A，等待接收数据");
        socket.receive(datagramPacket);
        // 把 packet进行拆包，取出数据并显示
        int length = datagramPacket.getLength();
        byte[] data = datagramPacket.getData();
        String s = new String(data, 0, length);
        System.out.println(s);

        byte[] bytes = "好的明天见".getBytes();
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length,
                InetAddress.getByName("192.168.3.12"), 9998);
        socket.send(packet);
        System.out.println("已发送");
        //关闭资源
        socket.close();
    }
}
