package com.yzf.bufferreader_;

public class Test {
    public static void main(String[] args) {
        BufferReader_ bufferReader_ = new BufferReader_(new FileReader_());
        BufferReader_ bufferReader_1 = new BufferReader_(new StringReader_());
        bufferReader_.readFile(10);
        bufferReader_1.readString();
    }
}
