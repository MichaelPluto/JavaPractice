package com.yzf.homework;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class HomeWork03Server {
    public static void main(String[] args) throws Exception {

        //创建一个服务端对象,在9999端口监听
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("已监听到9999端口...等待连接");
        Socket socket = serverSocket.accept();

        //接收客户端信息
        InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
        byte[] bytes = new byte[1024];
        int len = 0;
        String downLoadFileName = "";
        while ((len = inputStreamReader.read()) != -1) {
            downLoadFileName += new String(bytes, 0, len);
        }
        System.out.println("已收到" + downLoadFileName);
        String resFileName = "";
        if (downLoadFileName.equals("高山流水")) {
            resFileName = "src\\高山流水.mp3";
        } else {
            resFileName = "src\\无名.mp3";
        }
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(resFileName));

        //使用工具类，将文件读取到一个字节数组中
        byte[] b = StreamUtils.streamToByteArray(bis);
        //将文件返回给客户端
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(b);
        socket.shutdownOutput();
        //关闭流
        bis.close();
        inputStreamReader.close();
        socket.close();
        serverSocket.close();
    }
}
