package com.yzf.homework;

import java.io.BufferedWriter;
import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class HomeWork02SenderB {
    public static void main(String[] args) throws IOException {
        while (true) {
            DatagramSocket socket = new DatagramSocket(9999);
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入问题");
            String question = scanner.next();
            byte[] bytes = question.getBytes();
            //封装信息
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.3.12"), 8888);
            socket.send(packet);


            //接收信息
            bytes = new byte[1024];
            packet = new DatagramPacket(bytes, bytes.length);
            socket.receive(packet);

            //拆包
            byte[] data = packet.getData();
            int length = packet.getLength();
            String s = new String(data, 0, length);
            System.out.println(s);
            socket.close();
        }
    }
}
