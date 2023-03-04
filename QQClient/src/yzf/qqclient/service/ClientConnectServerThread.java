package yzf.qqclient.service;

import com.yzf.qqcommon_.Message;

import java.io.ObjectInputStream;
import java.net.Socket;

public class ClientConnectServerThread extends Thread{
    //该线程需要持有Socket
    private Socket socket;

    //构造器可以接收一个Socket对象
    public ClientConnectServerThread(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        //因为Thread需要在后台和服务器通信，所以用while循环保证不会中断
        while (true){
            try {
                System.out.println("客户端线程，等待读取服务端消息");
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                //若服务器没有发送Message对象，则线程会在此阻塞
                Message m = (Message) ois.readObject();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public Socket getSocket() {
        return socket;
    }
}
