package com.torryharris.driver;

import com.torryharris.model.Rectangle;
import com.torryharris.model.Triangle;
import com.torryharris.model.shape;

import java.util.Scanner;

public class ShapeDemo {
    public static void main(String[] args) {
        Triangle triangle=new Triangle(20,10);
        triangle.area();

        shape Shape=new Triangle(20,10);
        Shape.area();
        System.out.println("No. of sides in RECTANGLE is : "+Shape.getNoOfSides());
        Shape=new Rectangle(10,20);
        System.out.println("No. of sides in triangle is : "+Shape.getNoOfSides());
        Shape.area();
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char c=str.charAt(0);
        System.out.println(c);
    }
}
