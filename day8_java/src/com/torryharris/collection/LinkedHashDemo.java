package com.torryharris.collection;

import com.torryharris.model.Person;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashDemo {
    public static void main(String[] args) {
        LinkedList<Person>linkedList=new LinkedList<>();
        Person p1 = new Person(1001, "Ram", "Business", "Bangalore");
        Person p2 = new Person(1003, "Ashu", "Clerk", "Yelanka");
        Person p3 = new Person(1008, "Charu", "Astraunaut", "Madhur");
        Person p4 = new Person(1005, "Bindu", "Lawyer", "Chennai");
        Person p5 = new Person(1002, "Sindhu", "Doctor", "AndhraPradesh");
        Person p6 = new Person(1006, "Manu", "Business", "UP");
        linkedList.add(p1);
        linkedList.add(p2);
        linkedList.add(p3);
        linkedList.add(p4);
        linkedList.add(p5);
        linkedList.add(p6);
        for(Person p:linkedList)
        {
            System.out.println(p);
        }
        LinkedHashSet<Integer>integers=new LinkedHashSet<>();
        integers.add(10);
        integers.add(20);
        integers.add(30);
        integers.add(40);
        System.out.println(integers);
    }
}
