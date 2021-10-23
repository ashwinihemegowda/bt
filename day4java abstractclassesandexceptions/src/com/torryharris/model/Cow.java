package com.torryharris.model;

public class Cow implements Mammal{
    @Override
    public void feed() {
        System.out.println("Cow is feeding its calf");
    }

    @Override
    public void eat() {
        System.out.println("Cow is eating grass");
    }
}
