package com.torryharris.collection;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String,Integer>stringIntegerTreeMap=new TreeMap<>();
        stringIntegerTreeMap.put("Monday",1);
        stringIntegerTreeMap.put("Sunday",7);
        stringIntegerTreeMap.put("Saturday",6);
        stringIntegerTreeMap.put("Tuesday",2);
        stringIntegerTreeMap.put("Wednesday",3);
        System.out.println(stringIntegerTreeMap);
    }
}
