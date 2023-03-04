package com.yzf.qqclient.service;

import com.yzf.qqcommon_.Message;
import com.yzf.qqcommon_.MessageType;
import com.yzf.qqcommon_.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * 该类完成用户登录验证和用户注册等功能
 */
public class UserClientService {

    //因为可能在其他敌方使用user信息 所有设置为一个成员属性
    private User u = new User();

    //根据userId 和 passwd 到服务器验证该用户是否合法
    public boolean checkUser(String userId, String passwd){
        boolean b = false;
        //创建 User对象
        u.setUserId(userId);
        u.setPasswd(passwd);
        //连接到服务端，发送 u对象

        try {
            Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 9999);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(u);

            //读取从服务器中回复的Message对象
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            Message m = (Message) ois.readObject();
            //判断是否发送成功
            if (m.equals(MessageType.MESSAGE_LOGIN_SUCCEED)){//登录OK
                //成功，则需要创建一个和服务器端保持通信的线程
                //创建一个 ClientConnectServerThread
                ClientConnectServerThread ccst = new ClientConnectServerThread(socket);
                //启动线程
                ccst.start();

                //为了后面客户端的扩展, 将线程放入到集合中管理
                ManageClientConnectServerThread.addClientConnectServerThread(userId,ccst);
                        b = true;
            }else {//登录失败
                //如果登录失败，就不能启动和服务端通信的线程,关闭socket
                socket.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }
}
