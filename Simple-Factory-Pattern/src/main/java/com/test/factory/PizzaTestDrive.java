package com.test.factory;

import com.test.factory.factory.ChicagoPizzaFactory;
import com.test.factory.factory.NYPizzaFactory;
import com.test.factory.factory.SimplePizzaFactory;
import com.test.factory.pizza.Pizza;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);
		Pizza pizza = store.orderPizza("cheese");
		System.out.println("We ordered a " + pizza.getName() + "\n");

		NYPizzaFactory nyPizzaFactory = new NYPizzaFactory();
		PizzaStore nyStore = new PizzaStore(nyPizzaFactory);
		pizza = nyStore.orderPizza("veggie");
		System.out.println("We ordered a " + pizza.getName() + "\n");

		ChicagoPizzaFactory chicagoPizzaFactory = new ChicagoPizzaFactory();
		PizzaStore pizzaStore = new PizzaStore(chicagoPizzaFactory);
		pizza = pizzaStore.orderPizza("veggie");
		System.out.println("We ordered a " + pizza.getName() + "\n");
    }
}
