package com.torryharris.files;

import com.torryharris.model.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

public class PersonDeserializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis=new FileInputStream("people.txt");
        ObjectInputStream peopleinputstream=new ObjectInputStream(fis);
        Person person;
        ArrayList<Person>people=new ArrayList<>();

        try{
            while(true)
            {
                person=(Person)peopleinputstream.readObject();
                people.add(person);
            }
        }catch(EOFException ex)
        {

        }
        System.out.println("People details are:");
        for(Person p:people)
        {
            System.out.println(p);
        }
        System.out.println();
        System.out.println("after sorting");
        people.sort(null);
        for(Person p:people)
        {
            System.out.println(p);
        }

    }
}
