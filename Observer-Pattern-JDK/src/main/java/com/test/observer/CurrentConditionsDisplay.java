package com.test.observer;

import java.util.Observable;
import java.util.Observer;
/**
 * 当前天气状况布告板，实现观察者接口
 */
public class CurrentConditionsDisplay implements Observer {
    // 发布者对象
    private Observable observable;
    // 温度
    private float temperatrue;
    // 湿度
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }
    @Override
    public void update(Observable observable, Object object) {
        if(observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            // 调用发布者的公开getter方法
            this.temperatrue = weatherData.getTemperatrue();
            // 调用发布者的公开getter方法
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
    public void display() {
        System.out.println("当前天气: " + temperatrue + "F degrees and " + humidity + "% humidity");
    }
}
