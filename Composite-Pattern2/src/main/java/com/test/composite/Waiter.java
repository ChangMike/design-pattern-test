package com.test.composite;

import com.test.composite.menu.MenuComponent;

import java.util.Iterator;

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

    public void printVegetarianMenu() {
        Iterator iterator = allMenus.createIterator();
        System.out.println("素食菜单");
        // 调用CompositeIterator的hasNext方法
        // 如果stack为空返回false; 如果stack不为空，但stack里的Iterator里没有元素也返回false
        while (iterator.hasNext()) {
            MenuComponent component = (MenuComponent) iterator.next();
            try {
                if (component.isVegetarian()) {
                    component.print();
                }
            } catch (UnsupportedOperationException e) {

            }
        }
    }
}
