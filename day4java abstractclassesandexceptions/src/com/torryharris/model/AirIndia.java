package com.torryharris.model;

public class AirIndia implements AirPlane{
    @Override
    public void fly() {
        System.out.println("AirIndia is flying");
    }

    @Override
    public void move() {
        System.out.println("AirIndia is taking off");

    }
}
