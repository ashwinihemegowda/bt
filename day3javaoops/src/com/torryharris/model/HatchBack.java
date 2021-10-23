package com.torryharris.model;

public class HatchBack extends Car {
    String steeringType;

    public HatchBack(String fuelType, int engineCapacity, float power, int noOfGears, String name, Tyre tyre, MusicSystem mus, String steeringType) {
        super(fuelType, engineCapacity, power, noOfGears, name, tyre, mus);
        this.steeringType = steeringType;
    }

    public String getSteeringType() {
        return steeringType;
    }

    public void setSteeringType(String steeringType) {
        this.steeringType = steeringType;
    }
    public void displayHatchBackFeatures()
    {
        displayFeatures();
        System.out.println("steering type-->"+steeringType);
    }
}

