package com.test.decorator.beverage;
/**
 * Beverage，饮料类，基类
 */
public abstract class Beverage {
    // 描述
    String description = "";

    public String getDescription() {
        return description;
    }
    // 返回价钱
    public abstract double cost();
}
