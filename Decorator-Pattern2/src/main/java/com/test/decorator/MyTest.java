package com.test.decorator;

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
