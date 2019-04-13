package com.test.pattern;

import com.test.pattern.bread.Bread;

// 快餐店
public class FoodStore {

    public Bread server(int type) {
        Bread bread = BreakFactory.getBread(type);
        return bread;
    }
}
