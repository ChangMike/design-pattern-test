package com.test.decorator;

/**
 * 浓缩咖啡类
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "浓缩咖啡";
    }

    public double cost() {
        return 10;
    }
}
