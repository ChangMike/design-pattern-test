package com.test.factory.PizzaIngredientFactory;

import com.test.factory.Ingredient.Cheese.Cheese;
import com.test.factory.Ingredient.Clams.Clams;
import com.test.factory.Ingredient.Dough.Dough;
import com.test.factory.Ingredient.Pepperoni.Pepperoni;
import com.test.factory.Ingredient.Sauce.Sauce;
import com.test.factory.Ingredient.Veggies.Veggies;

/**
 * 比萨原料工厂
 */
public interface PizzaIngredientFactory {
 
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
 
}
