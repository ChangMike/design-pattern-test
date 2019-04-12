package com.test.adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class MyTest {
    public static void main(String[] args) {
        // ArrayList支持迭代器接口，不支持枚举接口
        List<String> strList = new ArrayList<>();
        strList.add("一");
        strList.add("二");
        strList.add("三");

        EnumerationIter enumerationIterator = new EnumerationIter(new Vector<String>(strList).elements());
        while (enumerationIterator.hasNext()) {
            System.out.println(enumerationIterator.next());
        }
    }
}
