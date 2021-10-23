package com.torryharris.model;

import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);
        integerList.add(50);
        System.out.println(integerList);
        integerList.remove(2);
        System.out.println(integerList);
        integerList.add(2,100);
        integerList.sort(null);
        System.out.println(integerList);
        ArrayList<String>strList=new ArrayList<>();
        strList.add("hello");
        strList.add("ashu");
        strList.add("good");
        strList.add("bad");
        strList.add("cello");
        strList.sort(null);
        System.out.println(strList);
        strList.add(1,"what");
        strList.remove("bad");
        System.out.println(strList);
        //ArrayList containing different datatypes
        ArrayList<Object>olist=new ArrayList<>();
        olist.add(10);
        olist.add(10.567f);
        olist.add(10.5656565);
        olist.add("Hello");
        olist.add(true);
        System.out.println(olist);
        for(Object object:olist)
        {
            System.out.println(object);
        }

    }
}
