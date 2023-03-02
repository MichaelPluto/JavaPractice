package com.yzf.homework;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class HomeWork01Client {
    public static void main(String[] args) throws IOException {
        //创建 Socket对象
        while (true) {
        Socket socket = new Socket(InetAddress.getByName("192.168.3.12"),9999);

        //用字符流，发送信息 ,接收信息
        BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        Scanner scanner = new Scanner(System.in);
            System.out.println("请输入你的问题");
            String question = scanner.next();
            bfw.write(question);
            bfw.newLine();
            bfw.flush();
            System.out.println("已发送");
            socket.shutdownOutput();
            //收到服务端的信息
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String s = reader.readLine();
            System.out.println(s);

            reader.close();
            //关闭流
            bfw.close();
            socket.close();
        }
    }
}
