package com.torryharris.collection;

import com.torryharris.model.Person;

import java.util.HashSet;

public class PersonHashSetDemo {
    public static void main(String[] args) {
        Person p1 = new Person(1001, "Ram", "Business", "Bangalore");
        Person p2 = new Person(1003, "Ashu", "Clerk", "Yelanka");
        Person p3 = new Person(1008, "Charu", "Astraunaut", "Madhur");
        Person p4 = new Person(1005, "Bindu", "Lawyer", "Chennai");
        Person p5 = new Person(1002, "Sindhu", "Doctor", "AndhraPradesh");
        Person p6 = new Person(1006, "Manu", "Business", "UP");
        Person p7 = new Person(1006, "Manu", "Teacher", "SP");
        HashSet<Person> personHashSet = new HashSet<>();
        personHashSet.add(p1);
        personHashSet.add(p2);
        personHashSet.add(p3);
        personHashSet.add(p4);
        personHashSet.add(p5);
        personHashSet.add(p6);
        for(Person p:personHashSet)
        {
            System.out.println(p);
        }
        System.out.println(p6.equals(p7));





    }
}
