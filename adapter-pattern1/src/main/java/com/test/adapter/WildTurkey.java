package com.test.proxy1;

/**
 * 真正的火鸡类
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble ...");
    }

    @Override
    public void fly() {
        System.out.println("I am flying a short distance");
    }
}
