package com.torryharris.collection;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String>stringHashSet=new HashSet<>();
        stringHashSet.add("Hello");
        stringHashSet.add("abcd");
        stringHashSet.add("efgh");
        stringHashSet.add("ijkl");
        stringHashSet.add("");
        stringHashSet.add("Hello");
        stringHashSet.add(null);
        System.out.println(stringHashSet);
        HashSet<Integer>integerHashSet=new HashSet<>();
        integerHashSet.add(10);
        integerHashSet.add(20);
        integerHashSet.add(30);
        integerHashSet.add(40);
        integerHashSet.add(50);
        System.out.println(integerHashSet);
        HashSet<Float>floatHashSet=new HashSet<>();
        floatHashSet.add(45.2f);
        floatHashSet.add(44.2f);
        floatHashSet.add(43.2f);
        floatHashSet.add(42.2f);
        floatHashSet.add(41.2f);
        System.out.println(floatHashSet.contains(41.5f));
        System.out.println(floatHashSet);
        floatHashSet.remove(41.2f);
        System.out.println("after removing");
        System.out.println(floatHashSet);


    }
}
