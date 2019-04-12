package com.test.adapter;

/**
 * 适配器类，火鸡冒充鸭子
 * 1、实现鸭子接口；2、组合火鸡对象
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
