package com.test.iterator.menu;

import com.test.iterator.ArrayIterator;

import java.util.Iterator;

/**
 * 煎饼店菜单类
 */
public class PancakeMenu implements Menus{
    Menu[] Menus;

    public PancakeMenu() {
        Menus = new Menu[4];

        Menus[0] = new Menu("肉夹饼", "肉夹馍", 8.00, true);
        Menus[3] = new Menu("羊肉泡馍", "陕西美食", 20.00, true);
        Menus[1] = new Menu("土豆丝煎饼", "一种薄饼",  10.00, false);
        Menus[2] = new Menu("蛋夹饼", "蛋夹馍", 5.00, false);
    }
    @Override
    public Iterator iterator() {
        return  new ArrayIterator(Menus);
    }
}
