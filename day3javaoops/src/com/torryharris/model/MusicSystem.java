package com.torryharris.model;

public class MusicSystem {
    private String name;
    private int noOfSpeakers;
    private boolean subWoofer;
    private float lcdScreenSize;

    public MusicSystem(String name, int noOfSpeakers, boolean subWoofer, float lcdScreenSize) {
        this.name = name;
        this.noOfSpeakers = noOfSpeakers;
        this.subWoofer = subWoofer;
        this.lcdScreenSize = lcdScreenSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfSpeakers() {
        return noOfSpeakers;
    }

    public void setNoOfSpeakers(int noOfSpeakers) {
        this.noOfSpeakers = noOfSpeakers;
    }

    public boolean isSubWoofer() {
        return subWoofer;
    }

    public void setSubWoofer(boolean subWoofer) {
        this.subWoofer = subWoofer;
    }

    public float getLcdScreenSize() {
        return lcdScreenSize;
    }

    public void setLcdScreenSize(float lcdScreenSize) {
        this.lcdScreenSize = lcdScreenSize;
    }
}
