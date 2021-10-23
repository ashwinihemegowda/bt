package com.torryharris.collection;

import com.torryharris.model.Car;

import java.util.*;

public class CarCollectionsDemo {
    public static void main(String[] args) {
        Car c1=new Car(1001,"Swift","Diesel",80.5f);
        Car c2=new Car(1005,"Maruthi","Diesel",82.5f);
        Car c3=new Car(1006,"Omni","Petrol",70.5f);
        Car c4=new Car(1003,"Swift","Petrol",85.5f);
        Car c5=new Car(1008,"Innova","Diesel",90.5f);
        ArrayList<Car>cars=new ArrayList<>();
        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        cars.add(c4);
        cars.add(c5);
        System.out.println("Displaying car details");
        Iterator<Car>carIterator=cars.iterator();
        while(carIterator.hasNext())
        {
            System.out.println(carIterator.next());
        }
        TreeSet<Car>carTreeSet=new TreeSet<>();
        carTreeSet.add(c1);
        carTreeSet.add(c2);
        carTreeSet.add(c3);
        carTreeSet.add(c4);
        carTreeSet.add(c5);
        System.out.println();
        System.out.println("sorting on power");
        for(Car c:carTreeSet)
        {
            System.out.println(c);
        }
        TreeMap<String,Car>carTreeMap=new TreeMap<>();
        carTreeMap.put(c1.getCarName(),c1);
        carTreeMap.put(c2.getCarName(),c2);
        carTreeMap.put(c3.getCarName(),c3);
        carTreeMap.put(c4.getCarName(),c4);
        carTreeMap.put(c5.getCarName(),c5);
        System.out.println();
        System.out.println("Uniguely displaying names of car");
        for(Map.Entry<String,Car>entry:carTreeMap.entrySet())
        {
            System.out.println("Key:"+entry.getKey()+" value:"+entry.getValue());
        }

    }
}
