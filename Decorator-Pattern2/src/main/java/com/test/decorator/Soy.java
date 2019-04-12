package com.test.decorator;

/**
 * soy，豆奶类，具体装饰者类
 */
public class Soy extends Condiment {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", 豆奶";
    }

    public double cost() {
        return beverage.cost() + 1;
    }
}
