package com.test.observer;

import java.util.Observable;

public class WeatherData extends Observable {
    // 温度
    private float temperatrue;
    // 湿度
    private float humidity;
    // 气压
    private float pressure;

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }
    // 调用上面的方法
    public void setMeasurements(float temperatrue, float humidity, float pressure) {
        this.temperatrue = temperatrue;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
    public float getTemperatrue() {
        return temperatrue;
    }
    public float getHumidity() {
        return humidity;
    }
    public float getPressure() {
        return pressure;
    }
}
