package com.test.decorator;

import com.test.decorator.beverage.Beverage;

/**
 * condiment，调料，抽象装饰者类
 */
public abstract class Condiment extends Beverage {
    public abstract String getDescription();
}
