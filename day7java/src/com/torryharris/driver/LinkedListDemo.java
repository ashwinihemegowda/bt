package com.torryharris.driver;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> strList=new LinkedList<>();
        strList.add("Hello");
        strList.add("Ashu");
        strList.add("Ram");
        strList.add("Rani");
        System.out.println(strList);
        String [] name={"raj","akbar","anthony","leela"};
        strList.addAll(Arrays.asList(name));
        System.out.println(strList);
        LinkedList<String>new1=new LinkedList<>();
        new1.add("123");
        new1.add("456");
        strList.addAll(new1);
        System.out.println(strList);
        //stack
        Stack<Integer> intStack=new Stack<>();
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);
        intStack.push(40);
        intStack.push(50);
        System.out.println(intStack);
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack.peek());

    }
}
