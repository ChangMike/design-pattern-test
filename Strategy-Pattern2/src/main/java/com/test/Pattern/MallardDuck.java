package com.test.Pattern;

import com.test.Pattern.abstracts.Duck;
import com.test.Pattern.abstracts.Flyable;
import com.test.Pattern.abstracts.Quackable;

/**
 * 野鸭类
 */

public class MallardDuck extends Duck implements Flyable, Quackable {
    @Override
    public void display() {
        System.out.println("绿头鸭");
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
