package com.torryharris.model;

public class Sedon extends Car{
    int bootSpace;

    public Sedon(String fuelType, int engineCapacity, float power, int noOfGears, String name,
                 Tyre tyre, MusicSystem mus, int bootSpace) {
        super(fuelType, engineCapacity, power, noOfGears, name, tyre, mus);
        this.bootSpace = bootSpace;
    }

    public int getBootSpace() {
        return bootSpace;
    }

    public void setBootSpace(int bootSpace) {
        this.bootSpace = bootSpace;
    }
    public void displaySedon()
    {
       displayFeatures();
        System.out.println("Bootspace is : "+bootSpace);
    }

}
