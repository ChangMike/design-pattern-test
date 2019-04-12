package com.test.iterator.menu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 肯德基菜单类
 */
public class KFCMenu implements Menus {
    List MenusList;

    public KFCMenu() {
        MenusList = new ArrayList<>();
        MenusList.add(new Menu("汉堡", "大面包", 10.00,  true));
        MenusList.add(new Menu("薯条", "土豆条", 5.00,  true));
        MenusList.add(new Menu("比萨", "披萨", 20.00,  false));
        MenusList.add(new Menu("意大利面", "面条", 15.00,  false));
    }
    @Override
    public Iterator iterator() {
        return  MenusList.iterator();
    }
}
