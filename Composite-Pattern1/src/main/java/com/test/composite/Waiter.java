package com.test.composite;

/**
 * 服务员
 */
public class Waiter {

    MenuComponent allMenus;

    public Waiter(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
