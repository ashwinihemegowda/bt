package com.torryharris.model;

public class Bat implements Mammal,Bird{
    @Override
    public void fly() {
        System.out.println("Bat is flying in Caves");
    }

    @Override
    public void feed() {
        System.out.println("Bat is eating small insects/fruits");

    }

    @Override
    public void eat() {
        System.out.println("Bat is feeding its child");

    }
}
