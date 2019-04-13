package com.test.command.electrical.appliances;

public class Stereo {
    private String CD;
    private int volume;

    public void off() {
        System.out.println("关闭音响了...");
    }
    public void on() {
        System.out.println("打开音响了...");
    }
    public void setCD() {
        this.CD = "LiuDehua";
        System.out.println("演唱者：刘德华");
    }
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("音量设置：" + volume);
    }
}
