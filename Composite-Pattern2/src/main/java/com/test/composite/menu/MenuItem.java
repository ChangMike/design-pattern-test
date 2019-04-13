package com.test.composite.menu;

import com.test.composite.iterator.NullIterator;

import java.util.Iterator;

/**
 * 菜单项
 */
public class MenuItem extends MenuComponent{
    String name;
    String description;
    double price;
    // 是否为素食
    boolean vegetarian;

    public MenuItem(String name, String description, double price, boolean vegetarian) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.vegetarian = vegetarian;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public double getPrice() {
        return price;
    }
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public void print() {
        System.out.print("\n" + getName());
        if (isVegetarian()) {
            System.out.print("(v)");
        }
        System.out.print(", " + getPrice());
        System.out.print("    --" + getDescription());
    }
    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }
}
