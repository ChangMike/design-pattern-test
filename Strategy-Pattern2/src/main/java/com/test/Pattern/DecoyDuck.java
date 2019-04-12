package com.test.Pattern;

/**
 * 诱饵鸭，木头假鸭，不会飞也不会叫
 */
public class DecoyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("木头鸭");
    }
}
