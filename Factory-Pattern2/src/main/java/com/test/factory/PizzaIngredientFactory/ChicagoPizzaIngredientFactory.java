package com.test.factory.PizzaIngredientFactory;

import com.test.factory.Ingredient.Cheese.Cheese;
import com.test.factory.Ingredient.Cheese.MozzarellaCheese;
import com.test.factory.Ingredient.Clams.Clams;
import com.test.factory.Ingredient.Clams.FrozenClams;
import com.test.factory.Ingredient.Dough.Dough;
import com.test.factory.Ingredient.Dough.ThickCrustDough;
import com.test.factory.Ingredient.Pepperoni.Pepperoni;
import com.test.factory.Ingredient.Pepperoni.SlicedPepperoni;
import com.test.factory.Ingredient.Sauce.PlumTomatoSauce;
import com.test.factory.Ingredient.Sauce.Sauce;
import com.test.factory.Ingredient.Veggies.BlackOlives;
import com.test.factory.Ingredient.Veggies.Eggplant;
import com.test.factory.Ingredient.Veggies.Spinach;
import com.test.factory.Ingredient.Veggies.Veggies;

public class ChicagoPizzaIngredientFactory
        implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = {new BlackOlives(),
                new Spinach(),
                new Eggplant()};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FrozenClams();
    }
}
