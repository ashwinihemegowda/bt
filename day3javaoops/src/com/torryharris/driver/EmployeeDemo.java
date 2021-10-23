package com.torryharris.driver;

import com.torryharris.model.Clerk;
import com.torryharris.model.Employee;
import com.torryharris.model.Lead;
import com.torryharris.model.Manager;

public class EmployeeDemo {
    public static void main(String[] args) {
        Manager e1=new Manager("Ram",001,"Manager",1000000.56f,"Java",2);
        Lead e2=new Lead("Sita",002,"Lead",5600000.56f,5);
        Clerk e3=new Clerk("Raj",003,"Clerk",100000.56f,"BCom");
        //Employee e4=new Employee("Lalitha",004,"Lead",3500000.56f);
        e1.callMeeting();
        System.out.println(e1);
        e2.standUpCall();
        System.out.println(e2);
        e3.generatePayRoll();
        System.out.println(e3);


    }
}
