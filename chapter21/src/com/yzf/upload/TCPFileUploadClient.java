package com.yzf.upload;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 文件上传的客户端
 */
public class TCPFileUploadClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        String filePath = "d:\\pn.png";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));
        //使用工具类，将读取到的数据存入一个byte数组
        byte[] bytes = StreamUtils.streamToByteArray(bis);

        //通过 socket获取到输出流，将bytes数据发送给服务端
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes);
        bis.close();
        socket.shutdownOutput();//设置写入数据的结束标记

        //接收从服务端回复的信息
        InputStream inputStream = socket.getInputStream();
        //使用StreamUtils的 方法 直接将 读取到的内容转成字符串
        String s = StreamUtils.streamToString(inputStream);
        System.out.println(s);
        //关闭其他流
        inputStream.close();
        bos.close();
        socket.close();

    }
}
