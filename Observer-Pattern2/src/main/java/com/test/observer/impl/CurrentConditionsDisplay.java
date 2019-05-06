package com.test.observer.impl;

import com.test.observer.DisplayElement;
import com.test.observer.Observer;
import com.test.observer.Subject;

/**
 * 当前天气状况布告板，实现观察者接口
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    // 温度
    private float temperatrue;
    // 湿度
    private float humidity;
    // 发布者对象
    private Subject weatherData;
    // 构造方法实例化发布者并调用传入的发布者的方法注册自己给对方
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    // 从发布者那里注销自己
    public void removeFromSubject() {
        weatherData.removeObserver(this);
    }
    // 被发布者调用
    @Override
    public void update(float temperatrue, float humidity, float pressure) {
        this.temperatrue = temperatrue;
        this.humidity = humidity;
        display();
    }
    // 显示方法
    @Override
    public void display() {
        System.out.println("当前天气: " + temperatrue + "F degrees and " + humidity + "% humidity");
    }
}
