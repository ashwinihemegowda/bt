package com.torryharris.model;

public class Branches extends College{
    private String branchName;
    private int branchId;

    public Branches(String collegeName, int collegeId, String place, String branchName, int branchId) {
        super(collegeName, collegeId, place);
        this.branchName = branchName;
        this.branchId = branchId;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }
}
