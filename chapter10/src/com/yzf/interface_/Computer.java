package com.yzf.interface_;

public class Computer {
    public void work(UsbInterface usbInterface){
        usbInterface.start();
        usbInterface.end();
    }
}
