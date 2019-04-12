package com.test.adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIter implements Iterator {
    Enumeration enumeration;

    public EnumerationIter(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
