package com.torryharris.model;

public class Triangle extends shape{
    private int height;
    private int length;

    public Triangle(int height, int length) {
        this.height = height;
        this.length = length;
        setNoOfSides(3);
    }


    @Override
    public void area() {
        System.out.println("Area of Triangle is "+(length*height/2));

    }
}
