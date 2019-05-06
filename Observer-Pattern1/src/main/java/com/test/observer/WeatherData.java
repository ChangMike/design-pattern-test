package com.test.observer;

import org.testng.annotations.Test;

public class WeatherData {
    // 温度
    private float temperatrue;
    // 湿度
    private float humidity;
    // 气压
    private float pressure;
    // 当前天气
    CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
    // 气象统计
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
    // 天气预报
    ForecastDisplay forecastDisplay = new ForecastDisplay();

    public void measurementsChanged() {
        float temperatrue = getTemperatrue();
        float humidity = getHumidity();
        float pressure = getPressure();

        currentConditionsDisplay.update(temperatrue, humidity, pressure);
        statisticsDisplay.update(temperatrue, humidity, pressure);
        forecastDisplay.update(temperatrue, humidity, pressure);
    }

    @Test
    public void myTest() {
        setMeasurements(20, 10, 14);
    }

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
