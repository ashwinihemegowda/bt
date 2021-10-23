package com.torryharris.collection;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> integerTreeSet=new TreeSet<>();
        integerTreeSet.add(10);
        integerTreeSet.add(5);
        integerTreeSet.add(15);
        integerTreeSet.add(4);
        integerTreeSet.add(7);
        integerTreeSet.add(2);
        integerTreeSet.add(13);
        System.out.println(integerTreeSet);
        integerTreeSet.add(10);
        integerTreeSet.add(1);
        System.out.println(integerTreeSet);
        TreeSet<String> stringTreeSet=new TreeSet<>();
        stringTreeSet.add("hello");
        stringTreeSet.add("ashu");
        stringTreeSet.add("ram");
        stringTreeSet.add("ball");
        stringTreeSet.add("king");
        stringTreeSet.add("cat");
        stringTreeSet.add("giraffe");
        System.out.println(stringTreeSet);
        TreeSet<Float> floatTreeSet=new TreeSet<>(Collections.reverseOrder());
        floatTreeSet.add(3.2f);
        floatTreeSet.add(2.2f);
        floatTreeSet.add(8.2f);
        floatTreeSet.add(7.2f);
        floatTreeSet.add(1.2f);
        System.out.println(floatTreeSet);

    }


}
