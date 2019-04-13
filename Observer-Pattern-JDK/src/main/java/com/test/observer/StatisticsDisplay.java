package com.test.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 气象统计布告板，实现观察者接口
 * Statistics，统计
 */
public class StatisticsDisplay implements Observer {
    float temperatrue;
    // 发布者对象
    private Observable weatherData;
    // 从发布者那里注销自己
    public void removeFromSubject() {
        weatherData.deleteObserver(this);

    }
    // 构造方法，注册自己
    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }
    public void display() {
        System.out.println("气象统计(平均气温): " + temperatrue + "F degrees");
    }
    @Override
    public void update(Observable observable, Object arg) {
        if(observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            // 调用发布者的公开getter方法
            this.temperatrue = weatherData.getTemperatrue();
            display();
        }
    }
}
