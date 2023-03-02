package com.yzf.upload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 文件上传的服务端
 */
public class TCPFileUploadServer {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("已监听到8888端口...");
        Socket socket = serverSocket.accept();

        //通过Socket得到输入流
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        //并用byte数组储存
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        //将得到的byte数组 写入到指定的路径
        String filePath = "src\\pn.png";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath));
        bos.write(bytes);
        bos.close();

        //向客户端回复 ”收到图片“
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write("收到图片");
        bufferedWriter.flush();
        socket.shutdownOutput();

        //关闭其他流
        bufferedWriter.close();
        bis.close();
        socket.close();
        serverSocket.close();
    }
}
