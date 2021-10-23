package com.torryharris.collection;

import com.torryharris.model.Car;
import com.torryharris.model.Person;

import java.util.Map;
import java.util.TreeMap;

public class PersonTreeMapDemo {
    public static void main(String[] args) {
        Person p1=new Person(1001,"Ram","Business","Bangalore");
        Person p2=new Person(1003,"Ashu","Clerk","Yelanka");
        Person p3=new Person(1008,"Charu","Astraunaut","Madhur");
        Person p4=new Person(1005,"Bindu","Lawyer","Chennai");
        Person p5=new Person(1002,"Sindhu","Doctor","AndhraPradesh");
        Person p6=new Person(1006,"Manu","Business","UP");
        Person p7=new Person(1001,"Ram","Business","Bangalore");
        TreeMap<Integer,Person>integerPersonTreeMap=new TreeMap<>();
        integerPersonTreeMap.put(p1.getPersonId(),p1);
        integerPersonTreeMap.put(p2.getPersonId(),p2);
        integerPersonTreeMap.put(p3.getPersonId(),p3);
        integerPersonTreeMap.put(p4.getPersonId(),p4);
        integerPersonTreeMap.put(p5.getPersonId(),p5);
        integerPersonTreeMap.put(p6.getPersonId(),p6);
        integerPersonTreeMap.put(p7.getPersonId(),p7);
        System.out.println();
        for(Map.Entry<Integer, Person>entry:integerPersonTreeMap.entrySet())
        {
            System.out.println("Key:"+entry.getKey()+" value:"+entry.getValue());
        }
        TreeMap<Person,Integer>integerTreeMap=new TreeMap<>();
        integerTreeMap.put(p1,p1.getPersonId());
        integerTreeMap.put(p2,p2.getPersonId());
        integerTreeMap.put(p3,p3.getPersonId());
        integerTreeMap.put(p4,p4.getPersonId());
        integerTreeMap.put(p5,p5.getPersonId());
        integerTreeMap.put(p6,p6.getPersonId());
        integerTreeMap.put(p7,p7.getPersonId());
        System.out.println();
        System.out.println("using object as key");
        for(Map.Entry<Person,Integer>entry:integerTreeMap.entrySet())
        {
            System.out.println("Key:"+entry.getKey()+" value:"+entry.getValue());
        }


    }
}
