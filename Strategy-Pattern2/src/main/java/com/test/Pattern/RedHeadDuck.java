package com.test.Pattern;

public class RedHeadDuck extends Duck implements Flyable, Quackable {
    @Override
    public void display() {
        System.out.println("红头鸭");
    }

    @Override
    public void fly() {
        System.out.println("飞翔......");
    }

    @Override
    public void quack() {
        System.out.println("嘎嘎叫......");
    }
}
