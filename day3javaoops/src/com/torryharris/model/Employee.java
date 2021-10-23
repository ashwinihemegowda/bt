package com.torryharris.model;

public class Employee {
    private String name;
    private int empId;
    private String designation;
    private float salary;

    public Employee() {
    }

    public Employee(String name, int empId, String designation, float salary) {
        this.name = name;
        this.empId = empId;
        this.designation = designation;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", empId=" + empId +
                ", designation='" + designation + '\'' +
                ", salary=" + salary ;
    }
}
