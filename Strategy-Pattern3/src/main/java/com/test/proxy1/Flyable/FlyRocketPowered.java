package com.test.proxy1.Flyable;

public class FlyRocketPowered implements Flyable {
    @Override
    public void fly() {
        System.out.println("使用火箭动力飞翔......");
    }
}
