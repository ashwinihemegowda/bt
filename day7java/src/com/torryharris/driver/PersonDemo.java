package com.torryharris.driver;


import com.torryharris.comparator.PersonNameComparator;
import com.torryharris.model.Person;

import java.util.ArrayList;
import java.util.Iterator;

public class PersonDemo {
    public static void main(String[] args) {
        Person p1=new Person(12345678912l,"Ravi","Karnataka","Teacher");
        Person p2=new Person(85674523451l,"sita","AP","Manager");
        Person p3=new Person(76589676778l,"Radha","UP","Clerk");
        Person p4=new Person(65745652390l,"sudha","Tamilnadu","Student");
        Person p5=new Person(56735772627l,"Ashu","Madhyapradesh","Lead");
        Person p6=new Person(23456672673l,"Siri","Delhi","HR");
        ArrayList<Person>personList=new ArrayList<>();
        personList.add(p1);
        personList.add(p3);
        personList.add(p4);
        personList.add(p5);
        personList.add(p6);
        personList.add(1,p2);
        System.out.println(personList);
        Iterator<Person>personIterator=personList.iterator();
        while(personIterator.hasNext())
        {
            System.out.println(personIterator.next());
        }
        System.out.println("After sorting");
        personList.sort(null);
        personIterator=personList.iterator();
        while(personIterator.hasNext())
        {
            System.out.println(personIterator.next());
        }
        System.out.println();
        System.out.println("third party sorting");
        personList.sort(new PersonNameComparator());
        personIterator=personList.iterator();
        while(personIterator.hasNext())
        {
            System.out.println(personIterator.next());
        }






    }
}
