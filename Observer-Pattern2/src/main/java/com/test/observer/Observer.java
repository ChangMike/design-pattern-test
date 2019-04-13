package com.test.observer;
/**
 * 观察者类
 */
public interface Observer {
    // 被发布者调用
    public void update(float temp, float humidity, float pressure);
}
