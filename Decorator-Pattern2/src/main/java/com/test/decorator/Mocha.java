package com.test.decorator;

import com.test.decorator.beverage.Beverage;

/**
 * mocha，摩卡，具体装饰者类
 */
public class Mocha extends Condiment {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", 摩卡";
    }

    public double cost() {
        return beverage.cost() + 5;
    }
}
