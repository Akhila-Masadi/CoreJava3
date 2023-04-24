package com.examples.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("Test1");
        arrayList.add("Test2");
        arrayList.add("Test3");
        arrayList.add(1,"Test4");
        arrayList.remove(2);

        arrayList.forEach(str-> System.out.println(str));
        for (String str : arrayList) {
            System.out.println(str);

        }


    }
}
