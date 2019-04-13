package com.test.factory;

import com.test.factory.factory.PizzaFactory;
import com.test.factory.pizza.Pizza;

/**
 * 披萨店类
 */
public class PizzaStore {
	PizzaFactory factory;
 
	public PizzaStore(PizzaFactory factory) {
		this.factory = factory;
	}
 
	public Pizza orderPizza(String type) {
		Pizza pizza;
 
		pizza = factory.createPizza(type);
 
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

}
