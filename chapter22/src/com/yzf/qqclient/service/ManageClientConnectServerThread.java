package com.yzf.qqclient.service;

import java.util.HashMap;

public class ManageClientConnectServerThread {
    //把多个线程放入一个 HashMap集合, key就是用户id value就是线程
    private static HashMap<String,ClientConnectServerThread> hm = new HashMap<>();

    //将某个线程加入到集合中
    public static void addClientConnectServerThread(String userId, ClientConnectServerThread clientConnectServerThread){
        hm.put(userId,clientConnectServerThread);
    }
    //通过一个get方法获取当前线程
    public static ClientConnectServerThread getClientConnectServerThread(String userId){
        return hm.get(userId);//返回一个线程对象，因为存储在hashmap中
    }
}
