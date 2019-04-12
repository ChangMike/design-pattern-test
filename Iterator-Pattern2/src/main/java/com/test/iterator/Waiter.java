package com.test.iterator;

import com.test.iterator.iterator.Iterator;

/**
 * 服务员
 */
public class Waiter {
    KFC kfc = new KFC();
    Pancake pancake = new Pancake();

    public void printMenu() {
        Iterator iterator = kfc.createIterator();
        Iterator iterator2 = pancake.createIterator();
        printIterator(iterator);
        printIterator(iterator2);
    }

    private void printIterator(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem next = iterator.next();
            System.out.println(next);
        }
    }
}
