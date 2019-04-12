package com.test.decorator;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "超优深培";
    }
    @Override
    public double cost() {
        return 9.9F + super.cost();
    }
}
