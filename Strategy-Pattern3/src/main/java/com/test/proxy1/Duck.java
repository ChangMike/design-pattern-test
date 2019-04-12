package com.test.proxy1;

import com.test.proxy1.Flyable.Flyable;
import com.test.proxy1.Quackable.Quackable;

/**
 * 鸭子基类
 */

public abstract class Duck {

    Flyable flyable;

    Quackable quackable;

    public abstract void display();

    void swim() {
        System.out.println("游泳......");
    }

    // perform是执行的意思
    void performFly() {
        flyable.fly();
    }
    void performQuack() {
        quackable.quack();
    }
    void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }
    void setQuackable(Quackable quackable) {
        this.quackable = quackable;
    }
}
