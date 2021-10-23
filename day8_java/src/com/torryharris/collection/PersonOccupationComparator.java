package com.torryharris.collection;

import com.torryharris.model.Person;

import java.util.Comparator;

public class PersonOccupationComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getOccupation().compareTo(o2.getOccupation());
    }
}
