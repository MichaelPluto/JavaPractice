package com.yzf.properties_;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Properties01 {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new FileReader("src\\mysql.properties"));
        String line = "";
        while ((line = buf.readLine()) != null){
            String[] split = line.split("=");
            if ("ip".equals(split[0])) {
                System.out.println(split[0] + "值是" + split[1]);
            }
        }
        buf.close();
    }
}
