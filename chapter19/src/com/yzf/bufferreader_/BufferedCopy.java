package com.yzf.bufferreader_;

import java.io.*;

public class BufferedCopy {
    public static void main(String[] args) {
        String filePath = "d:\\story2.txt";
        String filePath1 = "d:\\story3.txt";
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        String line;
        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
            bufferedWriter = new BufferedWriter(new FileWriter(filePath1));
            while ((line = bufferedReader.readLine()) != null){
                bufferedWriter.write(line);
                //换行
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null){
                    bufferedReader.close();
                }
                if (bufferedWriter != null){
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
