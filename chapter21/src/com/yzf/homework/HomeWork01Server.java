package com.yzf.homework;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 使用字符流的方式，编写一个客户端程序和服务端程序
 */
public class HomeWork01Server {
    public static void main(String[] args) throws IOException {
        while (true) {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("已监听到9999端口...");
        Socket socket = serverSocket.accept();

        //接收客户端信息
        BufferedReader bfr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String answer = "";
            String s = bfr.readLine();
            if (s.equals("name")) {
                answer = "我是杨质飞";
            } else if (s.equals("hobby")) {
                answer = "编写java程序";
            } else {
                answer = "你在干啥子？";
            }
            //向客户端发送消息
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            writer.write(answer);
            writer.newLine();
            writer.flush();

            //关闭流
            writer.close();
            bfr.close();
            socket.close();
            serverSocket.close();
        }
    }
}
