package com.torryharris.model;

public class Insurance {
    private String insName;
    private int insID;
    private int sum;
    private String insType;

    public Insurance(String insName, int insID, int sum, String insType) {
        this.insName = insName;
        this.insID = insID;
        this.sum = sum;
        this.insType = insType;
    }

    public String getInsName() {
        return insName;
    }

    public void setInsName(String insName) {
        this.insName = insName;
    }

    public int getInsID() {
        return insID;
    }

    public void setInsID(int insID) {
        this.insID = insID;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getInsType() {
        return insType;
    }

    public void setInsType(String insType) {
        this.insType = insType;
    }

    @Override
    public String toString() {
        return "Insurance{" +
                "insName='" + insName + '\'' +
                ", insID=" + insID +
                ", sum=" + sum +
                ", insType='" + insType + '\'' +
                '}';
    }
}
