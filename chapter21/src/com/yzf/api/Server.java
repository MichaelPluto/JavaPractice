package com.yzf.api;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        while (true) {
            ServerSocket serverSocket = new ServerSocket(9999);
            System.out.println("已监听到9999....等待连接");
            Socket socket = serverSocket.accept();

            //接收客户端信息
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String s = br.readLine();
            //判断
            String answer = "";
            if (s.equals("name")) {
                answer = "我是杨质飞";
            } else if (s.equals("hobby")) {
                answer = "编写java程序";
            } else {
                answer = "你说啥呢？";
            }
            //返回客户端信息
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write(answer);
            bw.newLine();
            bw.flush();
            //关闭流
            bw.close();
            br.close();
            socket.close();
            serverSocket.close();
        }
    }
}
