package com.torryharris.collection;

import com.torryharris.comparator.PersonNameComparator;
import com.torryharris.model.Person;


import java.util.Iterator;
import java.util.TreeSet;

public class PersonTreeSetDemo {
    public static void main(String[] args) {
        Person p1=new Person(1001,"Ram","Business","Bangalore");
        Person p2=new Person(1003,"Ashu","Clerk","Yelanka");
        Person p3=new Person(1008,"Charu","Astraunaut","Madhur");
        Person p4=new Person(1005,"Bindu","Lawyer","Chennai");
        Person p5=new Person(1002,"Sindhu","Doctor","AndhraPradesh");
        Person p6=new Person(1006,"Manu","Business","UP");
        TreeSet<Person>people=new TreeSet<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);
        people.add(p6);

        Iterator<Person> iterator= people.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        TreeSet<Person>people1=new TreeSet<>(new PersonNameComparator());
        people1.add(p1);
        people1.add(p2);
        people1.add(p3);
        people1.add(p4);
        people1.add(p5);
        people1.add(p6);

        System.out.println();
        System.out.println("Sorting by name");
        for(Person p:people1)
        {
            System.out.println(p);
        }
        TreeSet<Person>treeSetByOccupation=new TreeSet<>(new PersonOccupationComparator());
        treeSetByOccupation.add(p1);
        treeSetByOccupation.add(p2);
        treeSetByOccupation.add(p3);
        treeSetByOccupation.add(p4);
        treeSetByOccupation.add(p5);
        treeSetByOccupation.add(p6);
        System.out.println();
        System.out.println("Sorting by occupation");
        for(Person p:treeSetByOccupation)
        {
            System.out.println(p);
        }
        TreeSet<Person>treeSetByCity=new TreeSet<>(new PersonCityComparator());
        treeSetByCity.add(p1);
        treeSetByCity.add(p2);
        treeSetByCity.add(p3);
        treeSetByCity.add(p4);
        treeSetByCity.add(p5);
        treeSetByCity.add(p6);
        treeSetByCity.remove(p6);

        System.out.println();
        System.out.println("sorting by city");
        for(Person p:treeSetByCity)
        {
            if(p.getOccupation().equals("Business"))
            System.out.println(p);
        }
        System.out.println(treeSetByCity.comparator());







    }
}
