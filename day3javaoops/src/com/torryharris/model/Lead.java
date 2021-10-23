package com.torryharris.model;

public class Lead extends Employee{
    private int teamSize;

    public Lead(String name, int empId, String designation, float salary, int teamSize) {
        super(name, empId, designation, salary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
    public void standUpCall()
    {
        System.out.println("Stand up call is organized by lead "+getName());
    }

    @Override
    public String toString() {
        return "Lead{" +super.toString()+
                ", teamSize=" + teamSize +'}';
    }
}
