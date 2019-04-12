package com.test.iterator;

import java.util.List;

/**
 * 服务员
 */
public class Waiter {
    public void printMenu() {
        KFC kfc = new KFC();
        List<MenuItem> menuList = kfc.getMenuItems();
        Pancake pancake = new Pancake();
        MenuItem[] menuArr = pancake.getMenuItems();
        for (int i = 0; i < menuList.size(); i++) {
            MenuItem menuItem = menuList.get(i);
            System.out.println(menuItem);
        }
        for (int i = 0; i < menuArr.length; i++) {
            MenuItem menuItem = menuArr[i];
            System.out.println(menuItem);
        }

    }
}
