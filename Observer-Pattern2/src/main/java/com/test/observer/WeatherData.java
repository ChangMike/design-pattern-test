package com.test.observer;

import java.util.ArrayList;
/**
 * 发布者实现类
 */
public class WeatherData implements Subject {
    // 观察者集合
    private ArrayList<Observer> observers;
    // 温度
    private float temperatrue;
    // 湿度
    private float humidity;
    // 气压
    private float pressure;
    // 构造方法实例化成员变量——集合变量
    public WeatherData() {
        observers = new ArrayList<>();
    }
    // 注册一个观察者
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    // 删除一个观察者
    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if(i >= 0) {
            observers.remove(i);
        }
    }
    // 通知所有的观察者
    @Override
    public void notyfyObservers() {
        for (int i=0; i<observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(temperatrue, humidity, pressure);
        }
    }
    // 调用上面的方法
    public void measurementsChanged() {
        notyfyObservers();
    }
    // 调用上面的方法
    public void setMeasurements(float temperatrue, float humidity, float pressure) {
        this.temperatrue = temperatrue;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
