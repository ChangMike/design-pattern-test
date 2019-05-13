package com.test.decorator;

import com.test.decorator.beverage.Beverage;
import com.test.decorator.beverage.Espresso;
import com.test.decorator.beverage.HouseBlend;

public class MyTest {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        Beverage houseBlend = new HouseBlend();
        Beverage MochaHouse = new Mocha(houseBlend);
        Beverage MochaMochaHouse = new Mocha(MochaHouse);
        Beverage soyMochaMochaHouse = new Soy(MochaMochaHouse);
        System.out.println(soyMochaMochaHouse.getDescription() + " $" + soyMochaMochaHouse.cost());

    }
}
