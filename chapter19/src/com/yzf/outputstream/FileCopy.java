package com.yzf.outputstream;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
@SuppressWarnings({"all"})
public class FileCopy {
    public static void main(String[] args) {
        //完成文件拷贝，将 c:\\pn.png 拷贝到 d:\\
        //思路分析:先输入，再输出，边读边写
        /**
         *
         */
    }
    @Test
    public void Copy(){
        String filePath = "c:\\pn.png";
        String filePath2 = "d:\\pn.png";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(filePath);
            fileOutputStream = new FileOutputStream(filePath2);
            //定义一个字节数组，读取
            byte[] buf = new byte[1024];
            int readlen = 0;
            while ((readlen = fileInputStream.read(buf)) != -1){
                //读取到后就写入文件
                fileOutputStream.write(buf,0,readlen);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭输入流和输出流
            try {
                if (fileInputStream != null){
                    fileInputStream.close();
                }
                if (fileOutputStream != null){
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
