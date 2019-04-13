package com.test.factory.PizzaStore;

import com.test.factory.Pizza.CheesePizza;
import com.test.factory.Pizza.ClamPizza;
import com.test.factory.Pizza.PepperoniPizza;
import com.test.factory.Pizza.Pizza;
import com.test.factory.PizzaIngredientFactory.ChicagoPizzaIngredientFactory;
import com.test.factory.PizzaIngredientFactory.PizzaIngredientFactory;
import com.test.factory.Pizza.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory =
		new ChicagoPizzaIngredientFactory();

		if (item.equals("cheese")) {

			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");

		} else if (item.equals("veggie")) {

			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("Chicago Style Veggie Pizza");

		} else if (item.equals("clam")) {

			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago Style Clam Pizza");

		} else if (item.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("Chicago Style Pepperoni Pizza");

		}
		return pizza;
	}
}
