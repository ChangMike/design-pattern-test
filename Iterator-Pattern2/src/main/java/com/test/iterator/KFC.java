package com.test.iterator;

import com.test.iterator.iterator.Iterator;
import com.test.iterator.iterator.ListIterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 肯德基
 */
public class KFC {
    List<MenuItem> menuItems;

    public KFC() {
        menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("汉堡", "大面包", 10.00,  true));
        menuItems.add(new MenuItem("薯条", "土豆条", 5.00,  true));
        menuItems.add(new MenuItem("比萨", "披萨", 20.00,  false));
        menuItems.add(new MenuItem("意大利面", "面条", 15.00,  false));
    }

    public Iterator createIterator() {
        return new ListIterator(menuItems);
    }
}
