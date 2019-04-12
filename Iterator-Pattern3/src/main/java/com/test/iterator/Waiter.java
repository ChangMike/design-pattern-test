package com.test.iterator;

import com.test.iterator.menu.KFCMenu;
import com.test.iterator.menu.Menu;
import com.test.iterator.menu.Menus;
import com.test.iterator.menu.PancakeMenu;

import java.util.Iterator;
/**
 * 服务员
 */
public class Waiter {
    Menus kfcMenu = new KFCMenu();
    Menus pancakeMenu = new PancakeMenu();

    public void printMenu() {
        Iterator iterator =  kfcMenu.iterator();
        Iterator iterator2 =  pancakeMenu.iterator();
        printIterator(iterator);
        printIterator(iterator2);
    }

    public void printKFCMenu() {
        Iterator iterator = kfcMenu.iterator();
        printIterator(iterator);
    }

    public void printPancakeMenu() {
        Iterator iterator = pancakeMenu.iterator();
        printIterator(iterator);
    }

    private void printIterator(Iterator iterator) {
        while (iterator.hasNext()) {
            Menu next = (Menu) iterator.next();
            System.out.println(next);
        }
    }

}
