package com.torryharris.driver;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        String s1="abcd";
        s1.concat("efg");
        String s2=new String("efgh");
        Scanner sc= new Scanner(System.in);
        String s3=sc.next();
        String s4=s1.concat("efg");
        System.out.println(s1+" "+s1.hashCode());
        System.out.println(s2+" "+s2.hashCode());
        System.out.println(s3+" "+s3.hashCode());
        System.out.println(s4+" "+s4.hashCode());


    }
}
