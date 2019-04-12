package com.test.decorator;

public class MyTest {
    public static void main(String[] args) {
        DarkRoast darkRoast = new DarkRoast();
        darkRoast.setMilk(true);
        darkRoast.setSoy(true);

        double cost = darkRoast.cost();
        System.out.println(cost);
    }
}
