package com.test.proxy1;

import com.test.proxy1.Flyable.FlyWithWings;
import com.test.proxy1.Quackable.Quack;

public class MallardDuck extends Duck {
    MallardDuck () {
        flyable = new FlyWithWings();
        quackable = new Quack();
    }
    @Override
    public void display() {
        System.out.println("绿头鸭");
    }
}
