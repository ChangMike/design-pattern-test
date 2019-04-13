package com.test.observer;

public class WeatherStation {
    public static void main(String[] args) {
        // 创建一个发布者
        WeatherData weatherData = new WeatherData();
        // 创建布告板，把发布者传递进去用来注册自己
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        // 调用发布者的数据更新方法
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
