package com.test.observer;

public class CurrentConditionsDisplay {
    // 温度
    private float temperatrue;
    // 湿度
    private float humidity;

    public void update(float temperatrue, float humidity, float pressure) {
        this.temperatrue = temperatrue;
        this.humidity = humidity;
        display();
    }
    // 显示方法
    public void display() {
        System.out.println("当前天气: " + temperatrue + "F degrees and " + humidity + "% humidity");
    }

}
