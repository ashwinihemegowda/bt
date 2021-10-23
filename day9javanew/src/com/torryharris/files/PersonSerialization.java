package com.torryharris.files;

import com.torryharris.model.Person;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class PersonSerialization {
    public static void main(String[] args) throws IOException {
        Person p1=new Person(1001,"ram","Lawyer","Bangalore");
        Person p2=new Person(1005,"sam","Teacher","Mangalore");
        Person p3=new Person(1006,"siya","Student","AP");
        Person p4=new Person(1002,"ashu","Austranaut","UP");
        Person p5=new Person(1008,"siri","Doctor","MP");
        Person p6=new Person(1003,"bindu","Lawyer","Telangana");
        ArrayList<Person>personArrayList=new ArrayList<>();
        FileOutputStream fos=new FileOutputStream("people.txt");
        ObjectOutputStream personoutputstream=new ObjectOutputStream(fos);
        personoutputstream.writeObject(p1);
        personoutputstream.writeObject(p2);
        personoutputstream.writeObject(p3);
        personoutputstream.writeObject(p4);
        personoutputstream.writeObject(p5);
        personoutputstream.writeObject(p6);
        //personoutputstream.writeObject(personArrayList);
        personoutputstream.flush();
        personoutputstream.close();
        fos.close();


    }
}
