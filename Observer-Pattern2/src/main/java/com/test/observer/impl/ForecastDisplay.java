package com.test.observer.impl;

import com.test.observer.DisplayElement;
import com.test.observer.Observer;
import com.test.observer.Subject;
import com.test.observer.WeatherData;

/**
 * 天气预报布告板，实现观察者接口
 * Forecast，预报
 */
public class ForecastDisplay implements Observer, DisplayElement {
    // 发布者对象
    private Subject weatherData;
    // 从发布者那里注销自己
    public void removeFromSubject() {
        weatherData.removeObserver(this);
    }
    public ForecastDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("天气预报：晴");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        display();
    }
}
