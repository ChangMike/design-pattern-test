package com.test.factory.factory;

import com.test.factory.pizza.Pizza;

public interface PizzaFactory {
    public Pizza createPizza(String type);
}
