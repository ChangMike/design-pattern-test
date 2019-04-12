package com.test.Pattern;

/**
 * 鸭子基类
 */

public abstract class Duck {
    public abstract void display();
    void swim() {
        System.out.println("游泳......");
    }
    // quack，（鸭子）发出嘎嘎声
    void quack() {
        System.out.println("嘎嘎叫......");
    }
    void fly() {
        System.out.println("飞翔......");
    }
}
