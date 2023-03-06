package com.yzf;

public class Cay {
    public String name = "招财猫";
    public Cay(){}
    public Cay(String name){
        this.name = name;
    }
    public void hi(){
       // System.out.println("hi " + name);
    }

    public void cry(){
        System.out.println(name + "喵喵叫");
    }
}
