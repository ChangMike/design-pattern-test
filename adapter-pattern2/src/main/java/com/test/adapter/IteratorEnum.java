package com.test.proxy1;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnum implements Enumeration {
    Iterator iterator;

    public IteratorEnum(Iterator iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
