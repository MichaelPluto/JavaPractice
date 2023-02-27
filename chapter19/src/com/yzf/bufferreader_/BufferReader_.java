package com.yzf.bufferreader_;

public class BufferReader_ extends Reader_{
    private Reader_ reader_;

    public BufferReader_(Reader_ reader_) {
        this.reader_ = reader_;
    }
    //可以重写，也可以在此基础上加强节点流方法
    public void readFile(int num) {
        for (int i = 0; i < num; i++) {
            reader_.readFile();
        }
    }

    @Override
    //普通重写
    public void readString() {
        reader_.readString();
    }
}
