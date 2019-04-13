package com.test.observer;

public class StatisticsDisplay {
    float temperatrue;

    public void update(float temperatrue, float humidity, float pressure) {
        this.temperatrue = temperatrue;
        display();
    }
    public void display() {
        System.out.println("气象统计(平均气温): " + temperatrue + "F degrees");
    }
}
