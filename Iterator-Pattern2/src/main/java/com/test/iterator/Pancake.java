package com.test.iterator;

import com.test.iterator.iterator.ArrayIterator;
import com.test.iterator.iterator.Iterator;

/**
 * 煎饼店
 */
public class Pancake {
    MenuItem[] menuItems;

    public Pancake() {
        menuItems = new MenuItem[4];

        menuItems[0] = new MenuItem("肉夹饼", "肉夹馍", 8.00, true);
        menuItems[3] = new MenuItem("羊肉泡馍", "陕西美食", 20.00, true);
        menuItems[1] = new MenuItem("土豆丝煎饼", "一种薄饼",  10.00, false);
        menuItems[2] = new MenuItem("蛋夹饼", "蛋夹馍", 5.00, false);
    }

    public Iterator createIterator() {
        return new ArrayIterator(menuItems);
    }
}
