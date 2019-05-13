package com.test.decorator.beverage;

import com.test.decorator.beverage.Beverage;

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
