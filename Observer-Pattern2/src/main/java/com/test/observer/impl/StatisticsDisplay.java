package com.test.observer.impl;

import com.test.observer.DisplayElement;
import com.test.observer.Observer;
import com.test.observer.Subject;
import com.test.observer.WeatherData;

/**
 * 气象统计布告板，实现观察者接口
 * Statistics，统计
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    float temperatrue;
    // 发布者对象
    private Subject weatherData;
    // 从发布者那里注销自己
    public void removeFromSubject() {
        weatherData.removeObserver(this);
    }
    public StatisticsDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("气象统计(平均气温): " + temperatrue + "F degrees");
    }

    @Override
    public void update(float temperatrue, float humidity, float pressure) {
        this.temperatrue = temperatrue;
        display();
    }
}
