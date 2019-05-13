package com.test.factory.PizzaStore;

import com.test.factory.Pizza.CheesePizza;
import com.test.factory.Pizza.ClamPizza;
import com.test.factory.Pizza.PepperoniPizza;
import com.test.factory.Pizza.Pizza;
import com.test.factory.PizzaIngredientFactory.NYPizzaIngredientFactory;
import com.test.factory.PizzaIngredientFactory.PizzaIngredientFactory;
import com.test.factory.Pizza.VeggiePizza;

public class NYPizzaStore extends PizzaStore {
 
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory =
			new NYPizzaIngredientFactory();
 
		if (item.equals("cheese")) {
  
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
  
		} else if (item.equals("veggie")) {
 
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("New York Style Veggie Pizza");
 
		} else if (item.equals("clam")) {
 
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
 
		} else if (item.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");
 
		} 
		return pizza;
	}
}
