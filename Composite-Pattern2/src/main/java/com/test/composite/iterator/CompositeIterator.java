package com.test.composite.iterator;

import com.test.composite.menu.Menu;
import com.test.composite.menu.MenuComponent;

import java.util.Iterator;
import java.util.Stack;

/**
 * 组合迭代器，自定义迭代器
 */
public class CompositeIterator implements Iterator {
    Stack stack = new Stack();
    // 形参iterator里有一个List类型的总菜单；把这个iterator放入一个栈中
    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }
    @Override
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        } else {
            // peek和pop都返回栈顶的值; peek 不删除栈顶的值，pop会把栈顶的值删除
            // 取出栈里的那个iterator
            Iterator iterator = (Iterator) stack.peek();
            // 这个iterator里包含一个总菜单List，总菜单里有没有一个节点（子菜单或菜单项）
            // 如果没有一个节点（子菜单或菜单项），进入代码块
            if (!iterator.hasNext()) {
                // 如果没有一个节点（子菜单或菜单项），把栈清空
                stack.pop();
                // 递归调用，因为已经清空了，所以最终会返回false
                return hasNext();
            } else {
                return true;
            }
        }
    }

    @Override
    public Object next() {
        if (hasNext()) {
            Iterator iterator = (Iterator) stack.peek();
            MenuComponent component = (MenuComponent) iterator.next();
            if (component instanceof Menu) {
                stack.push(component.createIterator());
            }
            return component;
        } else {
            return null;
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
