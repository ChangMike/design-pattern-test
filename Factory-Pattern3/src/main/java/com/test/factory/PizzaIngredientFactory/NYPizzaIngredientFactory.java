package com.test.factory.PizzaIngredientFactory;

import com.test.factory.Ingredient.Cheese.Cheese;
import com.test.factory.Ingredient.Cheese.ReggianoCheese;
import com.test.factory.Ingredient.Clams.Clams;
import com.test.factory.Ingredient.Clams.FreshClams;
import com.test.factory.Ingredient.Dough.Dough;
import com.test.factory.Ingredient.Dough.ThinCrustDough;
import com.test.factory.Ingredient.Pepperoni.Pepperoni;
import com.test.factory.Ingredient.Pepperoni.SlicedPepperoni;
import com.test.factory.Ingredient.Sauce.MarinaraSauce;
import com.test.factory.Ingredient.Sauce.Sauce;
import com.test.factory.Ingredient.Veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
 
	public Dough createDough() {
		return new ThinCrustDough();
	}
 
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
 
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
 
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}
 
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}
}
