package com.test.observer;
/**
 * 主题类，也就是发布者类
 */
public interface Subject {
    // 注册一个观察者
    public void registerObserver(Observer observer);
    // 删除一个观察者
    public void removeObserver(Observer observer);
    // 通知所有的观察者
    public void notyfyObservers();
}
