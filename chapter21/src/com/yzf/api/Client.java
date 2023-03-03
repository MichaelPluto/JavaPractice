package com.yzf.api;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        while (true) {
            Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
            //向服务端发送一个问题
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入你的问题");
            String question = scanner.next();

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write(question);
            bw.newLine();
            bw.flush();

            //接收服务端返回的信息
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String s = br.readLine();
            System.out.println(s);
            //关闭流
            br.close();
            bw.close();
            socket.close();
        }
    }
}
