package com.test.decorator;

/**
 * condiment 调味品
 */
public class Beverage {
    String description = "";

    boolean milk, soy, mocha, whip;

    float milkCost = 1;
    float soyCost = 2;
    float mochaCost = 3;
    float whipCost = 4;

    public double cost() {
        float condimentCost = 0.0F;
        if(hasMilk()) {
            condimentCost += milkCost;
        }
        if(hasSoy()) {
            condimentCost += soyCost;
        }
        if(hasMocha()) {
            condimentCost += mochaCost;
        }
        if(hasWhip()) {
            condimentCost += whipCost;
        }
        return condimentCost;
    }

    public boolean hasMilk() {
        return milk;
    }
    public void setMilk(boolean milk) {
        this.milk = milk;
    }
    public boolean hasSoy() {
        return soy;
    }
    public void setSoy(boolean soy) {
        this.soy = soy;
    }
    public boolean hasMocha() {
        return mocha;
    }
    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }
    public boolean hasWhip() {
        return whip;
    }
    public void setWhip(boolean whip) {
        this.whip = whip;
    }
}
