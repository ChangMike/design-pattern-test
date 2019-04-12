package com.test.decorator;

/**
 * 黑咖啡类
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "黑咖啡";
    }

    public double cost() {
        return 20;
    }
}
