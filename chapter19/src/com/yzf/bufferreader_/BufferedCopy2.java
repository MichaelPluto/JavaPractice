package com.yzf.bufferreader_;

import java.io.*;

public class BufferedCopy2 {
    public static void main(String[] args) {
        String filePath = "d:\\pn.png";
        String filePath1 = "d:\\pn3.png";
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        int readlen = 0;
        byte[] data = new byte[1024];
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(filePath));
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(filePath1));
            while ((readlen = bufferedInputStream.read(data)) != -1){
                bufferedOutputStream.write(data,0,readlen);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedInputStream != null){
                    bufferedInputStream.close();
                }
                if (bufferedOutputStream != null){
                    bufferedOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
