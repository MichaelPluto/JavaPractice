package com.yzf.qqclient.view;


import com.yzf.util.Utility;
import com.yzf.qqclient.service.UserClientService;

public class QQView {
    public static void main(String[] args) {
        new QQView().mainMenu();
        System.out.println("退出系统");
    }

    private boolean loop = true;
    private String key = "";
    private UserClientService userClientService = new UserClientService();//用于登录服务器/注册用户
    public void mainMenu() {
        while (loop) {
            System.out.println("======欢迎登录网络通信系统======");
            System.out.println("         1 登录系统           ");
            System.out.println("         9 退出系统           ");
            System.out.print("请输入你的选择: ");
            key = Utility.readString(1);
            switch (key) {
                case "1":
                    System.out.print("请输入用户号: ");
                    String userId = Utility.readString(50);
                    System.out.print("请输入密  码: ");
                    String password = Utility.readString(50);
                    if (userClientService.checkUser(userId,password)) {
                        System.out.println("======欢迎" + userId + "用户======");
                        System.out.println("\n======网络通信系统二级菜单(用户" + userId + ")======");
                        while (loop){
                            System.out.println("\t\t 1 显示在线用户列表");
                            System.out.println("\t\t 2 群发消息");
                            System.out.println("\t\t 3 私聊消息");
                            System.out.println("\t\t 3 发送文件");
                            System.out.println("\t\t 9 退出系统");
                            key = Utility.readString(1);
                            switch (key){
                                case "1":
                                    System.out.println("====当前在线用户列表====\n");
                                    break;
                                case "2":
                                    System.out.println("====群发消息====\n");
                                    break;
                                case "3":
                                    System.out.println("====私聊消息====\n");
                                    break;
                                case "4":
                                    System.out.println("====发送文件====\n");
                                    break;
                                case "9":
                                    System.out.println("====退出系统====\n");
                                    loop = false;
                                    break;
                                default:
                                    System.out.println("输入有误\n");
                                    break;
                            }
                        }
                    }else {
                        System.out.println("登录失败");
                        break;
                    }
                    break;
                case "9":
                    loop = false;
                    break;
            }
        }
    }
}
