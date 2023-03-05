package com.yzf.qqserver.server;

import com.yzf.qqcommon_.Message;

import java.io.ObjectInputStream;
import java.net.Socket;

public class ServerConnectClientThread  extends Thread {
    private Socket socket;
    private String userId;//连接到服务端的用户id

    public ServerConnectClientThread(Socket socket, String userId) {
        this.socket = socket;
        this.userId = userId;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("服务端和客户端" + userId + " 保持通信，读取数据...");
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                Message message = (Message) ois.readObject();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
