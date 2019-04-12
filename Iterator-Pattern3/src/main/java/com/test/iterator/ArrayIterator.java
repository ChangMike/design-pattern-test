package com.test.iterator;

import com.test.iterator.menu.Menu;
import java.util.Iterator;

/**
 * 使用java内置的迭代器
 * java内置的迭代器支持List，所以List的迭代器实现就不需要我们写了
 * java内置的迭代器不支持数组，所以我们还需要实现数组的迭代器
 */
public class ArrayIterator implements Iterator {
    Menu[] items;
    int position = 0; // 记录当前数组遍历的位置

    public ArrayIterator(Menu[] items) {
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
    public Menu next() {
        Menu item = items[position];
        position += 1;
        return item;
    }

    @Override
    public void remove() {

    }
}
