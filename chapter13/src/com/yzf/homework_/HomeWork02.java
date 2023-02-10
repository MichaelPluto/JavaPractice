package com.yzf.homework_;

import java.util.Scanner;

public class HomeWork02 {
    public static void main(String[] args) {
        try {
            Tool.Test();
            System.out.println("注册成功");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
class Tool {
    public static void Test(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入用户名:");
        String name = scanner.next();
        if (!(name.length() >= 2 && name.length() <= 4 && name != null)){
            throw new RuntimeException("名字长度需要大于2小于4");
        }
        System.out.print("请输入密码:");
        String password = scanner.next();
        //密码为6位，且必须为数字
        if (!(password.length() == 6 && isDigital(password) && password != null)){
            throw new RuntimeException("密码长度必须为6");
        }
        System.out.print("请输入邮箱:");
        String email = scanner.next();
        if (!(email.lastIndexOf("@") < email.lastIndexOf(".") && email.indexOf("@") > 0
        && email.lastIndexOf(".") < email.length() - 1 && email != null)){
            throw new RuntimeException("邮箱中包含@和.  并且@在.前面");
        }
    }
    public static boolean isDigital(String str){
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9'){//ASCAll码 '0'-'9'为数字范围
                return false;
            }
        }
        return true;
    }
}
