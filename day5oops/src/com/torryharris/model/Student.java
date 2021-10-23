package com.torryharris.model;

public class Student extends Branches{
    private String studentName;
    private String usn;



    public Student(String collegeName, int collegeId, String place, String branchName, int branchId, String studentName, String usn) {
        super(collegeName, collegeId, place, branchName, branchId);
        this.studentName = studentName;
        this.usn = usn;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public void display()
    {
        System.out.println("Student name is "+getStudentName());
        System.out.println("Student USN is "+getUsn());
        System.out.println("Branch name is "+getBranchName());
        System.out.println("Branch Id is "+getBranchId());
        System.out.println("College name : "+getCollegeName());
        System.out.println("College id : "+getCollegeId());
        System.out.println("Place : "+getPlace());
    }

    public String getUsn() {
        return usn;
    }

    public void setUsn(String usn) {
        this.usn = usn;
    }
}
