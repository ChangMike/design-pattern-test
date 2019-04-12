package com.test.iterator.iterator;

import com.test.iterator.MenuItem;

import java.util.List;

public class ListIterator implements Iterator {
    List<MenuItem> items;
    int position = 0; // 记录当前集合遍历的位置

    public ListIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.size() || items.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items.get(position);
        position += 1;
        return menuItem;
    }
}
