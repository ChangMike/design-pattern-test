package com.test.proxy1;

import com.test.proxy1.Flyable.FlyNoWay;
import com.test.proxy1.Quackable.MuteQuack;

public class ModelDuck extends Duck {
    ModelDuck() {
        flyable = new FlyNoWay();
        quackable = new MuteQuack();
    }
    @Override
    public void display() {
        System.out.println("模型鸭");
    }

}
