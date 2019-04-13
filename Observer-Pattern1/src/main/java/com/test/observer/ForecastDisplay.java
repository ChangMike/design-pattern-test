package com.test.observer;

public class ForecastDisplay {
    public void update(float temperatrue, float humidity, float pressure) {
        display();
    }
    public void display() {
        System.out.println("天气预报：晴");
    }
}
