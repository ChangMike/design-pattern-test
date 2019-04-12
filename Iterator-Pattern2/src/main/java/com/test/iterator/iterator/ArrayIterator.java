package com.test.iterator.iterator;

import com.test.iterator.MenuItem;

public class ArrayIterator implements Iterator {
    MenuItem[] items;
    int position = 0; // 记录当前数组遍历的位置

    public ArrayIterator(MenuItem[] items) {
        this.items = items;
    }
    @Override
    public boolean hasNext() {
       if (position >= items.length || items[position] == null) {
           return false;
       } else {
           return true;
       }
    }
    @Override
    public MenuItem next() {
        MenuItem item = items[position];
        position += 1;
        return item;
    }
}
