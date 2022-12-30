package com.yzf.extend_.exercise;

public class Computer {
    //    编写 Computer 类，包含 CPU、内存、硬盘等属性，getDetails 方法用于返回 Computer 的详细信息
        private String CPU;
        private String Memory;
        private String Harddisk;
        public String getDetail(){
            return "CPU=" + CPU + " " + "内存=" + Memory + " " + "硬盘=" + Harddisk;
        }

    public Computer(String CPU, String memory, String harddisk) {
        this.CPU = CPU;
        Memory = memory;
        Harddisk = harddisk;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getMemory() {
        return Memory;
    }

    public void setMemory(String memory) {
        Memory = memory;
    }

    public String getHarddisk() {
        return Harddisk;
    }

    public void setHarddisk(String harddisk) {
        Harddisk = harddisk;
    }
}
