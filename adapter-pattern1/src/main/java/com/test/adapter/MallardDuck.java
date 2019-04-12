package com.test.adapter;

/**
 * 真正的鸭子实现类，绿头鸭
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("绿头鸭叫呱呱叫...");
    }

    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
