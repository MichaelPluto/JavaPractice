package com.yzf.interface_;

public class InterfacePolyArr {
    public static void main(String[] args) {
        Usb[] usbs = new Usb[2];
        usbs[0] = new Phone_();
        usbs[1] = new Camera_();
        for (int i = 0; i < usbs.length; i++) {
            usbs[i].usb();
            if (usbs[i] instanceof Phone_){
                ((Phone_) usbs[i]).call();
            }
        }
    }
}
interface Usb{
    void usb();
}
class Phone_ implements Usb{
    public void call(){
        System.out.println("您拨打的电话正在通话中...");
    }
    @Override
    public void usb() {
        System.out.println("手机正在运行");
    }
}
class Camera_ implements Usb{

    @Override
    public void usb() {
        System.out.println("相机正在运行");
    }
}
