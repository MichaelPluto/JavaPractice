package com.yzf.qqserver.server;

import com.yzf.qqcommon_.Message;
import com.yzf.qqcommon_.MessageType;
import com.yzf.qqcommon_.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端，监听9999端口，等待客户端连接，并保持通讯
 */
public class QQServer {
    private ServerSocket ss = null;

    public static void main(String[] args) {

    }
    public QQServer() {
        //注意：端口可以写在配置文件.
        try {
            System.out.println("服务端在9999端口监听...");
            ss = new ServerSocket(9999);

            while (true) { //当和某个客户端连接后，会继续监听, 因此while
                Socket socket = ss.accept();//如果没有客户端连接，就会阻塞在这里
                //得到socket关联的对象输入流
                ObjectInputStream ois =
                        new ObjectInputStream(socket.getInputStream());

                //得到socket关联的对象输出流
                ObjectOutputStream oos =
                        new ObjectOutputStream(socket.getOutputStream());
                User u = (User) ois.readObject();//读取客户端发送的User对象
                //创建一个Message对象，准备回复客户端
                Message message = new Message();
                //验证用户 方法
                if (u.getUserId().equals("100") && u.getPasswd().equals("123456")) {//登录通过
                    message.setMesType(MessageType.MESSAGE_LOGIN_SUCCEED);
                    //将message对象回复客户端
                    oos.writeObject(message);
                    //创建一个线程，和客户端保持通信, 该线程需要持有socket对象
                    ServerConnectClientThread serverConnectClientThread =
                            new ServerConnectClientThread(socket, u.getUserId());
                    //启动该线程
                    serverConnectClientThread.start();
                    //把该线程对象，放入到一个集合中，进行管理.
                    ManageServerConnectClientThread.addClientThread(u.getUserId(), serverConnectClientThread);

                } else { // 登录失败
                    System.out.println("用户 id=" + u.getUserId() + " pwd=" + u.getPasswd() + " 验证失败");
                    message.setMesType(MessageType.MESSAGE_LOGIN_FAIL);
                    oos.writeObject(message);
                    //关闭socket
                    socket.close();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            //如果服务器退出了while，说明服务器端不在监听，因此关闭ServerSocket
            try {
                ss.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
