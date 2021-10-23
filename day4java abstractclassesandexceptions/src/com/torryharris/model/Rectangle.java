package com.torryharris.model;

public class Rectangle extends shape{
    private int length;
    private int height;

    public Rectangle(int length, int height) {
        this.length = length;
        this.height = height;
        setNoOfSides(4);
    }

    @Override
    public void area() {
        System.out.println("Area of Rectangle is "+(length*height));
    }
}
