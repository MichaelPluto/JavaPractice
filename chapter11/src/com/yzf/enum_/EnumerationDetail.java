package com.yzf.enum_;

public class EnumerationDetail {
    public static void main(String[] args) {
        Music.CLASSICALMUSIC.play();
    }
}
interface IPlay{
    public void play();
}
enum  Music implements IPlay{
    CLASSICALMUSIC;

    //枚举类不能再使用继承，因为他默认继承了Enum类
    //枚举类可以实现接口
    @Override
    public void play() {
        System.out.println("播放好听的音乐");
    }
}