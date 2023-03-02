package com.yzf.api;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class API_ {
    public static void main(String[] args) throws UnknownHostException {
        //1.获取本机的InetAddress对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);

        //2.根据指定主机名 获取 InetAddress对象
        InetAddress host1 = InetAddress.getByName("PC-202211211726");
        System.out.println(host1);

        //3.根据域名返回 InetAddress 对象, 比如 www.baidu.com 对象
        InetAddress host2 = InetAddress.getByName("www.baidu.com");
        System.out.println(host2);

        //4.通过 InetAddress对象, 获取主机对应的地址
        String hostAddress = host2.getHostAddress();
        System.out.println(hostAddress);

        //5. 通过 InetAddress对象 获取对应的主机名/或者域名
        String hostName = host2.getHostName();
        System.out.println(hostName);
    }
}
