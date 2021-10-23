package com.torryharris.collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String>Students=new HashMap<>();
        Students.put(1001,"Ram");
        Students.put(1002,"Radha");
        Students.put(1003,"Krish");
        Students.put(1004,"Sita");
        Students.put(1005,"Leela");
        System.out.println(Students);
        for(Integer key:Students.keySet())
        {
            System.out.println(key+"=>"+Students.get(key));
        }
        for(Map.Entry<Integer,String>student:Students.entrySet())
        {
            System.out.println("Key:"+student.getKey()+" Value:"+student.getValue());
        }
    }
}
