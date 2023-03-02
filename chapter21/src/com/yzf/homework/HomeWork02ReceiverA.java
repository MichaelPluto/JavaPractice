package com.yzf.homework;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class HomeWork02ReceiverA {
    public static void main(String[] args) throws IOException {
        while (true) {
            DatagramSocket socket = new DatagramSocket(8888);
            //创建一个空byte[] 用于接收数据
            byte[] bytes = new byte[1025];
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
            System.out.println("A正在监听中");
            socket.receive(packet);

            //拆箱
            String question = "四大名著有哪些";
            String answer = "";
            int length = packet.getLength();
            byte[] data = packet.getData();
            String s = new String(data, 0, length);
            if (s.equals(question)) {
                answer = "四大名著是，《红楼梦》《西游记》《三国演义》《水浒传》";
            } else {
                answer = "what?";
            }
            System.out.println(s);
            byte[] bytes1 = answer.getBytes();

            packet = new DatagramPacket(bytes1, bytes1.length,
                    InetAddress.getByName("192.168.3.12"), 9999);
            socket.send(packet);
            socket.close();
        }
    }
}
