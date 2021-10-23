package com.torryharris.model;

public class Suv extends Car{
    private String driveMode;
    private boolean sunRoof;

    public Suv(String fuelType, int engineCapacity, float power, int noOfGears, String name, Tyre tyre, MusicSystem mus,
               String driveMode, boolean sunRoof) {
        super(fuelType, engineCapacity, power, noOfGears, name, tyre, mus);
        this.driveMode = driveMode;
        this.sunRoof = sunRoof;
    }

    public String getDriveMode() {
        return driveMode;
    }

    public void setDriveMode(String driveMode) {
        this.driveMode = driveMode;
    }

    public boolean isSunRoof() {
        return sunRoof;
    }

    public void setSunRoof(boolean sunRoof) {
        this.sunRoof = sunRoof;
    }
    public void displaySuv()
    {
        displayFeatures();
        System.out.println("Drive mode is "+driveMode);
        System.out.println("Is SunRoof Present"+sunRoof);

    }
}
